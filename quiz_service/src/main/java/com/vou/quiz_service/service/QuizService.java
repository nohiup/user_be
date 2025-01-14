package com.vou.quiz_service.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.type.DateTime;
import com.vou.quiz_service.event.QuizWsHandler;
import com.vou.quiz_service.model.Question;
import com.vou.quiz_service.repository.QuestionRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;

import java.time.Instant;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Component
public class QuizService {
    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private final QuizWsHandler quizWsHandler;

    private static final int MAX_QUESTIONS = 5;
    private int counter = 0;

    private int currentIndex =0;
    private boolean startSendingMessage = false;
    private final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

    //    private final SimpMessagingTemplate messagingTemplate;
    @Autowired
    public QuizService(QuizWsHandler quizWsHandler) {
        this.quizWsHandler = quizWsHandler;
    }

    // Hàm khởi chạy trì hoãn
    @PostConstruct
    public void initializeDelayedStart() {
        executorService.scheduleAtFixedRate(() -> {
            try {
                long size = 0L;
                // Gửi số lượng người chơi từ Redis
                Set<String> keys = quizWsHandler.getRedisTemplate().keys("*");
                size = keys.size();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, 0, 5, TimeUnit.SECONDS);

        // Chuyển trạng thái sau 30 giây
        Executors.newSingleThreadScheduledExecutor().schedule(() -> {
            startSendingMessage = true; // Bật trạng thái gửi quiz
            executorService.shutdown(); // Dừng task gửi số lượng người chơi
            System.out.println("Event started");
        }, 30, TimeUnit.SECONDS);

    }

    @Scheduled(fixedRate = 5000) //temp 3s
    public void sendQuizToClient() {
        if (!startSendingMessage) {
            return;
        }
        if (counter >= MAX_QUESTIONS) {
            quizWsHandler.broadcastMessage("finish");
            return;
        }
        List<Question> questions = this.getAllQuestions();


        Question quizMessage = questions.get(currentIndex);
        currentIndex ++;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            quizWsHandler.broadcastMessage(objectMapper.writeValueAsString(quizMessage));
            this.counter++;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }


    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Question getQuestionById(Long id) {
        return questionRepository.findById(id).orElse(null);
    }
}


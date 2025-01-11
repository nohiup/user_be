package com.vou.quiz_service.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vou.quiz_service.event.QuizWsHandler;
import com.vou.quiz_service.model.Question;
import com.vou.quiz_service.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class QuizService {
    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private final QuizWsHandler quizWsHandler;

//    private final SimpMessagingTemplate messagingTemplate;
    @Autowired
    public QuizService(QuizWsHandler quizWsHandler) {
        this.quizWsHandler = quizWsHandler;
    }

   @Scheduled(fixedRate = 3000) //temp 3s
   public void sendQuizToClient() {
       List<Question> questions = this.getAllQuestions();

       Question quizMessage = questions.get(0);
       ObjectMapper objectMapper = new ObjectMapper();
       try {
           quizWsHandler.broadcastMessage(objectMapper.writeValueAsString(quizMessage));
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

package com.vou.quiz_service.controller;

import com.vou.quiz_service.model.Question;
import com.vou.quiz_service.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class QuizController {
    @Autowired
    private QuizService quizService;

    private final SimpMessagingTemplate messagingTemplate;

    public QuizController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }
    @GetMapping("/questions")
    public List<Question> getQuestions() {
        return quizService.getAllQuestions();
    }
    // Xử lý sự kiện chung, tên sự kiện được truyền vào từ client
    @MessageMapping("/event")
    public void handleEvent(String eventMessage, String eventName) {
        // Xử lý logic sự kiện (có thể sử dụng eventName để phân biệt các sự kiện)
        System.out.println("Received event: " + eventName + " with message: " + eventMessage);

        // Gửi thông điệp đến topic tương ứng với tên sự kiện (dynamically)
        String destination = "/topic/" + eventName;  // Dynamic topic tên sự kiện
        messagingTemplate.convertAndSend(destination, eventMessage);
    }


    @MessageMapping("/answer")
    @SendTo("/topic/results")
    public boolean isCorrectAnswer(String result) {
        // Giả sử client gửi lại kết quả trả lời đúng/sai
        return "correct".equals(result);
    }
}

package com.vou.quiz_service.service;

import com.vou.quiz_service.model.Question;
import com.vou.quiz_service.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    private QuestionRepository questionRepository;

    private final SimpMessagingTemplate messagingTemplate;

    @Autowired
    public QuizService(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

   @Scheduled(fixedRate = 3000) //temp 3s
   public void sendQuizToClient() {
       List<Question> questions = this.getAllQuestions();

       Question quizMessage = questions.get(0);

       messagingTemplate.convertAndSend("/topic/quiz", quizMessage);
       System.out.println("Sent quiz: " + quizMessage.getQuestionText());
   }

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Question getQuestionById(Long id) {
        return questionRepository.findById(id).orElse(null);
    }


}

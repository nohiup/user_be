package com.vou.quiz_service.event;

import com.vou.quiz_service.repository.RabbitMQService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher {
    private final String eventId = "testId";
    @Autowired
    private RabbitMQService rabbitMQService;
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void createNewQueue(String eventId){
        String queueName = "quizQueue";
        String exchangeName = "quizExchange";
        String routingKey = "quiz." +eventId;

        rabbitMQService.addNewQueue(queueName, exchangeName, routingKey);
        System.out.println("Queue created successfully");
    }

    public void sendMessage(String routingKey, String message) {
        String exchangeName = "quizExchange";

        rabbitTemplate.convertAndSend(exchangeName, routingKey, message);
        System.out.println("Message sent to queue!");
    }


}
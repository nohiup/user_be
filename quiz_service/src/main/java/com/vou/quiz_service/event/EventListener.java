package com.vou.quiz_service.event;

import com.vou.quiz_service.repository.RabbitMQService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventListener {
    @Autowired
    private RabbitMQService rabbitMQService;
    @RabbitListener(id = "quizListener", autoStartup = "true", queues = {})
    public void onMessage(String message) {
        System.out.println("Received message: " + message);
    }

    public void addQueueToListener() {
        String listenerId = "dynamicListener";
        String queueName = "dynamicQueue";

        rabbitMQService.addQueueToListener(listenerId, queueName);
        System.out.println("Queue added to listener successfully!");
    }

    public void checkQueue() {
        String listenerId = "dynamicListener";
        String queueName = "dynamicQueue";

        Boolean exists = rabbitMQService.checkQueueExistOnListener(listenerId, queueName);
        System.out.println("Queue exists in listener: " + exists);
    }

    public void removeQueueFromListener() {
        String listenerId = "dynamicListener";
        String queueName = "dynamicQueue";

        rabbitMQService.removeQueueFromListener(listenerId, queueName);
        System.out.println("Queue removed from listener successfully!");
    }
}

package com.vou.quiz_service.repository;

public interface RabbitMQService {
    void addNewQueue(String queueName, String exchangeName, String routingKey);
    void addQueueToListener(String listenerId, String queueName);
    void removeQueueFromListener(String listenerId, String queueName);
    Boolean checkQueueExistOnListener(String listenerId, String queueName);

}

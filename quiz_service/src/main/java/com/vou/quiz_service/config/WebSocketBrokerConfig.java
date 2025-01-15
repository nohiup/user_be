package com.vou.quiz_service.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketBrokerConfig implements WebSocketMessageBrokerConfigurer {

    private static final Logger logger = LoggerFactory.getLogger(WebSocketConfig.class);
    @Autowired
    private Environment environmentConfig;

    //Complex message broker for rabbitMQ
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.setPreservePublishOrder(true)
                .setApplicationDestinationPrefixes("/app", "/exchange")
                .enableStompBrokerRelay("/queue", "/topic", "/exchange")
                .setRelayHost(environmentConfig.getProperty("rabbit.url"))
                .setRelayPort(Integer.parseInt(environmentConfig.getProperty("rabbit.port")))
                .setClientLogin(environmentConfig.getProperty("rabbit.user"))
                .setClientPasscode(environmentConfig.getProperty("rabbit.password"))
                .setUserDestinationBroadcast("/topic/unresolved-user")
                .setUserRegistryBroadcast("/topic/user-registry");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws"); // Endpoint kết nối WebSocket
    }


}

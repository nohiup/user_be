package com.vou.quiz_service.config;

import com.vou.quiz_service.event.QuizWsHandler;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.*;

//More basic websocket
@Configuration
//@EnableWebSocketMessageBroker
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    private static final Logger logger = LoggerFactory.getLogger(WebSocketConfig.class);
    @Autowired
    private Environment environmentConfig;

    @Autowired
    private QuizWsHandler quizWsHandler;
    @Autowired
    private StringRedisTemplate redisTemplate;

    //Complex message broker for rabbitMQ
//    @Override
//    public void configureMessageBroker(MessageBrokerRegistry registry) {
//        registry.setPreservePublishOrder(true)
//                .setApplicationDestinationPrefixes("/app", "/exchange")
//                .enableStompBrokerRelay("/queue", "/topic", "/exchange")
//                .setRelayHost(environmentConfig.getProperty("rabbit.url"))
//                .setRelayPort(Integer.parseInt(environmentConfig.getProperty("rabbit.port")))
//                .setClientLogin(environmentConfig.getProperty("rabbit.user"))
//                .setClientPasscode(environmentConfig.getProperty("rabbit.password"))
//                .setUserDestinationBroadcast("/topic/unresolved-user")
//                .setUserRegistryBroadcast("/topic/user-registry");
//    }

//    @Override
//    public void registerStompEndpoints(StompEndpointRegistry registry) {
//        registry.addEndpoint("/ws"); // Endpoint kết nối WebSocket
//    }


    @PostConstruct
    public void printWebSocketInfo() {
        logger.info("WebSocket server is up and running at ws://localhost:8082/ws");
    }



    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(quizWsHandler, "/quiz")
                .setAllowedOrigins("*");
    }


}
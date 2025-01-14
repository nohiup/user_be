package com.vou.quiz_service.event;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vou.quiz_service.model.Question;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.*;

import java.io.IOException;
import java.time.Instant;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Scope("singleton")
public class QuizWsHandler implements WebSocketHandler {

    private static final Logger logger = LoggerFactory.getLogger(QuizWsHandler.class);

    private final StringRedisTemplate redisTemplate;
    private final ConcurrentHashMap<String, WebSocketSession> sessions;
    private final Instant i = Instant.now();

    @Autowired
    public QuizWsHandler(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
        sessions = new ConcurrentHashMap<>();
        redisTemplate.getConnectionFactory().getConnection().flushDb(); //clear redisTemplate every re-run.
    }


    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {

        long message = i.getEpochSecond() + 30; //+30s wait room
        if (Instant.now().getEpochSecond() > message) {
            session.sendMessage(new TextMessage("Refuse"));
            session.close();
        }
        else {
            // In thông tin client khi kết nối thành công
            this.addSession(session.getId(), session);
            session.sendMessage(new TextMessage(String.valueOf(message)));
        }

       // Lưu session
        System.out.println("Client connected: " + sessions.size());
    }

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        String response = (String) message.getPayload();
        System.out.println(sessions.size());

        if (response.equals("incorrect")){
            String uid = redisTemplate.opsForValue().get(session.getId());
            logger.info("Remove user {} from the db", uid);
            redisTemplate.delete(session.getId());
        } else if (response.equals("correct")){
            String uid = redisTemplate.opsForValue().get(session.getId());
            logger.info("User {} answered correctly", uid);
        }
        //add user into redis
        else {
            redisTemplate.opsForValue().set(session.getId(), response);
            logger.info("User {} joined the room", response);
        }
        logger.info("Websocket Session: {}, received: {}", session.getId(), response);
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        logger.error("Exception: {} on session: {}", exception.getMessage(), session.getId());
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
        logger.info("Connection closed on session: {} with status: {}", session.getId(), closeStatus.getCode());
        redisTemplate.delete(session.getId());
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }

    // Gửi thông điệp đến tất cả các client
    public void broadcastMessage(String message) {
        Set<String> sessionKeys = redisTemplate.keys("*");
        if (!sessionKeys.isEmpty() && sessionKeys != null){
            sessionKeys.forEach(sessionKey ->{
                WebSocketSession s = sessions.get(sessionKey);
                if (s == null || !s.isOpen()) return;
                try {
                    s.sendMessage(new TextMessage(message));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }

    public synchronized void addSession(String sessionId, WebSocketSession session) {
        sessions.put(sessionId, session);
    }

    public StringRedisTemplate getRedisTemplate(){
        return this.redisTemplate;
    }


//    private void sendQuestion(WebSocketSession session, Question question) {
//        try {
//            ObjectMapper objectMapper = new ObjectMapper();
//            String json = objectMapper.writeValueAsString(question);
//            session.sendMessage(new TextMessage(json));
//        } catch (Exception e) {
//            e.printStackTrace();
//            logger.error(e.getMessage());
//        }
//    }
}
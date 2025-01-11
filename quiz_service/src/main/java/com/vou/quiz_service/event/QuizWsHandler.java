package com.vou.quiz_service.event;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.socket.*;

public class QuizWsHandler implements WebSocketHandler {

    private static final Logger logger = LoggerFactory.getLogger(QuizWsHandler.class);
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        // In thông tin client khi kết nối thành công
        System.out.println("Client connected: " + session.getRemoteAddress());
    }

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        String response = (String) message.getPayload();
        if (response.equals("correct")){
            session.sendMessage(new TextMessage("Connected: " + session + " - " +message.getPayload()));
        }
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        logger.error("Exception: {} on session: {}", exception.getMessage(), session.getId());
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
        logger.info("Connection closed on session: {} with status: {}", session.getId(), closeStatus.getCode());
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }


}
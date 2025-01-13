package com.vou.quiz_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PlayerService {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    private static final String EVENT_PLAYERS_KEY_PREFIX = "event_players:"; // Prefix for event-specific player list

    /**
     * Thêm người chơi vào danh sách của sự kiện
     * @param eventId
     * @param userId
     */
    public void addPlayerToEvent(String eventId, String userId) {
        String eventKey = EVENT_PLAYERS_KEY_PREFIX + eventId;
        redisTemplate.opsForSet().add(eventKey, userId);
    }

    /**
     * Xóa người chơi khỏi danh sách sự kiện khi trả lời sai
     * @param eventId
     * @param userId
     */
    public void removePlayerFromEvent(String eventId, String userId) {
        String eventKey = EVENT_PLAYERS_KEY_PREFIX + eventId;
        redisTemplate.opsForSet().remove(eventKey, userId);
    }

    /**
     * Lấy danh sách người chơi hiện tại trong sự kiện
     * @param eventId
     * @return danh sách người chơi
     */
    public Set<String> getPlayersInEvent(String eventId) {
        String eventKey = EVENT_PLAYERS_KEY_PREFIX + eventId;
        return redisTemplate.opsForSet().members(eventKey);
    }
}

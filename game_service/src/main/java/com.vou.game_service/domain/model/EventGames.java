package com.vou.game_service.domain.model;

import jakarta.persistence.*;

@Entity
public class EventGames {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment primary key
    private Long id;

    @Column(nullable = false)
    private Long eventId; // Foreign key referencing Events.event_id

    @Column(nullable = false)
    private Long gameId; // Foreign key referencing Games.game_id

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }
}

package com.vou.game_service.domain.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class EventGames {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment primary key
    private Long id;

    @Column(nullable = false)
    private Long eventId; // Foreign key referencing Events.event_id

    @Column(nullable = false)
    private UUID gameId; // Foreign key referencing Games.game_id

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

    public UUID getGameId() {
        return gameId;
    }

    public void setGameId(UUID gameId) {
        this.gameId = gameId;
    }
}

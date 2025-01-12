package com.vou.event_service.domain.model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
public class EventParticipants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Primary key for this table

    @Column(nullable = false)
    private Long eventId; // Foreign key referencing Events.event_id

    @Column(nullable = false)
    private UUID userId; // Foreign key referencing User.user_id

    @Column(nullable = false)
    private Integer playerCredit; // Foreign key referencing PlayCredits.credits_available

    @Column(nullable = false)
    private Integer quantityV;

    @Column(nullable = false)
    private Integer quantityO;

    @Column(nullable = false)
    private Integer quantityU;

    @Column(nullable = false)
    private Integer quantityC;

    @Column(nullable = false)
    private Integer quantityH;

    @Column(nullable = false)
    private Integer quantityE;

    @Column(nullable = false)
    private Integer quantityR;

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

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public Integer getPlayerCredit() {
        return playerCredit;
    }

    public void setPlayerCredit(Integer playerCredit) {
        this.playerCredit = playerCredit;
    }

    public Integer getQuantityV() {
        return quantityV;
    }

    public void setQuantityV(Integer quantityV) {
        this.quantityV = quantityV;
    }

    public Integer getQuantityO() {
        return quantityO;
    }

    public void setQuantityO(Integer quantityO) {
        this.quantityO = quantityO;
    }

    public Integer getQuantityU() {
        return quantityU;
    }

    public void setQuantityU(Integer quantityU) {
        this.quantityU = quantityU;
    }

    public Integer getQuantityC() {
        return quantityC;
    }

    public void setQuantityC(Integer quantityC) {
        this.quantityC = quantityC;
    }

    public Integer getQuantityH() {
        return quantityH;
    }

    public void setQuantityH(Integer quantityH) {
        this.quantityH = quantityH;
    }

    public Integer getQuantityE() {
        return quantityE;
    }

    public void setQuantityE(Integer quantityE) {
        this.quantityE = quantityE;
    }

    public Integer getQuantityR() {
        return quantityR;
    }

    public void setQuantityR(Integer quantityR) {
        this.quantityR = quantityR;
    }
}

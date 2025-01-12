package com.vou.event_service.domain.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
public class Voucher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String code;
    private String qr;
    private String image;
    private String price;
    private String description;

    @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private OffsetDateTime expired;

    private String status;

    @ManyToOne
    @JoinColumn(name = "event_id")
    @JsonBackReference  // Preventing infinite recursion
    private Event event;

    private Integer quantityV;
    private Integer quantityO;
    private Integer quantityU;
    private Integer quantityC;
    private Integer quantityH;
    private Integer quantityE;
    private Integer quantityR;

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

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getQr() {
        return qr;
    }

    public void setQr(String qr) {
        this.qr = qr;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OffsetDateTime getExpired() {
        return expired;
    }

    public void setExpired(OffsetDateTime expired) {
        this.expired = expired;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}

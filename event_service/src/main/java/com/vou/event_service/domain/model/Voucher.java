package com.vou.event_service.domain.model;

import com.google.type.DateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Voucher {
    @Id
    private UUID id;
    private String code;
    private String qr;
    private String image;
    private String price;
    private String description;
    private DateTime expired;
    private String status;

    public Voucher(UUID id, String code, String qr, String image, String price, String description, DateTime expired, String status) {
        this.id = id;
        this.code = code;
        this.qr = qr;
        this.image = image;
        this.price = price;
        this.description = description;
        this.expired = expired;
        this.status = status;
    }

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

    public DateTime getExpired() {
        return expired;
    }

    public void setExpired(DateTime expired) {
        this.expired = expired;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

package com.vou.user_service.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.awt.*;
import java.util.UUID;

@Entity
public class Brand{
    @Id
    private UUID id;
    private String name;
    private String phone;
    private String field;
    private Point address;
    private String status;

    public Brand(UUID id, String name, String phone, String field, Point address, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.field = field;
        this.address = address;
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Point getAddress() {
        return address;
    }

    public void setAddress(Point address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

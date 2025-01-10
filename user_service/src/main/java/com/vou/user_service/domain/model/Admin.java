package com.vou.user_service.domain.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Admin {
    @Id
    private UUID id;

    private String name;

    public Admin(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public Admin() {
    }

    // Getters

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
}

package com.vou.user_service.domain.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Admin extends BaseEntity{

    private String name;

    public Admin(String name) {
        this.name = name;
    }

    public Admin() {
    }

    // Getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.vou.user_be.domain.model;

import java.util.UUID;

public class LoginResponse {
    private String token;
    private UUID userId;

    public LoginResponse(String token, UUID userId) {
        this.token = token;
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }
}
package com.vou.user_be.adapter.in.web.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.vou.user_be.core.util.JsonUtil;

public class RegisterRequest {
    private String username;
    private String password;
    private String email;
    private String role;

    public RegisterRequest(String username, String password, String email, String role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }
    // Getters

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    // Setters

    public void setRole(String role) {
        this.role = role;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    //General methods

}

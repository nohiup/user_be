package com.vou.user_be.adapter.in.web.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.vou.user_be.core.util.JsonUtil;

public class RegisterRequest {
    private String fullName;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String role;

    public RegisterRequest(String name, String username, String password, String email, String role) {
        this.fullName = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public RegisterRequest fromJson(String json) {
        try {
            return JsonUtil.getMapper().readValue(json, RegisterRequest.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    // Getters
    public String getFullName() {
        return fullName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
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

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //General methods

}

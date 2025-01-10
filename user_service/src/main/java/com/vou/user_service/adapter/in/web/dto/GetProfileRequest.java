package com.vou.user_service.adapter.in.web.dto;

import lombok.Data;

@Data
public class GetProfileRequest {
    private String role; // user/brand

    public GetProfileRequest() {
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

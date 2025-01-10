package com.vou.user_service.adapter.in.web.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class UpdateProfileRequest {
    private String role; // user/brand
    private String avatar; // user-specific
    private String email;
    private String phoneNumber;
    private String facebookAccount; // user-specific
    private String gender; // user-specific
    private Date dob; // user-specific
    private String name; // brand-specific
    private String industry; // brand-specific
    private String address; // brand-specific
    private BigDecimal gpsLat; // brand-specific
    private BigDecimal gpsLong; // brand-specific

    public UpdateProfileRequest() {
    }

    public String getRole() {
        return role;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFacebookAccount() {
        return facebookAccount;
    }

    public String getGender() {
        return gender;
    }

    public Date getDob() {
        return dob;
    }

    public String getName() {
        return name;
    }

    public String getIndustry() {
        return industry;
    }

    public String getAddress() {
        return address;
    }

    public BigDecimal getGpsLat() {
        return gpsLat;
    }

    public BigDecimal getGpsLong() {
        return gpsLong;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

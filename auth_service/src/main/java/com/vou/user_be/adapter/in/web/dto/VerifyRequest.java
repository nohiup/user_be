package com.vou.user_be.adapter.in.web.dto;

public class VerifyRequest {
    String email;
    String otp;

    public VerifyRequest(String email, String code) {
        this.email = email;
        this.otp = code;
    }
    public VerifyRequest(){

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
}

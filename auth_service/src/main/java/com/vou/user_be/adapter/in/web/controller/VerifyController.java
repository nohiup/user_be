package com.vou.user_be.adapter.in.web.controller;


import com.vou.user_be.application.service.OtpServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api/verify")
public class VerifyController {
    @Autowired
    private OtpServices otpServices;

    // Endpoint gửi OTP qua email
    @PostMapping("/otp")
    public CompletableFuture<String> sendOtp(@RequestBody Map<String, String> payload) {
        String email = payload.get("email");
        System.out.println("sendOtp " + email);
        return otpServices.sendOtpEmail(email);
    }

//    @PostMapping("/otp")
//    public String sendOtp(@RequestBody Map<String, String> payload) {
//        String email = payload.get("email");
//        System.out.println("sendOtp " + email);
//        otpServices.sendOtpEmail(email);
//        return "Done " + email;
//    }
}

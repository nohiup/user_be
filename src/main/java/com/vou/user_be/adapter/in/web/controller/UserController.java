package com.vou.user_be.adapter.in.web.controller;

import com.vou.user_be.adapter.in.web.dto.LoginRequest;
import com.vou.user_be.adapter.in.web.dto.RegisterRequest;
import com.vou.user_be.adapter.in.web.dto.VerifyRequest;
import com.vou.user_be.application.service.AuthenticateService;
import com.vou.user_be.application.service.OtpServices;
import com.vou.user_be.application.service.UserService;
import com.vou.user_be.domain.model.JwtResponse;
import com.vou.user_be.domain.model.Users;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticateService authenticateService;


    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody RegisterRequest registerRequest) {
        try {
            // Đăng ký người dùng mới
            Users addedUser = userService.registerUser(registerRequest);
            // Return response status
            return ResponseEntity.ok(addedUser);
        } catch (Exception e) {
            // Trả về lỗi nếu có
            throw e;
        }
    }

    @PostMapping("/verify")
    public ResponseEntity<?> verifyUser(@RequestBody VerifyRequest verifyRequest){
        try {
            // Xác thực người dùng
            boolean isVerified = userService.verifyUser(verifyRequest.getEmail(), verifyRequest.getOtp());
            // Return response status
            return ResponseEntity.ok(Map.of("Verified", isVerified));
        } catch (Exception e) {
            // Trả về lỗi nếu có
            throw e;
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        String token = authenticateService.login(loginRequest.getEmail(), loginRequest.getPassword());
        return ResponseEntity.ok(new JwtResponse(token));
    }
}

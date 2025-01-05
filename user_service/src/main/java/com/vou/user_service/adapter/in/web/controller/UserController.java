package com.vou.user_service.adapter.in.web.controller;

import com.vou.user_service.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserController {
//    @Autowired
//    private UserService userService;
//
////    @PostMapping("/login")
////    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
////        String token = authenticateService.login(loginRequest.getEmail(), loginRequest.getPassword());
////        return ResponseEntity.ok(new JwtResponse(token));
////    }
}

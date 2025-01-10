package com.vou.user_service.adapter.in.web.controller;

import com.vou.user_service.adapter.in.web.dto.GetAllObjectRequest;
import com.vou.user_service.adapter.in.web.dto.GetProfileRequest;
import com.vou.user_service.adapter.in.web.dto.UpdateProfileRequest;
import com.vou.user_service.application.service.UserService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PutMapping("/{id}/profile")
    public ResponseEntity<?> updateProfile(@PathVariable String id, @RequestBody UpdateProfileRequest request) {
        try {
            userService.updateUserProfile(id, request);
            return ResponseEntity.ok().body(Map.of("message", "Profile updated successfully"));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatusCode.valueOf(400)).body(Map.of("message","Failed to update profile: " + e.getMessage()));
        } catch (Exception e) {
            return ResponseEntity.status(500).body(Map.of("message","An unexpected error occurred: " + e.getMessage()));
        }
    }

    @GetMapping("/{id}/profile")
    public ResponseEntity<?> getProfile(@PathVariable String id, @RequestBody GetProfileRequest request) {
        try {
            Object obj = userService.getProfile(id, request);
            return ResponseEntity.ok().body(obj);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatusCode.valueOf(400)).body(Map.of("message","Failed to get profile: " + e.getMessage()));
        } catch (Exception e) {
            return ResponseEntity.status(500).body(Map.of("message","An unexpected error occurred: " + e.getMessage()));
        }
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllObject(@RequestBody GetAllObjectRequest request) {
        try {
            Object obj = userService.getAllObject(request);
            return ResponseEntity.ok().body(obj);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatusCode.valueOf(400)).body(Map.of("message","Failed to get all object: " + e.getMessage()));
        } catch (Exception e) {
            return ResponseEntity.status(500).body(Map.of("message","An unexpected error occurred: " + e.getMessage()));
        }
    }
}

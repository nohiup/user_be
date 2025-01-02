package com.vou.user_be.domain.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String fullName;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String role;
    private boolean is_verified;


//    @PrePersist
//    public void generateId() {
//        if (id == null) {
//            this.id = generateCustomId();
//        }
//    }
//    private UUID generateCustomId() {
//        // Tạo ID chuỗi tùy chỉnh, ví dụ sử dụng UUID
//        return UUID.randomUUID();
//    }

    public Users(UUID id, String name, String username, String password, String email, String phone, String role) {
        this.id = id;
        this.fullName = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.role = role;
        this.is_verified = false;
    }

    public Users() {
    }

    // Getters
    public UUID getId() {
        return id;
    }

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

    public boolean getIs_verified() {
        return is_verified;
    }

    // Setters
    public void setId(UUID id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setIs_verified(boolean is_verified) {
        this.is_verified = is_verified;
    }
}

package com.vou.user_service.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import javax.annotation.Nullable;
import java.util.Date;
import java.util.UUID;

@Entity
public class User extends BaseEntity{
    @Nullable
    private String name;

    @Nullable
    private String avatar;

    @Nullable
    private String email;

    @Nullable
    private String phone;

    @Nullable
    private Date dob;

    @Nullable
    private String gender;

    @Nullable
    private String facebook;

    public User(@Nullable String name, @Nullable String avatar, @Nullable String email, @Nullable String phone, @Nullable Date dob, @Nullable String gender, @Nullable String facebook) {
        this.name = name;
        this.avatar = avatar;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
        this.gender = gender;
        this.facebook = facebook;
    }

    public User() {

    }

    @Nullable
    public String getEmail() {
        return email;
    }

    @Nullable
    public String getName() {
        return name;
    }

    @Nullable
    public String getAvatar() {
        return avatar;
    }

    @Nullable
    public Date getDob() {
        return dob;
    }

    @Nullable
    public String getFacebook() {
        return facebook;
    }

    @Nullable
    public String getGender() {
        return gender;
    }

    @Nullable
    public String getPhone() {
        return phone;
    }

    public void setName(@Nullable String name) {
        this.name = name;
    }

    public void setAvatar(@Nullable String avatar) {
        this.avatar = avatar;
    }

    public void setEmail(@Nullable String email) {
        this.email = email;
    }

    public void setPhone(@Nullable String phone) {
        this.phone = phone;
    }

    public void setDob(@Nullable Date dob) {
        this.dob = dob;
    }

    public void setGender(@Nullable String gender) {
        this.gender = gender;
    }

    public void setFacebook(@Nullable String facebook) {
        this.facebook = facebook;
    }
}

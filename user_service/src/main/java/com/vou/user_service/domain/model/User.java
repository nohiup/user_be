package com.vou.user_service.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class User {
    @Id
    private String id;
    private String name;
    private String phone;
    private Date birthday;
    private boolean male;
    private String facebook;

    public User(String id, String name, String phone, Date birthday, boolean male, String facebook) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.birthday = birthday;
        this.male = male;
        this.facebook = facebook;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }
}

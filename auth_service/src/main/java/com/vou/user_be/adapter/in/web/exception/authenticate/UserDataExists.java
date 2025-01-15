package com.vou.user_be.adapter.in.web.exception.authenticate;

public class UserDataExists extends RuntimeException {
    public UserDataExists(String message) {
        super(message);
    }
}

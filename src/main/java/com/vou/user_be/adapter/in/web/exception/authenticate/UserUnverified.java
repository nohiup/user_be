package com.vou.user_be.adapter.in.web.exception.authenticate;

public class UserUnverified extends RuntimeException {
    public UserUnverified(String message) {
        super(message);
    }
}

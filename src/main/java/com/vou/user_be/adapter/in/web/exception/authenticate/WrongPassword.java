package com.vou.user_be.adapter.in.web.exception.authenticate;

public class WrongPassword extends RuntimeException {
    public WrongPassword(String message) {
        super(message);
    }
}

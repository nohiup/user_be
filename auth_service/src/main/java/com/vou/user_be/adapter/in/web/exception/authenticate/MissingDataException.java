package com.vou.user_be.adapter.in.web.exception.authenticate;

public class MissingDataException extends RuntimeException {
    public MissingDataException(String message) {
        super(message);
    }
}

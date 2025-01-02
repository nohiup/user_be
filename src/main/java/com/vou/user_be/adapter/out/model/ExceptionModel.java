package com.vou.user_be.adapter.out.model;

public class ExceptionModel {
    private String error;
    private String message;

    public ExceptionModel(String error, String message) {
        this.error = error;
        this.message = message;
    }
}

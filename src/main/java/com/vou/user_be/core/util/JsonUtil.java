package com.vou.user_be.core.util;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    protected JsonUtil(){
    }

    public static ObjectMapper getMapper(){
        return objectMapper;
    }
}

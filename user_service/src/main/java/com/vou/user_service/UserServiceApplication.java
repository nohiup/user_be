package com.vou.user_service;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Objects;

@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceApplication {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure()
                .directory("user_service")
                .load();
        System.setProperty("DB_URL", Objects.requireNonNull(dotenv.get("DB_URL")));
        System.setProperty("DB_USERNAME", Objects.requireNonNull(dotenv.get("DB_USERNAME")));
        System.setProperty("DB_PASSWORD", Objects.requireNonNull(dotenv.get("DB_PASSWORD")));
        SpringApplication.run(UserServiceApplication.class, args);
        System.out.println("User Service is running");
    }
}

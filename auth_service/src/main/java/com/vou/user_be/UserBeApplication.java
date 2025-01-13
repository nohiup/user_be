package com.vou.user_be;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Objects;

@SpringBootApplication
@EnableDiscoveryClient
public class UserBeApplication {
	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure()
//				.directory("auth_service")
				.directory("./")
				.load();
		System.setProperty("DB_URL", Objects.requireNonNull(dotenv.get("DB_URL")));
		System.setProperty("DB_USERNAME", Objects.requireNonNull(dotenv.get("DB_USERNAME")));
		System.setProperty("DB_PASSWORD", Objects.requireNonNull(dotenv.get("DB_PASSWORD")));
		System.setProperty("SPRING_MAIL_USERNAME", Objects.requireNonNull(dotenv.get("SPRING_MAIL_USERNAME")));
		System.setProperty("SPRING_MAIL_PASSWORD", Objects.requireNonNull(dotenv.get("SPRING_MAIL_PASSWORD")));

		SpringApplication.run(UserBeApplication.class, args);
	}
}

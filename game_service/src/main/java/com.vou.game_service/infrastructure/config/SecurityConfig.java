package com.vou.game_service.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
        return http
                .authorizeExchange(exchanges -> exchanges
                        .pathMatchers("/api/games/**").permitAll() // Allow unrestricted access
                        .pathMatchers("/api/gameItems/**").permitAll()
                        .anyExchange().authenticated() // Secure other endpoints
                )
                .csrf().disable() // Optional: Disable CSRF for APIs
                .build();
    }
}


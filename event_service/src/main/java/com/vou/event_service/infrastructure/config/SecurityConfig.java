package com.vou.event_service.infrastructure.config;

import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.security.config.web.server.ServerHttpSecurity;
        import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.web.cors.CorsConfiguration;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
        return http
                .cors(cors -> cors.configurationSource(request -> {
                    CorsConfiguration config = new CorsConfiguration();
                    config.addAllowedOrigin("http://localhost:3000"); // Allow the frontend to make requests
                    config.addAllowedMethod("*"); // Allow all HTTP methods (GET, POST, etc.)
                    config.addAllowedHeader("*"); // Allow all headers
                    return config;
                }))
                .authorizeExchange(exchanges -> exchanges
                        .pathMatchers("/api/events/**").permitAll()
                        .pathMatchers("/api/eventParticipants/**").permitAll()// Allow unrestricted access
                        .pathMatchers("/api/userVouchers/**").permitAll()// Allow unrestricted access
                        .anyExchange().authenticated() // Secure other endpoints
                )
                .csrf().disable() // Optional: Disable CSRF for APIs
                .build();
    }
}


package com.vou.event_service.infrastructure.config;

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
                        .pathMatchers("/api/events/**").permitAll()
                        .pathMatchers("/api/eventParticipants/**").permitAll()// Allow unrestricted access
                        .pathMatchers("/api/userVouchers/**").permitAll()// Allow unrestricted access
                        .anyExchange().authenticated() // Secure other endpoints
                )
                .csrf().disable() // Optional: Disable CSRF for APIs
                .build();
    }
}


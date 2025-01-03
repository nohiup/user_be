package com.vou.user_be.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig{
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/user/login").permitAll()  // Cho phép truy cập miễn phí
                        .requestMatchers("/api/user/register").permitAll()
                        .requestMatchers("/api/verify/otp").permitAll()
                        .requestMatchers("/api/user/verify").permitAll()// Cho phép truy cập miễn phí
                        .anyRequest().authenticated());  // Yêu cầu xác thực cho các endpoint còn lại// Yêu cầu xác thực cho các endpoint còn lại
        return http.sessionManagement(ses -> ses.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .httpBasic(Customizer.withDefaults())
                .build();
    }
}

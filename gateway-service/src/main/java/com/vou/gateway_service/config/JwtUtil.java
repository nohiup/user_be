package com.vou.gateway_service.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Base64;
import java.util.Date;

@Component
public class JwtUtil {

    @Value("${jwt.secret}")
    private String secret;

    private Key secretKey;

    @PostConstruct
    public void init() {
        byte[] decodedSecret = Base64.getDecoder().decode(secret);
        this.secretKey = Keys.hmacShaKeyFor(decodedSecret);
    }

    // Lấy username từ token
    public String extractUsername(String token) {
        return getAllClaimsFromToken(token).getSubject();
    }

    // Lấy ID từ token
    public String extractId(String token) {
        return getAllClaimsFromToken(token).get("id", String.class);
    }

    // Lấy vai trò (role) từ token
    public String extractRole(String token) {
        return getAllClaimsFromToken(token).get("role", String.class);
    }


    public Claims getAllClaimsFromToken(String token) {
        System.out.println(Base64.getEncoder().encodeToString(secretKey.getEncoded()));
        return Jwts.parserBuilder().setSigningKey(secretKey).build().parseClaimsJws(token).getBody();
    }

    private boolean isTokenExpired(String token) {
        return this.getAllClaimsFromToken(token).getExpiration().before(new Date());
    }

    public boolean isInvalid(String token) {
        return this.isTokenExpired(token);
    }
}

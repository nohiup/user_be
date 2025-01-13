package com.vou.user_be.core.util;

import com.netflix.eureka.registry.ResponseCacheImpl;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Date;
import java.util.UUID;

@Component
public class JwtUtil {

    @Value("${jwt.secret}")
    private String secret;

    private Key secretKey;

    @PostConstruct
    public void init() {
        this.secretKey = Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));
    }
//    private final Key secretKey =Keys.secretKeyFor(SignatureAlgorithm.HS256);
    // Tạo JWT token
    public String generateToken(String username) {
        System.out.println("secretKey: " + Base64.getEncoder().encodeToString(secretKey.getEncoded()));
        return Jwts.builder()
                .setHeaderParam("typ", "JWT")
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 6000))  // Hết hạn sau 1 giờ
                .signWith(secretKey, SignatureAlgorithm.HS256)
                .compact();
    }

    // Lấy username từ JWT token
    public String extractUsername(String token) {
        return extractClaims(token).getSubject();
    }

    //Extract id from token
    public UUID extractId(String token){
        Claims claims = extractClaims(token);
        return UUID.fromString(claims.get("id", String.class));
    }

    // Trích xuất vai trò từ token
    public String extractRole(String token) {
        Claims claims = extractClaims(token);
        return claims.get("role", String.class);  // Lấy vai trò duy nhất từ payload của token
    }

    // Lấy các thông tin claims từ JWT token
    private Claims extractClaims(String token) {
        return Jwts.parser()
                .setSigningKey(secretKey)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    // Kiểm tra xem token có hết hạn chưa
    private boolean isTokenExpired(String token) {
        return extractClaims(token).getExpiration().before(new Date());
    }

    // Kiểm tra tính hợp lệ của token
    public boolean validateToken(String token, String username) {
        return (username.equals(extractUsername(token)) && !isTokenExpired(token));
    }
}

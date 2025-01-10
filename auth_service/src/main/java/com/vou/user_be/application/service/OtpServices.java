package com.vou.user_be.application.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@Service
public class OtpServices {

    private static final long OTP_EXPIRE_DURATION = 10;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Autowired
    private JavaMailSender emailSender;

    public CompletableFuture<String> sendOtpEmail(String email) {
        return CompletableFuture.supplyAsync(() -> {
            // Mã gửi email ở đây
            // Giả lập thời gian gửi email
            String otp = generateOtp();  // Tạo OTP ngẫu nhiên

            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(email);
            message.setSubject("VOU - OTP Code");
            message.setText("Your OTP code for register verification is: " + otp);

            emailSender.send(message);
            System.out.println("OTP sent to " + email);
            // Lưu OTP vào cơ sở dữ liệu hoặc Redis để xác thực sau này
            redisTemplate.opsForValue().set(email, otp, OTP_EXPIRE_DURATION, TimeUnit.MINUTES);
            return "OTP sent to " + email;
        });
    }

    public boolean verifyOtp(String email, String otp){
        redisTemplate.opsForValue().set("loda","hello world");
        System.out.println("Value of key loda: "+ redisTemplate.opsForValue().get("loda"));

        System.out.println(email + " " + otp);
        String storedOtp = (String) redisTemplate.opsForValue().get(email);
        System.out.println("Stored OTP: " + storedOtp + " | Received OTP: " + otp);
//        return true;
        return storedOtp.equals(otp);
    }

    // Hàm tạo OTP 6 chữ số ngẫu nhiên
    private String generateOtp() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000);  // OTP có 6 chữ số
        return String.valueOf(otp);
    }
}


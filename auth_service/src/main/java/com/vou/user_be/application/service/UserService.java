package com.vou.user_be.application.service;

import com.vou.user_be.adapter.in.web.dto.RegisterRequest;
import com.vou.user_be.adapter.in.web.exception.authenticate.MissingDataException;
import com.vou.user_be.adapter.in.web.exception.authenticate.UserDataExists;
import com.vou.user_be.adapter.out.persistence.UserRepository;
import com.vou.user_be.core.constant.AccountStatus;
import com.vou.user_be.domain.model.Auth;
import com.vou.user_be.infrastructure.security.CustomizedPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    private OtpServices otpServices;

    @Autowired
    private CustomizedPasswordEncoder passwordEncoder;

    public Auth registerUser(RegisterRequest registerRequest) {
        //Check email already exists from request
        if (userRepository.findByEmail(registerRequest.getEmail()).isPresent()) {
            Auth user = userRepository.findByEmail(registerRequest.getEmail()).get();
            if (user.getStatus().equals("verified")) {
                throw new UserDataExists("Email already exists");
            }
            else if (user.getStatus().equals(AccountStatus.getInstance().DISABLED)){
                //print banned
            }
            else {
                userRepository.delete(user);
            }
        }
        // Kiểm tra thông tin đã đầy đủ chưa, nếu chưa throw Exception
        if (registerRequest.getUsername() == null ||
                registerRequest.getPassword() == null || registerRequest.getEmail() == null) {
            throw new MissingDataException("Missing required fields");
        }

        try {
            otpServices.sendOtpEmail(registerRequest.getEmail());
        } catch (Exception e) {
            return null;
        }

        String encodedPassword = passwordEncoder.encode(registerRequest.getPassword());
        Auth newUser = new Auth();
        newUser.setUsername(registerRequest.getUsername());
        newUser.setPassword(encodedPassword);
        newUser.setEmail(registerRequest.getEmail());
        newUser.setRole(registerRequest.getRole());
        newUser.setStatus(AccountStatus.getInstance().PENDING);

        // Lưu vào database
        return userRepository.save(newUser);
    }

    public Auth verifyUser(String email, String otp){
        try {
            boolean isVerified = otpServices.verifyOtp(email, otp);
            if (!isVerified) {
                return null;
            }
            userRepository.updateStatus(email, AccountStatus.getInstance().VERIFIED);
            return userRepository.findByEmail(email).get();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

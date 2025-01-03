package com.vou.user_be.application.service.auth;

import com.vou.user_be.adapter.in.web.dto.RegisterRequest;
import com.vou.user_be.adapter.in.web.exception.authenticate.MissingDataException;
import com.vou.user_be.adapter.in.web.exception.authenticate.UserDataExists;
import com.vou.user_be.adapter.out.persistence.UserRepository;
import com.vou.user_be.domain.model.Users;
import com.vou.user_be.infrastructure.security.CustomizedPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    private OtpServices otpServices;

    @Autowired
    private CustomizedPasswordEncoder passwordEncoder;

    public Users registerUser(RegisterRequest registerRequest) {
        //Check email already exists from request
        if (userRepository.findByEmail(registerRequest.getEmail()).isPresent()) {
            Users user = userRepository.findByEmail(registerRequest.getEmail()).get();
            if (user.getIs_verified()) {
                throw new UserDataExists("Email already exists");
            }
            else {
                userRepository.delete(user);
            }
        }
        // Kiểm tra thông tin đã đầy đủ chưa, nếu chưa throw Exception
        if (registerRequest.getFullName() == null || registerRequest.getUsername() == null ||
                registerRequest.getPassword() == null || registerRequest.getEmail() == null ||
                registerRequest.getRole() == null) {
            throw new MissingDataException("Missing required fields");
        }

        try {
            otpServices.sendOtpEmail(registerRequest.getEmail());
        } catch (Exception e) {
            return null;
        }

        String encodedPassword = passwordEncoder.encode(registerRequest.getPassword());
        Users newUser = new Users();
        newUser.setFullName(registerRequest.getFullName());
        newUser.setUsername(registerRequest.getUsername());
        newUser.setPassword(encodedPassword);
        newUser.setEmail(registerRequest.getEmail());
        newUser.setPhone(registerRequest.getPhone());
        newUser.setRole(registerRequest.getRole());
        newUser.setIs_verified(false);

        // Lưu vào database
        return userRepository.save(newUser);
    }

    public boolean verifyUser(String email, String otp){
        try {
            boolean isVerified = otpServices.verifyOtp(email, otp);
            userRepository.updateVerifiedStatus(email, isVerified);
            return isVerified;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

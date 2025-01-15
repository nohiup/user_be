package com.vou.user_be.application.service;

import com.vou.user_be.adapter.in.web.exception.UserNotFoundException;
import com.vou.user_be.adapter.in.web.exception.authenticate.MissingDataException;
import com.vou.user_be.adapter.in.web.exception.authenticate.WrongPassword;
import com.vou.user_be.adapter.out.persistence.UserRepository;
import com.vou.user_be.core.constant.AccountStatus;
import com.vou.user_be.core.util.JwtUtil;
import com.vou.user_be.domain.model.Auth;
import com.vou.user_be.domain.model.LoginResponse;
import com.vou.user_be.infrastructure.security.CustomizedPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticateService {
    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;
    @Autowired
    private CustomizedPasswordEncoder passwordEncoder;

    @Autowired
    public AuthenticateService(UserRepository userRepository, JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
    }

    public LoginResponse login(String email, String password) {
        // Kiểm tra email và password
        if (email == null || password == null) {
            throw new MissingDataException("Missing required fields");
        }

        System.out.println(email + " " + password);
        if (userRepository.findByEmail(email).isEmpty()
                || userRepository.findByEmail(email).get().getStatus().equals(AccountStatus.getInstance().PENDING)
                || userRepository.findByEmail(email).get().getStatus().equals(AccountStatus.getInstance().DISABLED)) {
            throw new UserNotFoundException("User not found");
        }

        Auth user = userRepository.findByEmail(email).get();

        // Kiểm tra password
        if (!passwordEncoder.matches(password, user.getPassword())) {
            throw new WrongPassword("Invalid credentials");
        }

        // Tạo JWT token
        String token = jwtUtil.generateToken(user.getEmail());

        return new LoginResponse(token, user.getId());
    }

}

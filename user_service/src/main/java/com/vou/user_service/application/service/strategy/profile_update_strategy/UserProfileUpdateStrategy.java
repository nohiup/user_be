package com.vou.user_service.application.service.strategy.profile_update_strategy;

import com.vou.user_service.adapter.in.web.dto.UpdateProfileRequest;
import com.vou.user_service.adapter.out.persistence.UserRepository;
import com.vou.user_service.domain.model.User;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserProfileUpdateStrategy implements ProfileUpdateStrategy {

    private final UserRepository userRepository;

    public UserProfileUpdateStrategy(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void updateProfile(String id, UpdateProfileRequest request) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
        user.setAvatar(request.getAvatar());
        user.setEmail(request.getEmail());
        user.setPhone(request.getPhoneNumber());
        user.setDob(request.getDob());
        user.setGender(request.getGender());
        user.setFacebook(request.getFacebookAccount());
        userRepository.save(user);
    }
}

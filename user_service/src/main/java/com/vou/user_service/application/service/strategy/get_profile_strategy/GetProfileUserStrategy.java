package com.vou.user_service.application.service.strategy.get_profile_strategy;

import com.vou.user_service.application.service.strategy.delete_object_strategy.persistence.UserRepository;
import com.vou.user_service.domain.model.User;
import org.springframework.stereotype.Component;

@Component
public class GetProfileUserStrategy implements GetProfileStrategy {
    private final UserRepository userRepository;

    public GetProfileUserStrategy(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getProfile(String id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
    }
}

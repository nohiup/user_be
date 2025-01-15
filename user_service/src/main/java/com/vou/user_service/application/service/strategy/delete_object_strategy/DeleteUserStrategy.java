package com.vou.user_service.application.service.strategy.delete_object_strategy;

import com.vou.user_service.application.service.strategy.delete_object_strategy.persistence.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class DeleteUserStrategy implements DeleteObjectStrategy {
    private final UserRepository userRepository;

    public DeleteUserStrategy(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void deleteObject(String id) {
        userRepository.deleteById(id);
    }
}

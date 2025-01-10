package com.vou.user_service.application.service.strategy.get_all_object_strategy;

import com.vou.user_service.adapter.out.persistence.UserRepository;
import com.vou.user_service.domain.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetAllUserStrategy implements GetAllObjectStrategy{
    private final UserRepository userRepository;

    public GetAllUserStrategy(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllObject() {
        return userRepository.findAll();
    }
}

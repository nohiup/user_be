package com.vou.user_service.application.service.strategy.create_user_strategy;

import com.vou.user_service.domain.model.User;
import org.springframework.stereotype.Component;

@Component
public class CreateUserStrategy implements CreateObjectStrategy {

    @Override
    public User createEntity(String id) {
        User user = new User();
        user.setId(id);
        // Các trường khác sẽ null, có thể bổ sung default nếu cần.
        return user;
    }
}

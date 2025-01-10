package com.vou.user_service.application.service.strategy.create_user_strategy;

import com.vou.user_service.domain.model.BaseEntity;

public interface CreateObjectStrategy {
    BaseEntity createEntity(String id);
}

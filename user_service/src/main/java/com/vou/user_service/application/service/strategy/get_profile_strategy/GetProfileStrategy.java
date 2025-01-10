package com.vou.user_service.application.service.strategy.get_profile_strategy;

import com.vou.user_service.domain.model.BaseEntity;

public interface GetProfileStrategy {
    BaseEntity getProfile(String id);
}

package com.vou.user_service.application.service.strategy.profile_update_strategy;

import com.vou.user_service.adapter.in.web.dto.UpdateProfileRequest;

public interface ProfileUpdateStrategy {
    void updateProfile(String id, UpdateProfileRequest request);
}

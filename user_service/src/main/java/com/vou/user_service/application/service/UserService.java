package com.vou.user_service.application.service;

import com.vou.user_service.adapter.in.web.dto.UpdateProfileRequest;
import com.vou.user_service.adapter.out.persistence.BrandRepository;
import com.vou.user_service.adapter.out.persistence.UserRepository;
import com.vou.user_service.application.service.strategy.create_user_strategy.CreateObjectStrategy;
import com.vou.user_service.application.service.strategy.profile_update_strategy.ProfileUpdateStrategy;
import com.vou.user_service.domain.model.Brand;
import com.vou.user_service.domain.model.User;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.UUID;

@Service
public class UserService {

    private final Map<String, ProfileUpdateStrategy> profileUpdateStrategy;
    private final Map<String, CreateObjectStrategy> createObjectStrategy;

    private final UserRepository userRepository;
    private final BrandRepository brandRepository;

    public UserService(Map<String, ProfileUpdateStrategy> profileUpdateStrategy, Map<String, CreateObjectStrategy> createObjectStrategy, UserRepository userRepository, BrandRepository brandRepository) {
        this.profileUpdateStrategy = profileUpdateStrategy;
        this.createObjectStrategy = createObjectStrategy;
        this.userRepository = userRepository;
        this.brandRepository = brandRepository;
    }

    public void updateUserProfile(String id, UpdateProfileRequest request) {
        String role = request.getRole().toLowerCase();
        ProfileUpdateStrategy strategy = profileUpdateStrategy.get(role);
        if (strategy == null) {
            throw new IllegalArgumentException("No update strategy found for role: " + role);
        }
        strategy.updateProfile(id, request);
    }

    public void createObject(String id, String role) {
        CreateObjectStrategy strategy = createObjectStrategy.get(role);
        if (strategy == null) {
            throw new IllegalArgumentException("No object creation strategy found for role: " + role);
        }

        Object object = strategy.createEntity(id);

        if (object instanceof User) {
            userRepository.save((User) object);
        } else if (object instanceof Brand) {
            brandRepository.save((Brand) object);
        } else {
            throw new IllegalArgumentException("Unsupported object type for role: " + role);
        }
    }
}

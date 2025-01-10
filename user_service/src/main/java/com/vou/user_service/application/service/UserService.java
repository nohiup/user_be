package com.vou.user_service.application.service;

import com.vou.user_service.adapter.in.web.dto.DeleteObjectRequest;
import com.vou.user_service.adapter.in.web.dto.GetAllObjectRequest;
import com.vou.user_service.adapter.in.web.dto.GetProfileRequest;
import com.vou.user_service.adapter.in.web.dto.UpdateProfileRequest;
import com.vou.user_service.adapter.out.persistence.AdminRepository;
import com.vou.user_service.adapter.out.persistence.BrandRepository;
import com.vou.user_service.adapter.out.persistence.UserRepository;
import com.vou.user_service.application.service.strategy.create_user_strategy.CreateObjectStrategy;
import com.vou.user_service.application.service.strategy.delete_object_strategy.DeleteObjectStrategy;
import com.vou.user_service.application.service.strategy.get_all_object_strategy.GetAllObjectStrategy;
import com.vou.user_service.application.service.strategy.get_profile_strategy.GetProfileStrategy;
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
    private final Map<String, GetProfileStrategy> getProfileStrategy;
    private final Map<String, GetAllObjectStrategy> getAllObjectStrategy;
    private final Map<String, DeleteObjectStrategy> deleteObjectStrategy;

    private final UserRepository userRepository;
    private final BrandRepository brandRepository;

    public UserService(Map<String, ProfileUpdateStrategy> profileUpdateStrategy, Map<String, CreateObjectStrategy> createObjectStrategy, Map<String, GetProfileStrategy> getProfileStrategy, Map<String, GetAllObjectStrategy> getAllObjectStrategy, Map<String, DeleteObjectStrategy> deleteObjectStrategy, UserRepository userRepository, BrandRepository brandRepository) {
        this.profileUpdateStrategy = profileUpdateStrategy;
        this.createObjectStrategy = createObjectStrategy;
        this.getProfileStrategy = getProfileStrategy;
        this.getAllObjectStrategy = getAllObjectStrategy;
        this.deleteObjectStrategy = deleteObjectStrategy;
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

    public Object getProfile(String id, GetProfileRequest request) {
        String role = request.getRole().toLowerCase();
        GetProfileStrategy strategy = getProfileStrategy.get(role);

        if (strategy == null) {
            throw new IllegalArgumentException("No object creation strategy found for role: " + role);
        }

        return strategy.getProfile(id);
    }

    public Object getAllObject(GetAllObjectRequest request) {
        String role = request.getRole().toLowerCase();
        GetAllObjectStrategy strategy = getAllObjectStrategy.get(role);

        if (strategy == null) {
            throw new IllegalArgumentException("No object creation strategy found for role: " + role);
        }

        return strategy.getAllObject();
    }

    public void deleteObject(String id, DeleteObjectRequest request) {
        String role = request.getRole().toLowerCase();
        DeleteObjectStrategy strategy = deleteObjectStrategy.get(role);

        if (strategy == null) {
            throw new IllegalArgumentException("No object creation strategy found for role: " + role);
        }

        strategy.deleteObject(id);
    }
}

package com.vou.user_service.application.service.strategy.get_profile_strategy;

import com.vou.user_service.adapter.out.persistence.AdminRepository;
import com.vou.user_service.domain.model.Admin;
import org.springframework.stereotype.Component;

@Component
public class GetProfileAdminStrategy implements GetProfileStrategy {
    private final AdminRepository adminRepository;

    public GetProfileAdminStrategy(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public Admin getProfile(String id) {
        return adminRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Admin not found"));
    }
}

package com.vou.user_service.application.service.strategy.get_profile_strategy;

import com.vou.user_service.adapter.out.persistence.BrandRepository;
import com.vou.user_service.domain.model.Brand;
import org.springframework.stereotype.Component;

@Component
public class GetProfileBrandStrategy implements GetProfileStrategy {
    private final BrandRepository brandRepository;

    public GetProfileBrandStrategy(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public Brand getProfile(String id) {
        return brandRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Brand not found"));
    }
}

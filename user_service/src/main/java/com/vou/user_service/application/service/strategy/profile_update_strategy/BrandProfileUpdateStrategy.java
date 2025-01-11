package com.vou.user_service.application.service.strategy.profile_update_strategy;

import com.vou.user_service.adapter.in.web.dto.UpdateProfileRequest;
import com.vou.user_service.application.service.strategy.delete_object_strategy.persistence.BrandRepository;
import com.vou.user_service.domain.model.Brand;
import org.springframework.stereotype.Component;

@Component
public class BrandProfileUpdateStrategy implements ProfileUpdateStrategy {

    private final BrandRepository brandRepository;

    public BrandProfileUpdateStrategy(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public void updateProfile(String id, UpdateProfileRequest request) {
        Brand brand = brandRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Brand not found"));
        brand.setName(request.getName());
        brand.setIndustry(request.getIndustry());
        brand.setAddress(request.getAddress());
        brand.setGps_lat(request.getGpsLat());
        brand.setGps_long(request.getGpsLong());
        brandRepository.save(brand);
    }
}

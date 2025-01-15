package com.vou.user_service.application.service.strategy.get_all_object_strategy;

import com.vou.user_service.application.service.strategy.delete_object_strategy.persistence.BrandRepository;
import com.vou.user_service.domain.model.Brand;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetAllBrandStrategy implements GetAllObjectStrategy {
    private final BrandRepository brandRepository;

    public GetAllBrandStrategy(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAllObject() {
        return brandRepository.findAll();
    }
}

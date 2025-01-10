package com.vou.user_service.application.service.strategy.delete_object_strategy;

import com.vou.user_service.adapter.out.persistence.BrandRepository;
import org.springframework.stereotype.Component;

@Component
public class DeleteBrandStrategy implements DeleteObjectStrategy {
    private final BrandRepository brandRepository;

    public DeleteBrandStrategy(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public void deleteObject(String id) {
        brandRepository.deleteById(id);
    }
}

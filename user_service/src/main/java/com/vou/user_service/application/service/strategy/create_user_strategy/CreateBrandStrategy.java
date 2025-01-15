package com.vou.user_service.application.service.strategy.create_user_strategy;

import com.vou.user_service.domain.model.Brand;
import org.springframework.stereotype.Component;

@Component
public class CreateBrandStrategy implements CreateObjectStrategy {

    @Override
    public Brand createEntity(String id) {
        Brand brand = new Brand();
        brand.setId(id);
        return brand;
    }
}

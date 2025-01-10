package com.vou.user_service.infrastructure.config;

import com.vou.user_service.application.service.strategy.create_user_strategy.CreateBrandStrategy;
import com.vou.user_service.application.service.strategy.create_user_strategy.CreateObjectStrategy;
import com.vou.user_service.application.service.strategy.create_user_strategy.CreateUserStrategy;
import com.vou.user_service.application.service.strategy.get_all_object_strategy.GetAllBrandStrategy;
import com.vou.user_service.application.service.strategy.get_all_object_strategy.GetAllObjectStrategy;
import com.vou.user_service.application.service.strategy.get_all_object_strategy.GetAllUserStrategy;
import com.vou.user_service.application.service.strategy.get_profile_strategy.GetProfileBrandStrategy;
import com.vou.user_service.application.service.strategy.get_profile_strategy.GetProfileStrategy;
import com.vou.user_service.application.service.strategy.get_profile_strategy.GetProfileUserStrategy;
import com.vou.user_service.application.service.strategy.profile_update_strategy.BrandProfileUpdateStrategy;
import com.vou.user_service.application.service.strategy.profile_update_strategy.ProfileUpdateStrategy;
import com.vou.user_service.application.service.strategy.profile_update_strategy.UserProfileUpdateStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class StrategyConfig {

    @Bean
    public Map<String, ProfileUpdateStrategy> profileUpdateStrategy(
            UserProfileUpdateStrategy userProfileUpdateStrategy,
            BrandProfileUpdateStrategy brandProfileUpdateStrategy) {
        return Map.of(
                "user", userProfileUpdateStrategy,
                "brand", brandProfileUpdateStrategy
        );
    }

    @Bean
    public Map<String, CreateObjectStrategy> createObjectStrategy(
            CreateUserStrategy createUserStrategy,
            CreateBrandStrategy createBrandStrategy) {
        return Map.of(
                "user", createUserStrategy,
                "brand", createBrandStrategy
        );
    }

    @Bean
    public Map<String, GetProfileStrategy> getProfileStrategy(
            GetProfileUserStrategy getProfileUserStrategy,
            GetProfileBrandStrategy getProfileBrandStrategy) {
        return Map.of(
                "user", getProfileUserStrategy,
                "brand", getProfileBrandStrategy
        );
    }

    @Bean
    public Map<String, GetAllObjectStrategy> getAllObjectStrategy(
            GetAllBrandStrategy getAllBrandStrategy,
            GetAllUserStrategy getAllUserStrategy) {
        return Map.of(
                "user", getAllUserStrategy,
                "brand", getAllBrandStrategy
        );
    }
}

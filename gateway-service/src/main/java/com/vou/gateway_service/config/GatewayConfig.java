package com.vou.gateway_service.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableHystrix
public class GatewayConfig {

    @Autowired
    AuthenticationFilter filter;

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("user-service", r -> r.path("/api/users/**")
                        .filters(f -> f.filter(filter))
                        .uri("lb://user-service"))

                .route("auth-service", r -> r.path("/api/auth/**")
                        .filters(f -> f.filter(filter))
                        .uri("lb://auth-service"))

                .route("event-service", r -> r.path("/api/events/**")
                        .filters(f -> f.filter(filter))
                        .uri("lb://event-service"))

                .route("event-service", r -> r.path("/api/eventParticipants/**")
                        .filters(f -> f.filter(filter))
                        .uri("lb://event-service"))

                .route("game-service", r -> r.path("/api/games/**")
                        .filters(f -> f.filter(filter))
                        .uri("lb://game-service"))
                .build();
    }

}

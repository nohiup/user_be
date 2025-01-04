package com.vou.user_service.infrastructure.config;

import com.vou.user_service.infrastructure.grpc.UserGrpcServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcServerConfig {

    @Bean
    public Server grpcServer(UserGrpcServiceImpl authGrpcService) throws Exception {
        return ServerBuilder.forPort(9090)
                .addService(authGrpcService)
                .build()
                .start();
    }
}

package com.vou.user_be.infrastructure.config;

import com.vou.user_be.infrastructure.grpc.AuthGrpcServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcServerConfig {

    @Bean
    public Server grpcServer(AuthGrpcServiceImpl authGrpcService) throws Exception {
        return ServerBuilder.forPort(9092)
                .addService(auth)
                .build()
                .start();
    }
}

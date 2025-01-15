package com.vou.user_service.infrastructure.config;

import com.vou.user_service.infrastructure.grpc.UserGrpcServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcServerConfig {

    @Bean
    public Server grpcServer(UserGrpcServiceImpl userGrpcService) throws Exception {
        Server server =  ServerBuilder.forPort(50001)
                .addService(userGrpcService)
                .build()
                .start();
        // Add a shutdown hook to stop the server gracefully
        Runtime.getRuntime().addShutdownHook(new Thread(server::shutdown));
        return server;
    }
}

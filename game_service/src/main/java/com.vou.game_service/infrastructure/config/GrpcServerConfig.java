package com.vou.game_service.infrastructure.config;//package com.vou.event_service.infrastructure.config;

import com.vou.game_service.infrastructure.grpc.GameGrpcServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcServerConfig {

    @Bean
    public Server grpcServer(GameGrpcServiceImpl gameGrpcService) throws Exception {
        Server server =  ServerBuilder.forPort(9091)
                .addService(gameGrpcService)
                .build()
                .start();
        // Add a shutdown hook to stop the server gracefully
        Runtime.getRuntime().addShutdownHook(new Thread(server::shutdown));
        return server;
    }
}

package com.vou.game_service.infrastructure.config;

import com.vou.common.proto.user.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcClientConfig {

    @Bean
    public ManagedChannel managedUserChannel() {
        return ManagedChannelBuilder.forAddress("localhost", 9091) // Replace with user_service address
                .usePlaintext()
                .build();
    }

    @Bean
    public UserServiceGrpc.UserServiceBlockingStub userServiceStub(ManagedChannel channel) {
        return UserServiceGrpc.newBlockingStub(channel);
    }
}

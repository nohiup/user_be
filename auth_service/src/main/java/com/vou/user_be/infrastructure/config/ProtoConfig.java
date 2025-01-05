package com.vou.user_be.infrastructure.config;

import com.vou.common.proto.AuthServiceGrpc;
import com.vou.common.proto.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProtoConfig {

    @Bean
    public ManagedChannel managedChannel() {
        return ManagedChannelBuilder.forAddress("localhost", 9091)
                .usePlaintext()
                .build();
    }

    @Bean
    public AuthServiceGrpc.AuthServiceBlockingStub authServiceBlockingStub(ManagedChannel managedChannel) {
        return AuthServiceGrpc.newBlockingStub(managedChannel());
    }
    @Bean
    public UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub(ManagedChannel managedChannel) {
        return UserServiceGrpc.newBlockingStub(managedChannel());
    }

}

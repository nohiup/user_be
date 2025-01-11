package com.vou.event_service.infrastructure.config;

import com.vou.common.proto.user.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcClientConfig {

    @Bean
    public ManagedChannel managedUserChannel() {
        return ManagedChannelBuilder.forAddress("localhost", 9091)
                .usePlaintext()
                .build();
    }

    //Auth client for self-sending???
//    @Bean
//    public AuthServiceGrpc.AuthServiceBlockingStub authServiceBlockingStub(ManagedChannel managedChannel) {
//        return AuthServiceGrpc.newBlockingStub(managedUserChannel());
//    }

    //UserClient for sending mess to userService
    @Bean
    public UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub(ManagedChannel managedChannel){
        return UserServiceGrpc.newBlockingStub(managedUserChannel());
    }

}

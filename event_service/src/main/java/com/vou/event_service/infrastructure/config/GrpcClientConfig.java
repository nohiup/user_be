package com.vou.event_service.infrastructure.config;

import com.vou.common.proto.event.EventServiceGrpc;
import com.vou.common.proto.game.GameServiceGrpc;
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
    //UserClient for sending mess to userService
    @Bean
    public GameServiceGrpc.GameServiceBlockingStub gameServiceBlockingStub(ManagedChannel managedChannel){
        return GameServiceGrpc.newBlockingStub(managedUserChannel());
    }

    @Bean
    public UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub(ManagedChannel managedChannel){
        return UserServiceGrpc.newBlockingStub(managedUserChannel());
    }

}

package com.vou.user_be.application.grpc;

import com.vou.common.UserServiceGrpc;

public class UserGrpcClient {
    private final UserServiceGrpc.UserServiceBlockingStub userStub;

    public UserGrpcClient(UserServiceGrpc.UserServiceBlockingStub userStub) {
        this.userStub = userStub;
    }

    public void sendUserId(String userId) {
        // Tạo message
        com.vou.common.UserIdMessage request = com.vou.common.UserIdMessage.newBuilder()
                .setUserId(userId)
                .build();

        // Gửi request và nhận phản hồi
        com.vou.common.Empty response = userStub.receiveUserId(request);
        System.out.println("Message sent " + userId +", received: empty");
    }
}

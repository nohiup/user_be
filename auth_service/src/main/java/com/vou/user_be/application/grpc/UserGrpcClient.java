package com.vou.user_be.application.grpc;

import com.vou.common.proto.UserInfoMessage;
import com.vou.common.proto.UserInfoResponse;
import com.vou.common.proto.UserServiceGrpc;
import com.vou.user_be.domain.model.Auth;
import com.vou.user_be.infrastructure.grpc.AuthGrpcServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class UserGrpcClient {
    private final UserServiceGrpc.UserServiceBlockingStub userStub;

    public UserGrpcClient(UserServiceGrpc.UserServiceBlockingStub userStub){
        this.userStub = userStub;
    }

    public void sendUserId(Auth auth) {
        // Tạo message
        try {
            UserInfoMessage request = UserInfoMessage.newBuilder()
                    .setUserId(auth.getId().toString())
                    .setUserRole(auth.getRole())
                    .build();

            // Gửi request và nhận phản hồi
            UserInfoResponse response =  userStub.receiveUserId(request);
            System.out.println("UserGrpcClient received response: " + response.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

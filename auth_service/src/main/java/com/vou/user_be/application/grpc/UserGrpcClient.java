package com.vou.user_be.application.grpc;

import com.vou.common.proto.auth.AuthServiceGrpc;
import com.vou.common.proto.user.SendUIDMessage;
import com.vou.common.proto.user.SendUIDResponse;
import com.vou.common.proto.user.UserServiceGrpc;
import com.vou.user_be.domain.model.Auth;
import org.springframework.stereotype.Service;

//Client to send message to UserService server (receiver)
@Service
public class UserGrpcClient {
    private final UserServiceGrpc.UserServiceBlockingStub userStub;

    public UserGrpcClient(UserServiceGrpc.UserServiceBlockingStub user){
        this.userStub = user;
    }

    public void sendUserId(Auth auth) {
        // Tạo message
        try {
            SendUIDMessage request = SendUIDMessage.newBuilder()
                    .setUserId(auth.getId().toString())
                    .setRole(auth.getRole())
                    .setEmail(auth.getEmail())
                    .build();

            // Gửi request và nhận phản hồi
            SendUIDResponse response =  userStub.receiveUID(request);
            System.out.println("UserGrpcClient received response: " + response.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

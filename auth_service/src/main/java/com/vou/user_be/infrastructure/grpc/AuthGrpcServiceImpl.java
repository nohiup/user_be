package com.vou.user_be.infrastructure.grpc;

import com.vou.common.proto.AuthServiceGrpc;
import com.vou.common.proto.UserInfoMessage;
import com.vou.common.proto.UserInfoResponse;
import com.vou.common.proto.UserServiceGrpc;
import com.vou.user_be.application.grpc.UserGrpcClient;

import com.vou.user_be.domain.model.Auth;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;


//Server for receiving data, not the client to send data

@Service
public class AuthGrpcServiceImpl extends AuthServiceGrpc.AuthServiceImplBase {

    public AuthGrpcServiceImpl(AuthServiceGrpc.AuthServiceBlockingStub userStub) {
        // Kết nối đến AuthService
        UserGrpcClient userGrpcClient = new UserGrpcClient(userStub); // Địa chỉ AuthService
    }
    @Override
    public void sendUserId(UserInfoMessage request, StreamObserver<UserInfoResponse> responseObserver) {
        // Gửi userId đến UserService
        System.out.println("Passed here");

        // Phản hồi lại client gọi AuthService
        responseObserver.onNext(UserInfoResponse.newBuilder().build());
        responseObserver.onCompleted();
    }
}

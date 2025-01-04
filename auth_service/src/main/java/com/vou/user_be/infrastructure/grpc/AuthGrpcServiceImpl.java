package com.vou.user_be.infrastructure.grpc;

import com.vou.common.AuthServiceGrpc;
import com.vou.common.Empty;
import com.vou.common.UserIdMessage;
import com.vou.common.UserServiceGrpc;
import com.vou.user_be.application.grpc.UserGrpcClient;

import io.grpc.stub.StreamObserver;


public class AuthGrpcServiceImpl extends AuthServiceGrpc.AuthServiceImplBase {
    private final UserGrpcClient userClient;

    public AuthGrpcServiceImpl(UserServiceGrpc.UserServiceBlockingStub userStub) {
        // Kết nối đến UserService
        this.userClient = new UserGrpcClient(userStub); // Địa chỉ UserService
    }
    @Override
    public void sendUserId(UserIdMessage request, StreamObserver<Empty> responseObserver) {
        // Kết nối đến UserService
        System.out.println("AuthService received userId: " + request.getUserId());

        // Gửi userId đến UserService
        userClient.sendUserId(request.getUserId());

        // Phản hồi lại client gọi AuthService
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }
}

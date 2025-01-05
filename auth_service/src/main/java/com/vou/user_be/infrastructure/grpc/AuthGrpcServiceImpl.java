package com.vou.user_be.infrastructure.grpc;

import com.vou.common.proto.AuthInfoServiceGrpc;
import com.vou.common.proto.AuthServiceGrpc;
import com.vou.common.proto.UserInfoMessage;
import com.vou.common.proto.UserInfoResponse;
import com.vou.common.proto.UserServiceGrpc;
import com.vou.user_be.application.grpc.UserGrpcClient;

import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;


@Service
public class AuthGrpcServiceImpl extends AuthInfoServiceGrpc.AuthServiceImplBase {

    public AuthGrpcServiceImpl(UserServiceGrpc.UserServiceBlockingStub userStub) {
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

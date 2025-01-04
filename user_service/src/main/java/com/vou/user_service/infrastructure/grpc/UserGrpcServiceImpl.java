package com.vou.user_service.infrastructure.grpc;

import com.vou.common.Empty;
import com.vou.common.UserIdMessage;
import com.vou.common.UserServiceGrpc;
import io.grpc.stub.StreamObserver;

public class UserGrpcServiceImpl extends UserServiceGrpc.UserServiceImplBase {
    @Override
    public void receiveUserId(UserIdMessage request, StreamObserver<Empty> responseObserver) {
        // In ra userId nhận được
        System.out.println("UserService received userId: " + request.getUserId());

        // Xử lý logic cần thiết (lưu vào DB, v.v.)

        // Gửi phản hồi về AuthService
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }
}

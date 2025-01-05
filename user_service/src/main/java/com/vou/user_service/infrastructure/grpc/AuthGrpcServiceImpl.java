package com.vou.user_service.infrastructure.grpc;

import com.vou.common.proto.AuthServiceGrpc;
import com.vou.common.proto.UserInfoMessage;
import com.vou.common.proto.UserInfoResponse;
import com.vou.common.proto.UserServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

@Service
public class AuthGrpcServiceImpl extends AuthServiceGrpc.AuthServiceImplBase {
    @Override
    public void sendUserId(UserInfoMessage request, StreamObserver<UserInfoResponse> responseObserver) {
        // In ra userId nhận được
        System.out.println("UserService received userId: " + request.getUserId());

        // Xử lý logic cần thiết (lưu vào DB, v.v.)

        // Gửi phản hồi về AuthService
        responseObserver.onNext(UserInfoResponse.newBuilder()
                .setMessage("Received").build());
        responseObserver.onCompleted();
    }
}

package com.vou.user_service.infrastructure.grpc;

import com.vou.common.proto.user.*;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

@Service
public class UserGrpcServiceImpl extends UserServiceGrpc.UserServiceImplBase {
    @Override
    public void receiveUID(SendUIDMessage request, StreamObserver<SendUIDResponse> responseObserver) {
        super.receiveUID(request, responseObserver);
        System.out.println("Received UID: " + request.getUserId());
    }

    @Override
    public void getUserIdFromEmail(GetUserIdFromEmailMessage request, StreamObserver<GetUserIdFromEmailResponse> responseObserver) {
        super.getUserIdFromEmail(request, responseObserver);
        //Implement get userIdFromEmail
        //ResponseUserId
    }

    @Override
    public void getCurrentUserId(CurrentUIDMessage request, StreamObserver<CurrentUIDResponse> responseObserver) {
        super.getCurrentUserId(request, responseObserver);
        //Implement getCurrentUserId
        //Response current userId.
    }
}

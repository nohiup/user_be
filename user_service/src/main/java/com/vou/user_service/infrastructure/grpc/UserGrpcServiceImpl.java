package com.vou.user_service.infrastructure.grpc;

import com.vou.common.proto.user.*;
import com.vou.user_service.application.service.UserService;
import com.vou.user_service.domain.model.Admin;
import com.vou.user_service.domain.model.Brand;
import com.vou.user_service.domain.model.User;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserGrpcServiceImpl extends UserServiceGrpc.UserServiceImplBase {

    private final UserService userService;

    public UserGrpcServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void receiveUID(SendUIDMessage request, StreamObserver<SendUIDResponse> responseObserver) {
        String userId = request.getUserId();
        String role = request.getRole();

        userService.createObject(userId, role);



        // Create a response
        SendUIDResponse response = SendUIDResponse.newBuilder()
                .setMessage("UID received and object created successfully")
                .build();

        // Send the response
        responseObserver.onNext(response);
        responseObserver.onCompleted();
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

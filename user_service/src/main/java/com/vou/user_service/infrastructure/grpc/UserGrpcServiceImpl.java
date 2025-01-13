package com.vou.user_service.infrastructure.grpc;

import com.vou.common.proto.user.*;
import com.vou.user_service.application.service.UserService;
import com.vou.user_service.application.service.strategy.delete_object_strategy.persistence.UserRepository;
import com.vou.user_service.domain.model.User;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserGrpcServiceImpl extends UserServiceGrpc.UserServiceImplBase {

    private final UserService userService;

    private final UserRepository userRepository;

    public UserGrpcServiceImpl(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
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
        try {
            String email = request.getEmail();
            Optional<User> user = userRepository.findByEmail(email);

            if (user.isPresent()) {
                GetUserIdFromEmailResponse response = GetUserIdFromEmailResponse.newBuilder()
                        .setUserId(user.get().getId().toString())
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            } else {
                responseObserver.onError(Status.NOT_FOUND
                        .withDescription("User not found for email: " + email)
                        .asRuntimeException());
            }
        } catch (Exception e) {
            responseObserver.onError(Status.INTERNAL
                    .withDescription("Internal server error")
                    .augmentDescription(e.getMessage())
                    .asRuntimeException());
        }
    }

    @Override
    public void getCurrentUserId(CurrentUIDMessage request, StreamObserver<CurrentUIDResponse> responseObserver) {
        super.getCurrentUserId(request, responseObserver);
        //Implement getCurrentUserId
        //Response current userId.
    }
}

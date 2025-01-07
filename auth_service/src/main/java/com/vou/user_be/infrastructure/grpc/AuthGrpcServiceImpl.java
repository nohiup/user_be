package com.vou.user_be.infrastructure.grpc;

import com.vou.common.proto.auth.AuthServiceGrpc;
import com.vou.common.proto.auth.RequestInfoMessage;
import com.vou.common.proto.auth.RequestInfoResponse;
import com.vou.user_be.adapter.out.persistence.UserRepository;
import com.vou.user_be.application.grpc.UserGrpcClient;

import com.vou.user_be.domain.model.Auth;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

import java.util.UUID;


//Server for receiving data, not the client to send data
@Service
public class AuthGrpcServiceImpl extends AuthServiceGrpc.AuthServiceImplBase {
    final UserRepository _userRepo;

    public AuthGrpcServiceImpl(AuthServiceGrpc.AuthServiceBlockingStub authStub, UserRepository userRepo) {
        // Kết nối đến AuthService
//        UserGrpcClient userGrpcClient = new UserGrpcClient(authStub); // Địa chỉ AuthService
        _userRepo = userRepo;
    }

    @Override
    public void getInfo(RequestInfoMessage request, StreamObserver<RequestInfoResponse> responseObserver) {
        super.getInfo(request, responseObserver);
        Auth currentUser = _userRepo.findById(UUID.fromString(request.getUserId()));
        if (currentUser == null) {
            return;
        }
        responseObserver.onNext(RequestInfoResponse.newBuilder()
                .setUserId(currentUser.getId().toString())
                .setEmail(currentUser.getEmail())
                .setRole(currentUser.getRole())
                .setStatus(currentUser.getStatus())
                .setUsername(currentUser.getUsername())
                .build()
        );
        responseObserver.onCompleted();
    }
    
}

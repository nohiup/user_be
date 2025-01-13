package com.vou.event_service.application.grpc;

import com.vou.common.proto.game.CreateGameRequest;
import com.vou.common.proto.game.CreateGameResponse;
import com.vou.common.proto.game.GameServiceGrpc;
import com.vou.common.proto.user.*;
import com.vou.event_service.domain.model.Event;
import org.springframework.stereotype.Service;

//Client to send message to UserService server (receiver)
@Service
public class EventGrpcClient {
    private final GameServiceGrpc.GameServiceBlockingStub gameStub;

    private final UserServiceGrpc.UserServiceBlockingStub userStub;

    public EventGrpcClient(GameServiceGrpc.GameServiceBlockingStub game,UserServiceGrpc.UserServiceBlockingStub user){
        this.gameStub = game;
        this.userStub = user;
    }

    public void createGame(Event event) {
        CreateGameRequest grpcRequest = CreateGameRequest.newBuilder()
                .setEventId(event.getId()) // Ensure event.getId() is valid
                .setGameName("Shake Game")
                .setGameType("Shake Game")
                .build();

        try {
            CreateGameResponse grpcResponse = gameStub.createGameForEvent(grpcRequest);
            System.out.println("Game created successfully: " + grpcResponse.getEventGameId());
        } catch (Exception e) {
            System.err.println("Error while creating game: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public String GetUserIdFromEmail(String email) {
        GetUserIdFromEmailMessage grpcRequest = GetUserIdFromEmailMessage.newBuilder()
                .setEmail(email) // Ensure event.getId() is valid
                .build();
        try {
            GetUserIdFromEmailResponse grpcResponse = userStub.getUserIdFromEmail(grpcRequest);
            System.out.println("Game created successfully: " + grpcResponse.getUserId());
            return grpcResponse.getUserId();
        } catch (Exception e) {
            System.err.println("Error while creating game: " + e.getMessage());
            e.printStackTrace();
            return null;
        }

    }

}

package com.vou.game_service.infrastructure.grpc;

import com.vou.common.proto.game.CreateGameRequest;
import com.vou.common.proto.game.CreateGameResponse;
import com.vou.game_service.domain.model.EventGames;
import com.vou.game_service.domain.model.Game;
import com.vou.game_service.repository.EventGamesRepository;
import com.vou.game_service.repository.GameRepository;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vou.common.proto.game.GameServiceGrpc;

import java.util.UUID;

@Service
public class GameGrpcServiceImpl extends GameServiceGrpc.GameServiceImplBase {
    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private EventGamesRepository eventGamesRepository;

    @Override
    public void createGameForEvent(CreateGameRequest request, StreamObserver<CreateGameResponse> responseObserver) {
        // Step 1: Create the Game
        Game game = new Game();
        game.setName(request.getGameName());
        game.setType(request.getGameType());
        game = gameRepository.save(game);

        // Step 2: Create the EventGames record
        EventGames eventGame = new EventGames();
        eventGame.setEventId(request.getEventId());
        eventGame.setGameId(game.getId());
        eventGame = eventGamesRepository.save(eventGame);

        // Step 3: Respond with the created EventGames ID
        CreateGameResponse response = CreateGameResponse.newBuilder()
                .setEventGameId(eventGame.getId())  // Ensure this ID is long, or converted to UUID as required
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

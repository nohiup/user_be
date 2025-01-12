package com.vou.game_service.adapter.in.web.controller;

import com.vou.game_service.adapter.in.web.dto.CreateGameRequest;
import com.vou.game_service.application.service.GameService;
import com.vou.game_service.domain.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping("/create")
    public ResponseEntity<Game> createGame(@RequestBody CreateGameRequest createGameRequest) {
        Game createdGame = gameService.createGame(createGameRequest);
        return ResponseEntity.ok(createdGame);
    }
}

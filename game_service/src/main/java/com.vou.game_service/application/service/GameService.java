package com.vou.game_service.application.service;

import com.vou.game_service.adapter.in.web.dto.CreateGameRequest;
import com.vou.game_service.domain.model.Game;
import com.vou.game_service.domain.model.GameItems;
import com.vou.game_service.repository.GameItemsRepository;
import com.vou.game_service.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private GameItemsRepository gameItemsRepository;

    @Transactional
    public Game createGame(CreateGameRequest createGameRequest) {
        // Create a new Game entity
        Game game = new Game();
        game.setName(createGameRequest.getName());
        game.setType(createGameRequest.getType());
        game.setImage(createGameRequest.getImage());
        game.setAllowItemExchange(createGameRequest.getAllowItemExchange());
        game.setDescription(createGameRequest.getDescription());
        game = gameRepository.save(game);

//        // Save associated GameItems
//        if (createGameRequest.getGameItems() != null) {
//            for (GameItems item : createGameRequest.getGameItems()) {
//                item.setGame(game);
//                gameItemsRepository.save(item);
//            }
//        }

        return game;
    }
}

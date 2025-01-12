package com.vou.game_service.application.service;

import com.vou.game_service.adapter.in.web.dto.UpdateGameItemRequest;
import com.vou.game_service.domain.model.GameItems;
import com.vou.game_service.repository.GameItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class GameItemsService {

    @Autowired
    private GameItemsRepository gameItemsRepository;

    public GameItems updateGameItem(UUID itemId, UpdateGameItemRequest updateRequest) {
        Optional<GameItems> optionalGameItem = gameItemsRepository.findById(itemId);

        if (optionalGameItem.isEmpty()) {
            throw new IllegalArgumentException("Game item with ID " + itemId + " not found.");
        }

        GameItems gameItem = optionalGameItem.get();

        // Update fields if they are provided
        if (updateRequest.getName() != null) {
            gameItem.setName(updateRequest.getName());
        }
        if (updateRequest.getDescription() != null) {
            gameItem.setDescription(updateRequest.getDescription());
        }
        if (updateRequest.getQuantity() != null) {
            gameItem.setQuantity(updateRequest.getQuantity());
        }

        return gameItemsRepository.save(gameItem);
    }
}

package com.vou.game_service.repository;

import com.vou.game_service.domain.model.Game;
import com.vou.game_service.domain.model.GameItems;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface GameItemsRepository extends JpaRepository<GameItems, Long> {
    Optional<GameItems> findById(UUID itemId);
}
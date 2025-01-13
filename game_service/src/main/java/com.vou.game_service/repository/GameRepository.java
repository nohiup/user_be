package com.vou.game_service.repository;

import com.vou.game_service.domain.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface GameRepository extends JpaRepository<Game, UUID> {
}
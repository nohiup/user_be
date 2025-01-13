package com.vou.game_service.repository;

import com.vou.game_service.domain.model.EventGames;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventGamesRepository extends JpaRepository<EventGames, UUID> {
}

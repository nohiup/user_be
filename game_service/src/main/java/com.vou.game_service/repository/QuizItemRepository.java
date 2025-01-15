package com.vou.game_service.repository;
import com.vou.game_service.domain.model.Game;
import com.vou.game_service.domain.model.QuizItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizItemRepository extends JpaRepository<QuizItem, Long> {
    List<QuizItem> findByGame(Game game);
}

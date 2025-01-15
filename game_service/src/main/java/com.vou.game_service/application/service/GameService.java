package com.vou.game_service.application.service;

import com.vou.game_service.adapter.in.web.dto.CreateGameRequest;
import com.vou.game_service.domain.model.Game;
import com.vou.game_service.domain.model.GameItems;
import com.vou.game_service.domain.model.Question;
import com.vou.game_service.domain.model.QuizItem;
import com.vou.game_service.repository.GameItemsRepository;
import com.vou.game_service.repository.GameRepository;
import com.vou.game_service.repository.QuizItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private GameItemsRepository gameItemsRepository;

    @Autowired
    private QuizItemRepository quizItemRepository;


    @Transactional
    public Game createGame(CreateGameRequest createGameRequest) {
        // Create a new Game entity
        Game game = new Game();
        game.setName(createGameRequest.getName());
        game.setType(createGameRequest.getType());
        game.setImage(createGameRequest.getImage());
        game.setDescription(createGameRequest.getDescription());

        // Save the game entity
        game = gameRepository.save(game);

        // Handle the associated questions and save them in the QuizItem table
        List<Question> questions = createGameRequest.getQuestions();
        if (questions != null && !questions.isEmpty()) {
            for (Question question : questions) {
                QuizItem quizItem = new QuizItem();
                quizItem.setGame(game);  // Associate the question with the game
                quizItem.setName(question.getName());
                quizItem.setOption1(question.getOptions().get(0));
                quizItem.setOption2(question.getOptions().get(1));
                quizItem.setOption3(question.getOptions().get(2));
                quizItem.setOption4(question.getOptions().get(3));
                quizItem.setAnswer(question.getAnswer());

                // Save the QuizItem
                quizItemRepository.save(quizItem);
            }
        }

        // Return the saved game object with all associated items and questions
        return game;
    }
}

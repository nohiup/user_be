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


}

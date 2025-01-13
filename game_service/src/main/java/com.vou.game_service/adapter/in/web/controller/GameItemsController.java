package com.vou.game_service.adapter.in.web.controller;

import com.vou.game_service.adapter.in.web.dto.UpdateGameItemRequest;
import com.vou.game_service.application.service.GameItemsService;
import com.vou.game_service.domain.model.GameItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/gameItems")
public class GameItemsController {

    @Autowired
    private GameItemsService gameItemsService;

}

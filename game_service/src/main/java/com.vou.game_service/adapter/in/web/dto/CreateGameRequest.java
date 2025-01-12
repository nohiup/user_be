package com.vou.game_service.adapter.in.web.dto;

import com.vou.game_service.domain.model.GameItems;
import java.util.List;

public class CreateGameRequest {
    private String name;
    private String type;
    private String image;
    private Boolean allowItemExchange;
    private String description;
    private List<GameItems> gameItems;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getAllowItemExchange() {
        return allowItemExchange;
    }

    public void setAllowItemExchange(Boolean allowItemExchange) {
        this.allowItemExchange = allowItemExchange;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<GameItems> getGameItems() {
        return gameItems;
    }

    public void setGameItems(List<GameItems> gameItems) {
        this.gameItems = gameItems;
    }
}

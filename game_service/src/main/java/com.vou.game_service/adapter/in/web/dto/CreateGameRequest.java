package com.vou.game_service.adapter.in.web.dto;

import com.vou.game_service.domain.model.GameItems;
import com.vou.game_service.domain.model.Question;

import java.util.List;

public class CreateGameRequest {
    private String name;
    private String type;
    private String image;
    private String description;

    // Adding the list of questions for game creation
    private List<Question> questions;

    // Getters and Setters

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

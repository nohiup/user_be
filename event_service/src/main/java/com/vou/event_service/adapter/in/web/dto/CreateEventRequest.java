package com.vou.event_service.adapter.in.web.dto;

import com.google.type.DateTime;
import com.vou.event_service.domain.model.Voucher;

import java.util.List;

public class CreateEventRequest {
    private String name;
    private String image;
    private List<Voucher> vouchers;

    private DateTime start;

    private DateTime endDate;


    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for image
    public String getImage() {
        return image;
    }

    // Setter for image
    public void setImage(String image) {
        this.image = image;
    }
}

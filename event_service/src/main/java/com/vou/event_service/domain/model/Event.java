package com.vou.event_service.domain.model;


import com.google.type.DateTime;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    final UUID id;
    String name;
    String image;



    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Voucher> vouchers;


    private DateTime start;
    private DateTime endDate; // Rename the field to endDate

    // Getters and setters
    public List<Voucher> getVouchers() {
        return vouchers;
    }

    public void setVouchers(List<Voucher> vouchers) {
        this.vouchers = vouchers;
    }

    public Event(UUID id, String name, String image, DateTime start, DateTime endDate, List<Voucher> vouchers) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.start = start;
        this.endDate = endDate;
        this.vouchers = vouchers;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public DateTime getStart() {
        return start;
    }

    public DateTime getEnd() {
        return endDate;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }


}

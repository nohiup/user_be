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
    final String name;
    final String image;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Voucher> vouchers;

    final DateTime start;
    final DateTime end;


    public Event(UUID id, String name, String image, DateTime start, DateTime end, List<Voucher> vouchers) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.start = start;
        this.end = end;
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

    public List<Voucher> getVouchers() {
        return vouchers;
    }

    public void setVouchers(List<Voucher> vouchers) {
        this.vouchers = vouchers;
    }

    public DateTime getStart() {
        return start;
    }

    public DateTime getEnd() {
        return end;
    }
}

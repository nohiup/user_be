package com.vou.user_service.domain.model;

import jakarta.persistence.Entity;

import javax.annotation.Nullable;
import java.math.BigDecimal;

@Entity
public class Brand extends BaseEntity{
    @Nullable
    private String name;

    @Nullable
    private String industry;

    @Nullable
    private String address;

    @Nullable
    private BigDecimal gps_lat;

    @Nullable
    private BigDecimal gps_long;

    @Nullable
    private String status;

    public Brand(@Nullable String name, @Nullable String industry, @Nullable String address, @Nullable BigDecimal gps_lat, @Nullable BigDecimal gps_long, @Nullable String status) {
        this.name = name;
        this.industry = industry;
        this.address = address;
        this.gps_lat = gps_lat;
        this.gps_long = gps_long;
        this.status = status;
    }

    public Brand() {

    }

    @Nullable
    public String getName() {
        return name;
    }

    @Nullable
    public String getIndustry() {
        return industry;
    }

    @Nullable
    public String getAddress() {
        return address;
    }

    @Nullable
    public BigDecimal getGps_lat() {
        return gps_lat;
    }

    @Nullable
    public BigDecimal getGps_long() {
        return gps_long;
    }

    @Nullable
    public String getStatus() {
        return status;
    }

    public void setName(@Nullable String name) {
        this.name = name;
    }

    public void setIndustry(@Nullable String industry) {
        this.industry = industry;
    }

    public void setAddress(@Nullable String address) {
        this.address = address;
    }

    public void setGps_lat(@Nullable BigDecimal gps_lat) {
        this.gps_lat = gps_lat;
    }

    public void setGps_long(@Nullable BigDecimal gps_long) {
        this.gps_long = gps_long;
    }

    public void setStatus(@Nullable String status) {
        this.status = status;
    }
}

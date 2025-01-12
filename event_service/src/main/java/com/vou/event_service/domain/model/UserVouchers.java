package com.vou.event_service.domain.model;

import jakarta.persistence.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
public class UserVouchers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id; // Unique primary key for the table

    @Column(nullable = false)
    private UUID voucherId; // Foreign key referencing Vouchers.voucher_id

    @Column(nullable = false)
    private UUID userId; // Foreign key referencing User.user_id

    @Column(nullable = false)
    private Integer quantity; // Quantity of vouchers owned by the user

    @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP")
    private OffsetDateTime updatedAt; // Last updated time

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(UUID voucherId) {
        this.voucherId = voucherId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}

package com.vou.event_service.adapter.in.web.controller;

import com.vou.event_service.application.grpc.EventGrpcClient;
import com.vou.event_service.application.service.EventParticipantsService;
import com.vou.event_service.application.service.UserVouchersService;
import com.vou.event_service.application.service.VoucherService;
import com.vou.event_service.domain.model.EventParticipants;
import com.vou.event_service.domain.model.UserVouchers;
import com.vou.event_service.domain.model.Voucher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/userVouchers")
public class UserVouchersController {

    @Autowired
    private UserVouchersService userVouchersService;

    @Autowired
    private VoucherService voucherService;

    @Autowired
    private EventGrpcClient eventGrpcClient;

    @PostMapping("/create")
    public ResponseEntity<UserVouchers> createUserVoucher(@RequestBody Map<String, String> requestBody) {
        String email = requestBody.get("email");
        String voucherIdString = requestBody.get("voucherId");

        if (email == null || voucherIdString == null) {
            return ResponseEntity.badRequest().build();
        }

        UUID voucherId = UUID.fromString(voucherIdString);

        // Call user_service to fetch user_id using email
        String userId = eventGrpcClient.GetUserIdFromEmail(email);

        // Create new UserVoucher
        UserVouchers userVoucher = new UserVouchers();
        userVoucher.setUserId(userId);
        userVoucher.setVoucherId(voucherId);
        userVoucher.setQuantity(0); // Default quantity
        userVoucher.setUpdatedAt(null); // Set updatedAt to null or default to now

        UserVouchers savedVoucher = userVouchersService.createUserVoucher(userVoucher);

        return ResponseEntity.ok(savedVoucher);
    }

    @PatchMapping("/update")
    public ResponseEntity<UserVouchers> updateUserVoucher(
            @RequestParam String email,
            @RequestParam String voucherId,
            @RequestBody Map<String, Integer> requestBody) {

        if (!requestBody.containsKey("quantity")) {
            return ResponseEntity.badRequest().build();
        }

        Integer quantity = requestBody.get("quantity");

        // Call user_service to fetch user_id using email
        String userId = eventGrpcClient.GetUserIdFromEmail(email);
        UUID voucherUUID = UUID.fromString(voucherId);

        // Find the user voucher record
        UserVouchers userVoucher = userVouchersService.findByUserIdAndVoucherId(userId, voucherUUID)
                .orElse(null);

        if (userVoucher == null) {
            return ResponseEntity.notFound().build();
        }

        // Update quantity and updatedAt
        userVoucher.setQuantity(quantity);
        userVoucher.setUpdatedAt(null); // Optional: Set current time if needed

        UserVouchers updatedVoucher = userVouchersService.updateUserVoucher(userVoucher);

        return ResponseEntity.ok(updatedVoucher);
    }

    @GetMapping
    public ResponseEntity<List<Map<String, Object>>> getUserVouchers(@RequestParam String email) {
        // Call user service to get userId
        String userId = eventGrpcClient.GetUserIdFromEmail(email);

        // Fetch all user vouchers
        List<UserVouchers> userVouchers = userVouchersService.findByUserId(userId);

        // Transform data to include voucher details
        List<Map<String, Object>> result = userVouchers.stream().map(userVoucher -> {
            Voucher voucherDetails = voucherService.findById(userVoucher.getVoucherId());
            return Map.of(
                    "voucherId", userVoucher.getVoucherId(),
                    "quantity", userVoucher.getQuantity(),
                    "detail", voucherDetails
            );
        }).collect(Collectors.toList());

        return ResponseEntity.ok(result);
    }
}

package com.vou.event_service.adapter.in.web.controller;

import com.vou.event_service.application.grpc.EventGrpcClient;
import com.vou.event_service.application.service.EventParticipantsService;
import com.vou.event_service.application.service.EventService;
import com.vou.event_service.application.service.VoucherService;
import com.vou.event_service.domain.model.Event;
import com.vou.event_service.domain.model.EventParticipants;
import com.vou.event_service.domain.model.Voucher;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/eventParticipants")
public class EventParticipantsController {

    @Autowired
    private EventParticipantsService eventParticipantsService;

    @Autowired
    private EventGrpcClient eventGrpcClient;

    @PostMapping("/create")
    public ResponseEntity<EventParticipants> createEventParticipant(@RequestBody Map<String, Object> requestBody) {
        // Validate input
        if (!requestBody.containsKey("email") || !requestBody.containsKey("event_id")) {
            return ResponseEntity.badRequest().body(null);
        }

        String email = (String) requestBody.get("email");
        Long eventId = Long.valueOf(String.valueOf(requestBody.get("event_id")));

        // Call user_service to fetch user_id using email
        String userId = eventGrpcClient.GetUserIdFromEmail(email);

        // Create new EventParticipants record with all quantities set to 0
        EventParticipants eventParticipant = new EventParticipants();
        eventParticipant.setEventId(eventId);
        eventParticipant.setUserId(UUID.fromString(userId));
        eventParticipant.setPlayerCredit(0);
        eventParticipant.setQuantityV(0);
        eventParticipant.setQuantityO(0);
        eventParticipant.setQuantityU(0);
        eventParticipant.setQuantityC(0);
        eventParticipant.setQuantityH(0);
        eventParticipant.setQuantityE(0);
        eventParticipant.setQuantityR(0);

        // Save to database
        EventParticipants savedParticipant = eventParticipantsService.createEventParticipant(eventParticipant);

        return ResponseEntity.ok(savedParticipant);
    }
}

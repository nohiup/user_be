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
import java.util.Optional;
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
        eventParticipant.setUserId(userId);
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

    @GetMapping
    public ResponseEntity<EventParticipants> getEventParticipant(
            @RequestParam String email, @RequestParam Long eventId) {

        // Call user_service to get user_id from email
        String userId = eventGrpcClient.GetUserIdFromEmail(email);

        // Find event participant based on eventId and userId
        Optional<EventParticipants> participant =
                eventParticipantsService.findByEventIdAndUserId(eventId, userId);

        return participant.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PatchMapping("/update")
    public ResponseEntity<EventParticipants> updateEventParticipant(
            @RequestParam String email, @RequestParam Long eventId, @RequestBody Map<String, Object> updates) {

        // Call user_service to get user_id from email
        String userId = eventGrpcClient.GetUserIdFromEmail(email);

        // Find event participant based on eventId and userId
        Optional<EventParticipants> participantOptional =
                eventParticipantsService.findByEventIdAndUserId(eventId, userId);

        if (participantOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        EventParticipants participant = participantOptional.get();

        // Update the fields based on the request body
        updates.forEach((key, value) -> {
            switch (key) {
                case "playerCredit":
                    participant.setPlayerCredit((Integer) value);
                    break;
                case "quantityV":
                    participant.setQuantityV((Integer) value);
                    break;
                case "quantityO":
                    participant.setQuantityO((Integer) value);
                    break;
                case "quantityU":
                    participant.setQuantityU((Integer) value);
                    break;
                case "quantityC":
                    participant.setQuantityC((Integer) value);
                    break;
                case "quantityH":
                    participant.setQuantityH((Integer) value);
                    break;
                case "quantityE":
                    participant.setQuantityE((Integer) value);
                    break;
                case "quantityR":
                    participant.setQuantityR((Integer) value);
                    break;
                default:
                    // Ignore unknown keys
            }
        });

        // Save the updated participant
        EventParticipants updatedParticipant = eventParticipantsService.updateEventParticipant(participant);

        return ResponseEntity.ok(updatedParticipant);
    }
}

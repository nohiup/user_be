package com.vou.event_service.adapter.in.web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vou.event_service.application.service.EventService;
import com.vou.event_service.application.service.VoucherService;
import com.vou.event_service.domain.model.Event;
import com.vou.event_service.domain.model.Voucher;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventService eventService;
    @Autowired
    private VoucherService voucherService;


    // Get all events
    @GetMapping("/")
    public ResponseEntity<List<Event>> getAllEvents() {
        List<Event> events = eventService.getAllEvents();
        return ResponseEntity.ok(events);
    }

    // Create a new event
    @PostMapping("/create")
    @Transactional
    public ResponseEntity<Event> createEvent(@RequestBody Event event) {
        if (event == null || event.getName() == null || event.getStart() == null || event.getEndDate() == null) {
            return ResponseEntity.badRequest().build();
        }

        // Save the event first (this will generate an event ID)
        Event savedEvent = eventService.createEvent(event);

        // Now handle the vouchers (if any)
        if (event.getVouchers() != null && !event.getVouchers().isEmpty()) {
            // Iterate over vouchers and set the event_id (FK)
            for (Voucher voucher : event.getVouchers()) {
                voucher.setEvent(savedEvent); // Associate voucher with the saved event
                voucherService.saveVoucher(voucher);  // Save each voucher
            }
        }

        return ResponseEntity.ok(savedEvent);
    }

    // Get event by ID
    @GetMapping("/{id}")
    public ResponseEntity<Event> getEvent(@PathVariable UUID id) {
        return eventService.getEventById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Update event by ID
    @PutMapping("/{id}/update")
    public ResponseEntity<Event> updateEvent(@PathVariable UUID id, @RequestBody Event event) {
        if (event.getStart().isAfter(event.getEndDate())) {
            return ResponseEntity.badRequest().body(null);
        }
        return ResponseEntity.ok(eventService.updateEvent(id, event));
    }


    // Delete event by ID
    @DeleteMapping("/{id}/delete")
    public ResponseEntity<Void> deleteEvent(@PathVariable UUID id) {
        eventService.deleteEvent(id);
        return ResponseEntity.noContent().build();
    }
}

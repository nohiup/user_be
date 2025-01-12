package com.vou.event_service.adapter.in.web.controller;

import com.vou.event_service.application.service.EventService;
import com.vou.event_service.domain.model.Event;
import com.vou.event_service.domain.model.Voucher;
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

    // Get all events
    @GetMapping("/")
    public ResponseEntity<List<Event>> getAllEvents() {
        List<Event> events = eventService.getAllEvents();
        return ResponseEntity.ok(events);
    }

    // Create a new event
    @PostMapping("/create")
    public ResponseEntity<Event> createEvent(@RequestBody Event event) {
        // Check if event is valid
        if (event == null) {
            return ResponseEntity.badRequest().build(); // Return 400 if event is null
        }

        // Optional: Check if the event has vouchers, and if they are valid
        if (event.getVouchers() != null && !event.getVouchers().isEmpty()) {
            for (Voucher voucher : event.getVouchers()) {
                // Validate each voucher if necessary
                if (voucher.getCode() == null || voucher.getCode().isEmpty()) {
                    return ResponseEntity.badRequest().body(null); // Return 400 if voucher code is empty
                }
            }
        }

        // Save event (with vouchers) using EventService
        Event savedEvent = eventService.createEvent(event);

        // Return the saved event
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

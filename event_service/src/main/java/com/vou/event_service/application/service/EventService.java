package com.vou.event_service.application.service;

import com.vou.common.proto.game.CreateGameRequest;
import com.vou.common.proto.game.CreateGameResponse;
import com.vou.common.proto.game.GameServiceGrpc;
import com.vou.event_service.domain.model.Event;
import com.vou.event_service.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;


    public List<Event> getAllEvents() {
        // Fetch events with vouchers eagerly
        return eventRepository.findAllWithVouchers();
    }

    public Event createEvent(Event event) {
        // Step 1: Create the Event
        Event newEvent = new Event();
        newEvent = eventRepository.save(event);
        return newEvent;
    }

    public Optional<Event> getEventById(UUID id) {
        return eventRepository.findById(id);
    }

    public Event updateEvent(UUID id, Event event) {
        Event existingEvent = eventRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Event not found"));
        existingEvent.setName(event.getName());
        existingEvent.setImage(event.getImage());
        return eventRepository.save(existingEvent);
    }

    public void deleteEvent(UUID id) {
        eventRepository.deleteById(id);
    }
}

package com.vou.event_service.application.service;

import com.vou.event_service.domain.model.Event;
import com.vou.event_service.domain.model.EventParticipants;
import com.vou.event_service.repository.EventParticipantsRepository;
import com.vou.event_service.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EventParticipantsService {

    @Autowired
    private EventParticipantsRepository eventParticipantsRepository;

    public EventParticipants createEventParticipant(EventParticipants eventParticipants) {
        return eventParticipantsRepository.save(eventParticipants);
    }

    public Optional<EventParticipants> findByEventIdAndUserId(Long eventId, String userId) {
        return eventParticipantsRepository.findByEventIdAndUserId(eventId, userId);
    }

    public EventParticipants updateEventParticipant(EventParticipants participant) {
        return eventParticipantsRepository.save(participant);
    }
}

package com.vou.event_service.repository;

import com.vou.event_service.domain.model.Event;
import com.vou.event_service.domain.model.EventParticipants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface EventParticipantsRepository extends JpaRepository<EventParticipants, Long> {

    Optional<EventParticipants> findByEventIdAndUserId(Long eventId, String userId);
}

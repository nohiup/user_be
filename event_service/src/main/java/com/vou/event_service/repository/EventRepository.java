package com.vou.event_service.repository;

import com.vou.event_service.domain.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface EventRepository extends JpaRepository<Event, UUID> {
    @Query("SELECT e FROM Event e LEFT JOIN FETCH e.vouchers")
    List<Event> findAllWithVouchers();
    /**
     * Finds an Event by its name.
     *
     * @param name the name of the event
     * @return an Optional containing the Event if found, or empty if not
     */
    Optional<Event> findByName(String name);

    /**
     * Checks if an Event exists with the given name.
     *
     * @param name the name of the event
     * @return true if an event with the given name exists, false otherwise
     */
    boolean existsByName(String name);
}

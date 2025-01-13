package com.vou.event_service.domain.exception;

/**
 * Exception thrown when an Event is not found.
 */
public class EventNotFoundException extends RuntimeException {

    /**
     * Constructor for EventNotFoundException with a default message.
     */
    public EventNotFoundException() {
        super("Event not found");
    }

    /**
     * Constructor for EventNotFoundException with a custom message.
     *
     * @param message the custom error message
     */
    public EventNotFoundException(String message) {
        super(message);
    }
}

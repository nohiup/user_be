package com.vou.game_service.infrastructure.grpc;//package com.vou.event_service.infrastructure.grpc;
//
//import com.google.protobuf.Empty;
//import com.vou.common.proto.event.EventServiceGrpc;
//import com.vou.event_service.adapter.in.web.dto.CreateEventRequest;
//import com.vou.event_service.adapter.in.web.dto.DeleteEventRequest;
//import com.vou.event_service.adapter.in.web.dto.EventResponse;
//import com.vou.event_service.adapter.in.web.dto.UpdateEventRequest;
//import com.vou.event_service.application.service.EventService;
//
//import com.vou.event_service.domain.model.Event;
//import io.grpc.stub.StreamObserver;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.UUID;
//
//@Service
//public class EventGrpcServiceImpl extends EventServiceGrpc.EventServiceImplBase {
//
//    @Autowired
//    private EventService eventService;
//
//    @Override
//    public void getAllEvents(Empty request, StreamObserver<EventResponse> responseObserver) {
//        try {
//            // Fetch all events from the service
//            List<Event> events = eventService.getAllEvents();
//
//            // Stream each event to the responseObserver
//            for (Event event : events) {
//                EventResponse response = EventResponse.newBuilder()
//                        .setId(event.getId().toString())
//                        .setName(event.getName())
//                        .setImage(event.getImage())
//                        .build();
//                responseObserver.onNext(response);
//            }
//
//            // Mark the response stream as completed
//            responseObserver.onCompleted();
//        } catch (Exception e) {
//            // Handle errors by sending the exception to the observer
//            responseObserver.onError(e);
//        }
//    }
//
//    // Create event
//    @Override
//    public void createEvent(CreateEventRequest request, StreamObserver<EventResponse> responseObserver) {
//        Event event = new Event(
//                UUID.randomUUID(),
//                request.getName(),
//                request.getImage(),
//                null,
//                null,
//                null
//        );
//
//        Event createdEvent = eventService.createEvent(event);
//        EventResponse response = EventResponse.newBuilder()
//                .setId(createdEvent.getId().toString())
//                .setName(createdEvent.getName())
//                .setImage(createdEvent.getImage())
//                .build();
//
//        responseObserver.onNext(response);
//        responseObserver.onCompleted();
//    }
//
//    // Update event
//    @Override
//    public void updateEvent(UpdateEventRequest request, StreamObserver<EventResponse> responseObserver) {
//        UUID eventId = UUID.fromString(request.getId());
//        Event event = new Event(
//                eventId,
//                request.getName(),
//                request.getImage(),
//                null,
//                null,
//                null
//        );
//
//        Event updatedEvent = eventService.updateEvent(eventId, event);
//        EventResponse response = EventResponse.newBuilder()
//                .setId(updatedEvent.getId().toString())
//                .setName(updatedEvent.getName())
//                .setImage(updatedEvent.getImage())
//                .build();
//
//        responseObserver.onNext(response);
//        responseObserver.onCompleted();
//    }
//
//    // Delete event
//    @Override
//    public void deleteEvent(DeleteEventRequest request, StreamObserver<Empty> responseObserver) {
//        UUID eventId = UUID.fromString(request.getId());
//        eventService.deleteEvent(eventId);
//
//        responseObserver.onNext(Empty.getDefaultInstance());
//        responseObserver.onCompleted();
//    }
//}

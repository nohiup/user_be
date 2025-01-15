package com.vou.common.proto.event;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.9.1)",
        comments = "Source: proto/event_service.proto")
public final class EventServiceGrpc {

    private EventServiceGrpc() {}

    public static final String SERVICE_NAME = "event.EventService";

    // Static method descriptors that strictly reflect the proto.
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @java.lang.Deprecated // Use {@link #getGetVoucherInfoMethod()} instead.
    public static final io.grpc.MethodDescriptor<com.vou.common.proto.event.GetVoucherMessage,
            com.vou.common.proto.event.GetVoucherResponse> METHOD_GET_VOUCHER_INFO = getGetVoucherInfoMethod();

    private static volatile io.grpc.MethodDescriptor<com.vou.common.proto.event.GetVoucherMessage,
            com.vou.common.proto.event.GetVoucherResponse> getGetVoucherInfoMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<com.vou.common.proto.event.GetVoucherMessage,
            com.vou.common.proto.event.GetVoucherResponse> getGetVoucherInfoMethod() {
        io.grpc.MethodDescriptor<com.vou.common.proto.event.GetVoucherMessage, com.vou.common.proto.event.GetVoucherResponse> getGetVoucherInfoMethod;
        if ((getGetVoucherInfoMethod = EventServiceGrpc.getGetVoucherInfoMethod) == null) {
            synchronized (EventServiceGrpc.class) {
                if ((getGetVoucherInfoMethod = EventServiceGrpc.getGetVoucherInfoMethod) == null) {
                    EventServiceGrpc.getGetVoucherInfoMethod = getGetVoucherInfoMethod =
                            io.grpc.MethodDescriptor.<com.vou.common.proto.event.GetVoucherMessage, com.vou.common.proto.event.GetVoucherResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "event.EventService", "getVoucherInfo"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.vou.common.proto.event.GetVoucherMessage.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.vou.common.proto.event.GetVoucherResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("getVoucherInfo"))
                                    .build();
                }
            }
        }
        return getGetVoucherInfoMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static EventServiceStub newStub(io.grpc.Channel channel) {
        return new EventServiceStub(channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static EventServiceBlockingStub newBlockingStub(
            io.grpc.Channel channel) {
        return new EventServiceBlockingStub(channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static EventServiceFutureStub newFutureStub(
            io.grpc.Channel channel) {
        return new EventServiceFutureStub(channel);
    }

    /**
     */
    public static abstract class EventServiceImplBase implements io.grpc.BindableService {

        /**
         */
        public void getVoucherInfo(com.vou.common.proto.event.GetVoucherMessage request,
                                   io.grpc.stub.StreamObserver<com.vou.common.proto.event.GetVoucherResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getGetVoucherInfoMethod(), responseObserver);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            getGetVoucherInfoMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.vou.common.proto.event.GetVoucherMessage,
                                            com.vou.common.proto.event.GetVoucherResponse>(
                                            this, METHODID_GET_VOUCHER_INFO)))
                    .build();
        }
    }

    /**
     */
    public static final class EventServiceStub extends io.grpc.stub.AbstractStub<EventServiceStub> {
        private EventServiceStub(io.grpc.Channel channel) {
            super(channel);
        }

        private EventServiceStub(io.grpc.Channel channel,
                                 io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected EventServiceStub build(io.grpc.Channel channel,
                                         io.grpc.CallOptions callOptions) {
            return new EventServiceStub(channel, callOptions);
        }

        /**
         */
        public void getVoucherInfo(com.vou.common.proto.event.GetVoucherMessage request,
                                   io.grpc.stub.StreamObserver<com.vou.common.proto.event.GetVoucherResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetVoucherInfoMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     */
    public static final class EventServiceBlockingStub extends io.grpc.stub.AbstractStub<EventServiceBlockingStub> {
        private EventServiceBlockingStub(io.grpc.Channel channel) {
            super(channel);
        }

        private EventServiceBlockingStub(io.grpc.Channel channel,
                                         io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected EventServiceBlockingStub build(io.grpc.Channel channel,
                                                 io.grpc.CallOptions callOptions) {
            return new EventServiceBlockingStub(channel, callOptions);
        }

        /**
         */
        public com.vou.common.proto.event.GetVoucherResponse getVoucherInfo(com.vou.common.proto.event.GetVoucherMessage request) {
            return blockingUnaryCall(
                    getChannel(), getGetVoucherInfoMethod(), getCallOptions(), request);
        }
    }

    /**
     */
    public static final class EventServiceFutureStub extends io.grpc.stub.AbstractStub<EventServiceFutureStub> {
        private EventServiceFutureStub(io.grpc.Channel channel) {
            super(channel);
        }

        private EventServiceFutureStub(io.grpc.Channel channel,
                                       io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected EventServiceFutureStub build(io.grpc.Channel channel,
                                               io.grpc.CallOptions callOptions) {
            return new EventServiceFutureStub(channel, callOptions);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.vou.common.proto.event.GetVoucherResponse> getVoucherInfo(
                com.vou.common.proto.event.GetVoucherMessage request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetVoucherInfoMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_GET_VOUCHER_INFO = 0;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final EventServiceImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(EventServiceImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_GET_VOUCHER_INFO:
                    serviceImpl.getVoucherInfo((com.vou.common.proto.event.GetVoucherMessage) request,
                            (io.grpc.stub.StreamObserver<com.vou.common.proto.event.GetVoucherResponse>) responseObserver);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(
                io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new AssertionError();
            }
        }
    }

    private static abstract class EventServiceBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
        EventServiceBaseDescriptorSupplier() {}

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return com.vou.common.proto.event.EventReceiver.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("EventService");
        }
    }

    private static final class EventServiceFileDescriptorSupplier
            extends EventServiceBaseDescriptorSupplier {
        EventServiceFileDescriptorSupplier() {}
    }

    private static final class EventServiceMethodDescriptorSupplier
            extends EventServiceBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
        private final String methodName;

        EventServiceMethodDescriptorSupplier(String methodName) {
            this.methodName = methodName;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(methodName);
        }
    }

    private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

    public static io.grpc.ServiceDescriptor getServiceDescriptor() {
        io.grpc.ServiceDescriptor result = serviceDescriptor;
        if (result == null) {
            synchronized (EventServiceGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                            .setSchemaDescriptor(new EventServiceFileDescriptorSupplier())
                            .addMethod(getGetVoucherInfoMethod())
                            .build();
                }
            }
        }
        return result;
    }
}
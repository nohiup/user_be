package com.vou.common.proto;

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
public final class GetBrandServiceGrpc {

  private GetBrandServiceGrpc() {}

  public static final String SERVICE_NAME = "event.GetBrandService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetBrandMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.vou.common.proto.RequestUser,
      com.vou.common.proto.ResponseBrand> METHOD_GET_BRAND = getGetBrandMethod();

  private static volatile io.grpc.MethodDescriptor<com.vou.common.proto.RequestUser,
      com.vou.common.proto.ResponseBrand> getGetBrandMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.vou.common.proto.RequestUser,
      com.vou.common.proto.ResponseBrand> getGetBrandMethod() {
    io.grpc.MethodDescriptor<com.vou.common.proto.RequestUser, com.vou.common.proto.ResponseBrand> getGetBrandMethod;
    if ((getGetBrandMethod = GetBrandServiceGrpc.getGetBrandMethod) == null) {
      synchronized (GetBrandServiceGrpc.class) {
        if ((getGetBrandMethod = GetBrandServiceGrpc.getGetBrandMethod) == null) {
          GetBrandServiceGrpc.getGetBrandMethod = getGetBrandMethod = 
              io.grpc.MethodDescriptor.<com.vou.common.proto.RequestUser, com.vou.common.proto.ResponseBrand>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event.GetBrandService", "getBrand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vou.common.proto.RequestUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vou.common.proto.ResponseBrand.getDefaultInstance()))
                  .setSchemaDescriptor(new GetBrandServiceMethodDescriptorSupplier("getBrand"))
                  .build();
          }
        }
     }
     return getGetBrandMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GetBrandServiceStub newStub(io.grpc.Channel channel) {
    return new GetBrandServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GetBrandServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GetBrandServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GetBrandServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GetBrandServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GetBrandServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getBrand(com.vou.common.proto.RequestUser request,
        io.grpc.stub.StreamObserver<com.vou.common.proto.ResponseBrand> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBrandMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBrandMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.vou.common.proto.RequestUser,
                com.vou.common.proto.ResponseBrand>(
                  this, METHODID_GET_BRAND)))
          .build();
    }
  }

  /**
   */
  public static final class GetBrandServiceStub extends io.grpc.stub.AbstractStub<GetBrandServiceStub> {
    private GetBrandServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetBrandServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetBrandServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetBrandServiceStub(channel, callOptions);
    }

    /**
     */
    public void getBrand(com.vou.common.proto.RequestUser request,
        io.grpc.stub.StreamObserver<com.vou.common.proto.ResponseBrand> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBrandMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GetBrandServiceBlockingStub extends io.grpc.stub.AbstractStub<GetBrandServiceBlockingStub> {
    private GetBrandServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetBrandServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetBrandServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetBrandServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.vou.common.proto.ResponseBrand getBrand(com.vou.common.proto.RequestUser request) {
      return blockingUnaryCall(
          getChannel(), getGetBrandMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GetBrandServiceFutureStub extends io.grpc.stub.AbstractStub<GetBrandServiceFutureStub> {
    private GetBrandServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetBrandServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetBrandServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetBrandServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.vou.common.proto.ResponseBrand> getBrand(
        com.vou.common.proto.RequestUser request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBrandMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BRAND = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GetBrandServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GetBrandServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BRAND:
          serviceImpl.getBrand((com.vou.common.proto.RequestUser) request,
              (io.grpc.stub.StreamObserver<com.vou.common.proto.ResponseBrand>) responseObserver);
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

  private static abstract class GetBrandServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GetBrandServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.vou.common.proto.EventServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GetBrandService");
    }
  }

  private static final class GetBrandServiceFileDescriptorSupplier
      extends GetBrandServiceBaseDescriptorSupplier {
    GetBrandServiceFileDescriptorSupplier() {}
  }

  private static final class GetBrandServiceMethodDescriptorSupplier
      extends GetBrandServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GetBrandServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GetBrandServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GetBrandServiceFileDescriptorSupplier())
              .addMethod(getGetBrandMethod())
              .build();
        }
      }
    }
    return result;
  }
}

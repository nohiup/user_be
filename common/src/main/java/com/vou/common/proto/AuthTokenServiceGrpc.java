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
    comments = "Source: proto/auth_service.proto")
public final class AuthTokenServiceGrpc {

  private AuthTokenServiceGrpc() {}

  public static final String SERVICE_NAME = "auth.AuthTokenService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSendTokenMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.vou.common.proto.AuthTokenMessage,
      com.vou.common.proto.AuthTokenResponse> METHOD_SEND_TOKEN = getSendTokenMethod();

  private static volatile io.grpc.MethodDescriptor<com.vou.common.proto.AuthTokenMessage,
      com.vou.common.proto.AuthTokenResponse> getSendTokenMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.vou.common.proto.AuthTokenMessage,
      com.vou.common.proto.AuthTokenResponse> getSendTokenMethod() {
    io.grpc.MethodDescriptor<com.vou.common.proto.AuthTokenMessage, com.vou.common.proto.AuthTokenResponse> getSendTokenMethod;
    if ((getSendTokenMethod = AuthTokenServiceGrpc.getSendTokenMethod) == null) {
      synchronized (AuthTokenServiceGrpc.class) {
        if ((getSendTokenMethod = AuthTokenServiceGrpc.getSendTokenMethod) == null) {
          AuthTokenServiceGrpc.getSendTokenMethod = getSendTokenMethod = 
              io.grpc.MethodDescriptor.<com.vou.common.proto.AuthTokenMessage, com.vou.common.proto.AuthTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "auth.AuthTokenService", "sendToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vou.common.proto.AuthTokenMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vou.common.proto.AuthTokenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthTokenServiceMethodDescriptorSupplier("sendToken"))
                  .build();
          }
        }
     }
     return getSendTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthTokenServiceStub newStub(io.grpc.Channel channel) {
    return new AuthTokenServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthTokenServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuthTokenServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthTokenServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuthTokenServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AuthTokenServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendToken(com.vou.common.proto.AuthTokenMessage request,
        io.grpc.stub.StreamObserver<com.vou.common.proto.AuthTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendTokenMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.vou.common.proto.AuthTokenMessage,
                com.vou.common.proto.AuthTokenResponse>(
                  this, METHODID_SEND_TOKEN)))
          .build();
    }
  }

  /**
   */
  public static final class AuthTokenServiceStub extends io.grpc.stub.AbstractStub<AuthTokenServiceStub> {
    private AuthTokenServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthTokenServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthTokenServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthTokenServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendToken(com.vou.common.proto.AuthTokenMessage request,
        io.grpc.stub.StreamObserver<com.vou.common.proto.AuthTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthTokenServiceBlockingStub extends io.grpc.stub.AbstractStub<AuthTokenServiceBlockingStub> {
    private AuthTokenServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthTokenServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthTokenServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthTokenServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.vou.common.proto.AuthTokenResponse sendToken(com.vou.common.proto.AuthTokenMessage request) {
      return blockingUnaryCall(
          getChannel(), getSendTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthTokenServiceFutureStub extends io.grpc.stub.AbstractStub<AuthTokenServiceFutureStub> {
    private AuthTokenServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthTokenServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthTokenServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthTokenServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.vou.common.proto.AuthTokenResponse> sendToken(
        com.vou.common.proto.AuthTokenMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getSendTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_TOKEN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthTokenServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthTokenServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_TOKEN:
          serviceImpl.sendToken((com.vou.common.proto.AuthTokenMessage) request,
              (io.grpc.stub.StreamObserver<com.vou.common.proto.AuthTokenResponse>) responseObserver);
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

  private static abstract class AuthTokenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthTokenServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.vou.common.proto.AuthServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthTokenService");
    }
  }

  private static final class AuthTokenServiceFileDescriptorSupplier
      extends AuthTokenServiceBaseDescriptorSupplier {
    AuthTokenServiceFileDescriptorSupplier() {}
  }

  private static final class AuthTokenServiceMethodDescriptorSupplier
      extends AuthTokenServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthTokenServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthTokenServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthTokenServiceFileDescriptorSupplier())
              .addMethod(getSendTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}

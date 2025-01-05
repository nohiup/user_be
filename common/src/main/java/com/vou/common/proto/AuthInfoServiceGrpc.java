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
 * <pre>
 *Service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.9.1)",
    comments = "Source: proto/auth_service.proto")
public final class AuthInfoServiceGrpc {

  private AuthInfoServiceGrpc() {}

  public static final String SERVICE_NAME = "auth.AuthInfoService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSendUserIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.vou.common.proto.UserInfoMessage,
      com.vou.common.proto.UserInfoResponse> METHOD_SEND_USER_ID = getSendUserIdMethod();

  private static volatile io.grpc.MethodDescriptor<com.vou.common.proto.UserInfoMessage,
      com.vou.common.proto.UserInfoResponse> getSendUserIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.vou.common.proto.UserInfoMessage,
      com.vou.common.proto.UserInfoResponse> getSendUserIdMethod() {
    io.grpc.MethodDescriptor<com.vou.common.proto.UserInfoMessage, com.vou.common.proto.UserInfoResponse> getSendUserIdMethod;
    if ((getSendUserIdMethod = AuthInfoServiceGrpc.getSendUserIdMethod) == null) {
      synchronized (AuthInfoServiceGrpc.class) {
        if ((getSendUserIdMethod = AuthInfoServiceGrpc.getSendUserIdMethod) == null) {
          AuthInfoServiceGrpc.getSendUserIdMethod = getSendUserIdMethod = 
              io.grpc.MethodDescriptor.<com.vou.common.proto.UserInfoMessage, com.vou.common.proto.UserInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "auth.AuthInfoService", "sendUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vou.common.proto.UserInfoMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vou.common.proto.UserInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthInfoServiceMethodDescriptorSupplier("sendUserId"))
                  .build();
          }
        }
     }
     return getSendUserIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthInfoServiceStub newStub(io.grpc.Channel channel) {
    return new AuthInfoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthInfoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuthInfoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthInfoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuthInfoServiceFutureStub(channel);
  }

  /**
   * <pre>
   *Service
   * </pre>
   */
  public static abstract class AuthInfoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendUserId(com.vou.common.proto.UserInfoMessage request,
        io.grpc.stub.StreamObserver<com.vou.common.proto.UserInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendUserIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendUserIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.vou.common.proto.UserInfoMessage,
                com.vou.common.proto.UserInfoResponse>(
                  this, METHODID_SEND_USER_ID)))
          .build();
    }
  }

  /**
   * <pre>
   *Service
   * </pre>
   */
  public static final class AuthInfoServiceStub extends io.grpc.stub.AbstractStub<AuthInfoServiceStub> {
    private AuthInfoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthInfoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthInfoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthInfoServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendUserId(com.vou.common.proto.UserInfoMessage request,
        io.grpc.stub.StreamObserver<com.vou.common.proto.UserInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendUserIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *Service
   * </pre>
   */
  public static final class AuthInfoServiceBlockingStub extends io.grpc.stub.AbstractStub<AuthInfoServiceBlockingStub> {
    private AuthInfoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthInfoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthInfoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthInfoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.vou.common.proto.UserInfoResponse sendUserId(com.vou.common.proto.UserInfoMessage request) {
      return blockingUnaryCall(
          getChannel(), getSendUserIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Service
   * </pre>
   */
  public static final class AuthInfoServiceFutureStub extends io.grpc.stub.AbstractStub<AuthInfoServiceFutureStub> {
    private AuthInfoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthInfoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthInfoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthInfoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.vou.common.proto.UserInfoResponse> sendUserId(
        com.vou.common.proto.UserInfoMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getSendUserIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_USER_ID = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthInfoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthInfoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_USER_ID:
          serviceImpl.sendUserId((com.vou.common.proto.UserInfoMessage) request,
              (io.grpc.stub.StreamObserver<com.vou.common.proto.UserInfoResponse>) responseObserver);
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

  private static abstract class AuthInfoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthInfoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.vou.common.proto.AuthServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthInfoService");
    }
  }

  private static final class AuthInfoServiceFileDescriptorSupplier
      extends AuthInfoServiceBaseDescriptorSupplier {
    AuthInfoServiceFileDescriptorSupplier() {}
  }

  private static final class AuthInfoServiceMethodDescriptorSupplier
      extends AuthInfoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthInfoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthInfoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthInfoServiceFileDescriptorSupplier())
              .addMethod(getSendUserIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}

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
public final class AuthServiceGrpc {

  private AuthServiceGrpc() {}

  public static final String SERVICE_NAME = "auth.AuthService";

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
    if ((getSendUserIdMethod = AuthServiceGrpc.getSendUserIdMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getSendUserIdMethod = AuthServiceGrpc.getSendUserIdMethod) == null) {
          AuthServiceGrpc.getSendUserIdMethod = getSendUserIdMethod = 
              io.grpc.MethodDescriptor.<com.vou.common.proto.UserInfoMessage, com.vou.common.proto.UserInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "auth.AuthService", "sendUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vou.common.proto.UserInfoMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vou.common.proto.UserInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("sendUserId"))
                  .build();
          }
        }
     }
     return getSendUserIdMethod;
  }
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
    if ((getSendTokenMethod = AuthServiceGrpc.getSendTokenMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getSendTokenMethod = AuthServiceGrpc.getSendTokenMethod) == null) {
          AuthServiceGrpc.getSendTokenMethod = getSendTokenMethod = 
              io.grpc.MethodDescriptor.<com.vou.common.proto.AuthTokenMessage, com.vou.common.proto.AuthTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "auth.AuthService", "sendToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vou.common.proto.AuthTokenMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vou.common.proto.AuthTokenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("sendToken"))
                  .build();
          }
        }
     }
     return getSendTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthServiceStub newStub(io.grpc.Channel channel) {
    return new AuthServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuthServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuthServiceFutureStub(channel);
  }

  /**
   * <pre>
   *Service
   * </pre>
   */
  public static abstract class AuthServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendUserId(com.vou.common.proto.UserInfoMessage request,
        io.grpc.stub.StreamObserver<com.vou.common.proto.UserInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendUserIdMethod(), responseObserver);
    }

    /**
     */
    public void sendToken(com.vou.common.proto.AuthTokenMessage request,
        io.grpc.stub.StreamObserver<com.vou.common.proto.AuthTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendTokenMethod(), responseObserver);
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
   * <pre>
   *Service
   * </pre>
   */
  public static final class AuthServiceStub extends io.grpc.stub.AbstractStub<AuthServiceStub> {
    private AuthServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendUserId(com.vou.common.proto.UserInfoMessage request,
        io.grpc.stub.StreamObserver<com.vou.common.proto.UserInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendUserIdMethod(), getCallOptions()), request, responseObserver);
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
   * <pre>
   *Service
   * </pre>
   */
  public static final class AuthServiceBlockingStub extends io.grpc.stub.AbstractStub<AuthServiceBlockingStub> {
    private AuthServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.vou.common.proto.UserInfoResponse sendUserId(com.vou.common.proto.UserInfoMessage request) {
      return blockingUnaryCall(
          getChannel(), getSendUserIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.vou.common.proto.AuthTokenResponse sendToken(com.vou.common.proto.AuthTokenMessage request) {
      return blockingUnaryCall(
          getChannel(), getSendTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Service
   * </pre>
   */
  public static final class AuthServiceFutureStub extends io.grpc.stub.AbstractStub<AuthServiceFutureStub> {
    private AuthServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.vou.common.proto.UserInfoResponse> sendUserId(
        com.vou.common.proto.UserInfoMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getSendUserIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.vou.common.proto.AuthTokenResponse> sendToken(
        com.vou.common.proto.AuthTokenMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getSendTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_USER_ID = 0;
  private static final int METHODID_SEND_TOKEN = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthServiceImplBase serviceImpl, int methodId) {
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

  private static abstract class AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.vou.common.proto.AuthServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthService");
    }
  }

  private static final class AuthServiceFileDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier {
    AuthServiceFileDescriptorSupplier() {}
  }

  private static final class AuthServiceMethodDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthServiceFileDescriptorSupplier())
              .addMethod(getSendUserIdMethod())
              .addMethod(getSendTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}

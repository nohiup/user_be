package com.vou.common.proto.user;

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
    comments = "Source: proto/user_service.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "user.UserService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getReceiveUIDMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.vou.common.proto.user.SendUIDMessage,
      com.vou.common.proto.user.SendUIDResponse> METHOD_RECEIVE_UID = getReceiveUIDMethod();

  private static volatile io.grpc.MethodDescriptor<com.vou.common.proto.user.SendUIDMessage,
      com.vou.common.proto.user.SendUIDResponse> getReceiveUIDMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.vou.common.proto.user.SendUIDMessage,
      com.vou.common.proto.user.SendUIDResponse> getReceiveUIDMethod() {
    io.grpc.MethodDescriptor<com.vou.common.proto.user.SendUIDMessage, com.vou.common.proto.user.SendUIDResponse> getReceiveUIDMethod;
    if ((getReceiveUIDMethod = UserServiceGrpc.getReceiveUIDMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getReceiveUIDMethod = UserServiceGrpc.getReceiveUIDMethod) == null) {
          UserServiceGrpc.getReceiveUIDMethod = getReceiveUIDMethod = 
              io.grpc.MethodDescriptor.<com.vou.common.proto.user.SendUIDMessage, com.vou.common.proto.user.SendUIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user.UserService", "receiveUID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vou.common.proto.user.SendUIDMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vou.common.proto.user.SendUIDResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("receiveUID"))
                  .build();
          }
        }
     }
     return getReceiveUIDMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetUserIdFromEmailMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.vou.common.proto.user.GetUserIdFromEmailMessage,
      com.vou.common.proto.user.GetUserIdFromEmailResponse> METHOD_GET_USER_ID_FROM_EMAIL = getGetUserIdFromEmailMethod();

  private static volatile io.grpc.MethodDescriptor<com.vou.common.proto.user.GetUserIdFromEmailMessage,
      com.vou.common.proto.user.GetUserIdFromEmailResponse> getGetUserIdFromEmailMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.vou.common.proto.user.GetUserIdFromEmailMessage,
      com.vou.common.proto.user.GetUserIdFromEmailResponse> getGetUserIdFromEmailMethod() {
    io.grpc.MethodDescriptor<com.vou.common.proto.user.GetUserIdFromEmailMessage, com.vou.common.proto.user.GetUserIdFromEmailResponse> getGetUserIdFromEmailMethod;
    if ((getGetUserIdFromEmailMethod = UserServiceGrpc.getGetUserIdFromEmailMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserIdFromEmailMethod = UserServiceGrpc.getGetUserIdFromEmailMethod) == null) {
          UserServiceGrpc.getGetUserIdFromEmailMethod = getGetUserIdFromEmailMethod = 
              io.grpc.MethodDescriptor.<com.vou.common.proto.user.GetUserIdFromEmailMessage, com.vou.common.proto.user.GetUserIdFromEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user.UserService", "getUserIdFromEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vou.common.proto.user.GetUserIdFromEmailMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vou.common.proto.user.GetUserIdFromEmailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserIdFromEmail"))
                  .build();
          }
        }
     }
     return getGetUserIdFromEmailMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetCurrentUserIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.vou.common.proto.user.CurrentUIDMessage,
      com.vou.common.proto.user.CurrentUIDResponse> METHOD_GET_CURRENT_USER_ID = getGetCurrentUserIdMethod();

  private static volatile io.grpc.MethodDescriptor<com.vou.common.proto.user.CurrentUIDMessage,
      com.vou.common.proto.user.CurrentUIDResponse> getGetCurrentUserIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.vou.common.proto.user.CurrentUIDMessage,
      com.vou.common.proto.user.CurrentUIDResponse> getGetCurrentUserIdMethod() {
    io.grpc.MethodDescriptor<com.vou.common.proto.user.CurrentUIDMessage, com.vou.common.proto.user.CurrentUIDResponse> getGetCurrentUserIdMethod;
    if ((getGetCurrentUserIdMethod = UserServiceGrpc.getGetCurrentUserIdMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetCurrentUserIdMethod = UserServiceGrpc.getGetCurrentUserIdMethod) == null) {
          UserServiceGrpc.getGetCurrentUserIdMethod = getGetCurrentUserIdMethod = 
              io.grpc.MethodDescriptor.<com.vou.common.proto.user.CurrentUIDMessage, com.vou.common.proto.user.CurrentUIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user.UserService", "getCurrentUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vou.common.proto.user.CurrentUIDMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vou.common.proto.user.CurrentUIDResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getCurrentUserId"))
                  .build();
          }
        }
     }
     return getGetCurrentUserIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void receiveUID(com.vou.common.proto.user.SendUIDMessage request,
        io.grpc.stub.StreamObserver<com.vou.common.proto.user.SendUIDResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReceiveUIDMethod(), responseObserver);
    }

    /**
     */
    public void getUserIdFromEmail(com.vou.common.proto.user.GetUserIdFromEmailMessage request,
        io.grpc.stub.StreamObserver<com.vou.common.proto.user.GetUserIdFromEmailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserIdFromEmailMethod(), responseObserver);
    }

    /**
     */
    public void getCurrentUserId(com.vou.common.proto.user.CurrentUIDMessage request,
        io.grpc.stub.StreamObserver<com.vou.common.proto.user.CurrentUIDResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCurrentUserIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReceiveUIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.vou.common.proto.user.SendUIDMessage,
                com.vou.common.proto.user.SendUIDResponse>(
                  this, METHODID_RECEIVE_UID)))
          .addMethod(
            getGetUserIdFromEmailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.vou.common.proto.user.GetUserIdFromEmailMessage,
                com.vou.common.proto.user.GetUserIdFromEmailResponse>(
                  this, METHODID_GET_USER_ID_FROM_EMAIL)))
          .addMethod(
            getGetCurrentUserIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.vou.common.proto.user.CurrentUIDMessage,
                com.vou.common.proto.user.CurrentUIDResponse>(
                  this, METHODID_GET_CURRENT_USER_ID)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void receiveUID(com.vou.common.proto.user.SendUIDMessage request,
        io.grpc.stub.StreamObserver<com.vou.common.proto.user.SendUIDResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReceiveUIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserIdFromEmail(com.vou.common.proto.user.GetUserIdFromEmailMessage request,
        io.grpc.stub.StreamObserver<com.vou.common.proto.user.GetUserIdFromEmailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserIdFromEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCurrentUserId(com.vou.common.proto.user.CurrentUIDMessage request,
        io.grpc.stub.StreamObserver<com.vou.common.proto.user.CurrentUIDResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCurrentUserIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.vou.common.proto.user.SendUIDResponse receiveUID(com.vou.common.proto.user.SendUIDMessage request) {
      return blockingUnaryCall(
          getChannel(), getReceiveUIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.vou.common.proto.user.GetUserIdFromEmailResponse getUserIdFromEmail(com.vou.common.proto.user.GetUserIdFromEmailMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetUserIdFromEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.vou.common.proto.user.CurrentUIDResponse getCurrentUserId(com.vou.common.proto.user.CurrentUIDMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetCurrentUserIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.vou.common.proto.user.SendUIDResponse> receiveUID(
        com.vou.common.proto.user.SendUIDMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getReceiveUIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.vou.common.proto.user.GetUserIdFromEmailResponse> getUserIdFromEmail(
        com.vou.common.proto.user.GetUserIdFromEmailMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserIdFromEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.vou.common.proto.user.CurrentUIDResponse> getCurrentUserId(
        com.vou.common.proto.user.CurrentUIDMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCurrentUserIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RECEIVE_UID = 0;
  private static final int METHODID_GET_USER_ID_FROM_EMAIL = 1;
  private static final int METHODID_GET_CURRENT_USER_ID = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECEIVE_UID:
          serviceImpl.receiveUID((com.vou.common.proto.user.SendUIDMessage) request,
              (io.grpc.stub.StreamObserver<com.vou.common.proto.user.SendUIDResponse>) responseObserver);
          break;
        case METHODID_GET_USER_ID_FROM_EMAIL:
          serviceImpl.getUserIdFromEmail((com.vou.common.proto.user.GetUserIdFromEmailMessage) request,
              (io.grpc.stub.StreamObserver<com.vou.common.proto.user.GetUserIdFromEmailResponse>) responseObserver);
          break;
        case METHODID_GET_CURRENT_USER_ID:
          serviceImpl.getCurrentUserId((com.vou.common.proto.user.CurrentUIDMessage) request,
              (io.grpc.stub.StreamObserver<com.vou.common.proto.user.CurrentUIDResponse>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.vou.common.proto.user.UserReceiver.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getReceiveUIDMethod())
              .addMethod(getGetUserIdFromEmailMethod())
              .addMethod(getGetCurrentUserIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}

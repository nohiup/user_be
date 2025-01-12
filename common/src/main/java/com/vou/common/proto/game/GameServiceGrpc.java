package com.vou.common.proto.game;

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
    comments = "Source: game_service.proto")
public final class GameServiceGrpc {

  private GameServiceGrpc() {}

  public static final String SERVICE_NAME = "game.GameService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetGameInfoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.vou.common.proto.game.GameInfoRequest,
      com.vou.common.proto.game.GameInfoResponse> METHOD_GET_GAME_INFO = getGetGameInfoMethod();

  private static volatile io.grpc.MethodDescriptor<com.vou.common.proto.game.GameInfoRequest,
      com.vou.common.proto.game.GameInfoResponse> getGetGameInfoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.vou.common.proto.game.GameInfoRequest,
      com.vou.common.proto.game.GameInfoResponse> getGetGameInfoMethod() {
    io.grpc.MethodDescriptor<com.vou.common.proto.game.GameInfoRequest, com.vou.common.proto.game.GameInfoResponse> getGetGameInfoMethod;
    if ((getGetGameInfoMethod = GameServiceGrpc.getGetGameInfoMethod) == null) {
      synchronized (GameServiceGrpc.class) {
        if ((getGetGameInfoMethod = GameServiceGrpc.getGetGameInfoMethod) == null) {
          GameServiceGrpc.getGetGameInfoMethod = getGetGameInfoMethod = 
              io.grpc.MethodDescriptor.<com.vou.common.proto.game.GameInfoRequest, com.vou.common.proto.game.GameInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "game.GameService", "getGameInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vou.common.proto.game.GameInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vou.common.proto.game.GameInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GameServiceMethodDescriptorSupplier("getGameInfo"))
                  .build();
          }
        }
     }
     return getGetGameInfoMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateGameForEventMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.vou.common.proto.game.CreateGameRequest,
      com.vou.common.proto.game.CreateGameResponse> METHOD_CREATE_GAME_FOR_EVENT = getCreateGameForEventMethod();

  private static volatile io.grpc.MethodDescriptor<com.vou.common.proto.game.CreateGameRequest,
      com.vou.common.proto.game.CreateGameResponse> getCreateGameForEventMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.vou.common.proto.game.CreateGameRequest,
      com.vou.common.proto.game.CreateGameResponse> getCreateGameForEventMethod() {
    io.grpc.MethodDescriptor<com.vou.common.proto.game.CreateGameRequest, com.vou.common.proto.game.CreateGameResponse> getCreateGameForEventMethod;
    if ((getCreateGameForEventMethod = GameServiceGrpc.getCreateGameForEventMethod) == null) {
      synchronized (GameServiceGrpc.class) {
        if ((getCreateGameForEventMethod = GameServiceGrpc.getCreateGameForEventMethod) == null) {
          GameServiceGrpc.getCreateGameForEventMethod = getCreateGameForEventMethod = 
              io.grpc.MethodDescriptor.<com.vou.common.proto.game.CreateGameRequest, com.vou.common.proto.game.CreateGameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "game.GameService", "CreateGameForEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vou.common.proto.game.CreateGameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vou.common.proto.game.CreateGameResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GameServiceMethodDescriptorSupplier("CreateGameForEvent"))
                  .build();
          }
        }
     }
     return getCreateGameForEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GameServiceStub newStub(io.grpc.Channel channel) {
    return new GameServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GameServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GameServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GameServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GameServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GameServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getGameInfo(com.vou.common.proto.game.GameInfoRequest request,
        io.grpc.stub.StreamObserver<com.vou.common.proto.game.GameInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGameInfoMethod(), responseObserver);
    }

    /**
     */
    public void createGameForEvent(com.vou.common.proto.game.CreateGameRequest request,
        io.grpc.stub.StreamObserver<com.vou.common.proto.game.CreateGameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateGameForEventMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetGameInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.vou.common.proto.game.GameInfoRequest,
                com.vou.common.proto.game.GameInfoResponse>(
                  this, METHODID_GET_GAME_INFO)))
          .addMethod(
            getCreateGameForEventMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.vou.common.proto.game.CreateGameRequest,
                com.vou.common.proto.game.CreateGameResponse>(
                  this, METHODID_CREATE_GAME_FOR_EVENT)))
          .build();
    }
  }

  /**
   */
  public static final class GameServiceStub extends io.grpc.stub.AbstractStub<GameServiceStub> {
    private GameServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GameServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GameServiceStub(channel, callOptions);
    }

    /**
     */
    public void getGameInfo(com.vou.common.proto.game.GameInfoRequest request,
        io.grpc.stub.StreamObserver<com.vou.common.proto.game.GameInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGameInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createGameForEvent(com.vou.common.proto.game.CreateGameRequest request,
        io.grpc.stub.StreamObserver<com.vou.common.proto.game.CreateGameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateGameForEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GameServiceBlockingStub extends io.grpc.stub.AbstractStub<GameServiceBlockingStub> {
    private GameServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GameServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GameServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.vou.common.proto.game.GameInfoResponse getGameInfo(com.vou.common.proto.game.GameInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGameInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.vou.common.proto.game.CreateGameResponse createGameForEvent(com.vou.common.proto.game.CreateGameRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateGameForEventMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GameServiceFutureStub extends io.grpc.stub.AbstractStub<GameServiceFutureStub> {
    private GameServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GameServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GameServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.vou.common.proto.game.GameInfoResponse> getGameInfo(
        com.vou.common.proto.game.GameInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGameInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.vou.common.proto.game.CreateGameResponse> createGameForEvent(
        com.vou.common.proto.game.CreateGameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateGameForEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_GAME_INFO = 0;
  private static final int METHODID_CREATE_GAME_FOR_EVENT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GameServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GameServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_GAME_INFO:
          serviceImpl.getGameInfo((com.vou.common.proto.game.GameInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.vou.common.proto.game.GameInfoResponse>) responseObserver);
          break;
        case METHODID_CREATE_GAME_FOR_EVENT:
          serviceImpl.createGameForEvent((com.vou.common.proto.game.CreateGameRequest) request,
              (io.grpc.stub.StreamObserver<com.vou.common.proto.game.CreateGameResponse>) responseObserver);
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

  private static abstract class GameServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GameServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.vou.common.proto.game.GameReceiver.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GameService");
    }
  }

  private static final class GameServiceFileDescriptorSupplier
      extends GameServiceBaseDescriptorSupplier {
    GameServiceFileDescriptorSupplier() {}
  }

  private static final class GameServiceMethodDescriptorSupplier
      extends GameServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GameServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GameServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GameServiceFileDescriptorSupplier())
              .addMethod(getGetGameInfoMethod())
              .addMethod(getCreateGameForEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}

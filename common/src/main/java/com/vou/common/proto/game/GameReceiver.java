// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: game_service.proto

package com.vou.common.proto.game;

public final class GameReceiver {
  private GameReceiver() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_game_GameInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_game_GameInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_game_GameInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_game_GameInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_game_CreateGameRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_game_CreateGameRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_game_CreateGameResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_game_CreateGameResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022game_service.proto\022\004game\"!\n\017GameInfoRe" +
      "quest\022\016\n\006gameId\030\001 \001(\t\"\"\n\020GameInfoRespons" +
      "e\022\016\n\006userId\030\001 \001(\t\"K\n\021CreateGameRequest\022\020" +
      "\n\010event_id\030\001 \001(\003\022\021\n\tgame_name\030\002 \001(\t\022\021\n\tg" +
      "ame_type\030\003 \001(\t\"+\n\022CreateGameResponse\022\025\n\r" +
      "event_game_id\030\001 \001(\0032\224\001\n\013GameService\022<\n\013g" +
      "etGameInfo\022\025.game.GameInfoRequest\032\026.game" +
      ".GameInfoResponse\022G\n\022CreateGameForEvent\022" +
      "\027.game.CreateGameRequest\032\030.game.CreateGa" +
      "meResponseB+\n\031com.vou.common.proto.gameB" +
      "\014GameReceiverP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_game_GameInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_game_GameInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_game_GameInfoRequest_descriptor,
        new java.lang.String[] { "GameId", });
    internal_static_game_GameInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_game_GameInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_game_GameInfoResponse_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_game_CreateGameRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_game_CreateGameRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_game_CreateGameRequest_descriptor,
        new java.lang.String[] { "EventId", "GameName", "GameType", });
    internal_static_game_CreateGameResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_game_CreateGameResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_game_CreateGameResponse_descriptor,
        new java.lang.String[] { "EventGameId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/auth_service.proto

package com.vou.common.proto;

public final class AuthServiceProto {
  private AuthServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_auth_UserInfoMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_auth_UserInfoMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_auth_UserInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_auth_UserInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_auth_AuthTokenMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_auth_AuthTokenMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_auth_AuthTokenResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_auth_AuthTokenResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030proto/auth_service.proto\022\004auth\"3\n\017User" +
      "InfoMessage\022\016\n\006userId\030\001 \001(\t\022\020\n\010userRole\030" +
      "\002 \001(\t\"#\n\020UserInfoResponse\022\017\n\007message\030\001 \001" +
      "(\t\"!\n\020AuthTokenMessage\022\r\n\005token\030\001 \001(\t\"$\n" +
      "\021AuthTokenResponse\022\017\n\007message\030\001 \001(\t2\210\001\n\013" +
      "AuthService\022;\n\nsendUserId\022\025.auth.UserInf" +
      "oMessage\032\026.auth.UserInfoResponse\022<\n\tsend" +
      "Token\022\026.auth.AuthTokenMessage\032\027.auth.Aut" +
      "hTokenResponseB*\n\024com.vou.common.protoB\020" +
      "AuthServiceProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_auth_UserInfoMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_auth_UserInfoMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_auth_UserInfoMessage_descriptor,
        new java.lang.String[] { "UserId", "UserRole", });
    internal_static_auth_UserInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_auth_UserInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_auth_UserInfoResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_auth_AuthTokenMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_auth_AuthTokenMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_auth_AuthTokenMessage_descriptor,
        new java.lang.String[] { "Token", });
    internal_static_auth_AuthTokenResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_auth_AuthTokenResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_auth_AuthTokenResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

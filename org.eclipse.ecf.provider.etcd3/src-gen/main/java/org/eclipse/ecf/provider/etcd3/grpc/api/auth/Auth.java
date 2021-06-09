// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package org.eclipse.ecf.provider.etcd3.grpc.api.auth;

public final class Auth {
  private Auth() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_authpb_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_authpb_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_authpb_Permission_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_authpb_Permission_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_authpb_Role_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_authpb_Role_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nauth.proto\022\006authpb\"5\n\004User\022\014\n\004name\030\001 \001" +
      "(\014\022\020\n\010password\030\002 \001(\014\022\r\n\005roles\030\003 \003(\t\"\203\001\n\n" +
      "Permission\022)\n\010permType\030\001 \001(\0162\027.authpb.Pe" +
      "rmission.Type\022\013\n\003key\030\002 \001(\014\022\021\n\trange_end\030" +
      "\003 \001(\014\"*\n\004Type\022\010\n\004READ\020\000\022\t\n\005WRITE\020\001\022\r\n\tRE" +
      "ADWRITE\020\002\"?\n\004Role\022\014\n\004name\030\001 \001(\014\022)\n\rkeyPe" +
      "rmission\030\002 \003(\0132\022.authpb.PermissionB0\n,or" +
      "g.eclipse.ecf.provider.etcd3.grpc.api.au" +
      "thP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_authpb_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_authpb_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_authpb_User_descriptor,
        new java.lang.String[] { "Name", "Password", "Roles", });
    internal_static_authpb_Permission_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_authpb_Permission_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_authpb_Permission_descriptor,
        new java.lang.String[] { "PermType", "Key", "RangeEnd", });
    internal_static_authpb_Role_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_authpb_Role_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_authpb_Role_descriptor,
        new java.lang.String[] { "Name", "KeyPermission", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

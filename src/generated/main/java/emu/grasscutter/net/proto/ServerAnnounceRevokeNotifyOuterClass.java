// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerAnnounceRevokeNotify.proto

package emu.grasscutter.net.proto;

public final class ServerAnnounceRevokeNotifyOuterClass {
  private ServerAnnounceRevokeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ServerAnnounceRevokeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ServerAnnounceRevokeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 config_id_list = 14;</code>
     * @return A list containing the configIdList.
     */
    java.util.List<java.lang.Integer> getConfigIdListList();
    /**
     * <code>repeated uint32 config_id_list = 14;</code>
     * @return The count of configIdList.
     */
    int getConfigIdListCount();
    /**
     * <code>repeated uint32 config_id_list = 14;</code>
     * @param index The index of the element to return.
     * @return The configIdList at the given index.
     */
    int getConfigIdList(int index);
  }
  /**
   * <pre>
   * CmdId: 23231
   * Obf: CAOCBNJGPCE
   * </pre>
   *
   * Protobuf type {@code ServerAnnounceRevokeNotify}
   */
  public static final class ServerAnnounceRevokeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ServerAnnounceRevokeNotify)
      ServerAnnounceRevokeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ServerAnnounceRevokeNotify.newBuilder() to construct.
    private ServerAnnounceRevokeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ServerAnnounceRevokeNotify() {
      configIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ServerAnnounceRevokeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ServerAnnounceRevokeNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 112: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                configIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              configIdList_.addInt(input.readUInt32());
              break;
            }
            case 114: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                configIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                configIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          configIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.internal_static_ServerAnnounceRevokeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.internal_static_ServerAnnounceRevokeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify.class, emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify.Builder.class);
    }

    public static final int CONFIG_ID_LIST_FIELD_NUMBER = 14;
    private com.google.protobuf.Internal.IntList configIdList_;
    /**
     * <code>repeated uint32 config_id_list = 14;</code>
     * @return A list containing the configIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getConfigIdListList() {
      return configIdList_;
    }
    /**
     * <code>repeated uint32 config_id_list = 14;</code>
     * @return The count of configIdList.
     */
    public int getConfigIdListCount() {
      return configIdList_.size();
    }
    /**
     * <code>repeated uint32 config_id_list = 14;</code>
     * @param index The index of the element to return.
     * @return The configIdList at the given index.
     */
    public int getConfigIdList(int index) {
      return configIdList_.getInt(index);
    }
    private int configIdListMemoizedSerializedSize = -1;

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (getConfigIdListList().size() > 0) {
        output.writeUInt32NoTag(114);
        output.writeUInt32NoTag(configIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < configIdList_.size(); i++) {
        output.writeUInt32NoTag(configIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < configIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(configIdList_.getInt(i));
        }
        size += dataSize;
        if (!getConfigIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        configIdListMemoizedSerializedSize = dataSize;
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify other = (emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify) obj;

      if (!getConfigIdListList()
          .equals(other.getConfigIdListList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getConfigIdListCount() > 0) {
        hash = (37 * hash) + CONFIG_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getConfigIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 23231
     * Obf: CAOCBNJGPCE
     * </pre>
     *
     * Protobuf type {@code ServerAnnounceRevokeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ServerAnnounceRevokeNotify)
        emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.internal_static_ServerAnnounceRevokeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.internal_static_ServerAnnounceRevokeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify.class, emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        configIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.internal_static_ServerAnnounceRevokeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify build() {
        emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify buildPartial() {
        emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify result = new emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          configIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.configIdList_ = configIdList_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify other) {
        if (other == emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify.getDefaultInstance()) return this;
        if (!other.configIdList_.isEmpty()) {
          if (configIdList_.isEmpty()) {
            configIdList_ = other.configIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureConfigIdListIsMutable();
            configIdList_.addAll(other.configIdList_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList configIdList_ = emptyIntList();
      private void ensureConfigIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          configIdList_ = mutableCopy(configIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 config_id_list = 14;</code>
       * @return A list containing the configIdList.
       */
      public java.util.List<java.lang.Integer>
          getConfigIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(configIdList_) : configIdList_;
      }
      /**
       * <code>repeated uint32 config_id_list = 14;</code>
       * @return The count of configIdList.
       */
      public int getConfigIdListCount() {
        return configIdList_.size();
      }
      /**
       * <code>repeated uint32 config_id_list = 14;</code>
       * @param index The index of the element to return.
       * @return The configIdList at the given index.
       */
      public int getConfigIdList(int index) {
        return configIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 config_id_list = 14;</code>
       * @param index The index to set the value at.
       * @param value The configIdList to set.
       * @return This builder for chaining.
       */
      public Builder setConfigIdList(
          int index, int value) {
        ensureConfigIdListIsMutable();
        configIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 config_id_list = 14;</code>
       * @param value The configIdList to add.
       * @return This builder for chaining.
       */
      public Builder addConfigIdList(int value) {
        ensureConfigIdListIsMutable();
        configIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 config_id_list = 14;</code>
       * @param values The configIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllConfigIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureConfigIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, configIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 config_id_list = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigIdList() {
        configIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ServerAnnounceRevokeNotify)
    }

    // @@protoc_insertion_point(class_scope:ServerAnnounceRevokeNotify)
    private static final emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify();
    }

    public static emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ServerAnnounceRevokeNotify>
        PARSER = new com.google.protobuf.AbstractParser<ServerAnnounceRevokeNotify>() {
      @java.lang.Override
      public ServerAnnounceRevokeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ServerAnnounceRevokeNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ServerAnnounceRevokeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ServerAnnounceRevokeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServerAnnounceRevokeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServerAnnounceRevokeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n ServerAnnounceRevokeNotify.proto\"4\n\032Se" +
      "rverAnnounceRevokeNotify\022\026\n\016config_id_li" +
      "st\030\016 \003(\rB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ServerAnnounceRevokeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ServerAnnounceRevokeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServerAnnounceRevokeNotify_descriptor,
        new java.lang.String[] { "ConfigIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

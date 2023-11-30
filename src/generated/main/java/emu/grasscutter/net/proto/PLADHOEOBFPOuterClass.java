// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PLADHOEOBFP.proto

package emu.grasscutter.net.proto;

public final class PLADHOEOBFPOuterClass {
  private PLADHOEOBFPOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PLADHOEOBFPOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PLADHOEOBFP)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 scene_id = 3;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
     */
    java.util.List<emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF> 
        getOBIKGEGABNDList();
    /**
     * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
     */
    emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF getOBIKGEGABND(int index);
    /**
     * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
     */
    int getOBIKGEGABNDCount();
    /**
     * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIFOrBuilder> 
        getOBIKGEGABNDOrBuilderList();
    /**
     * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
     */
    emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIFOrBuilder getOBIKGEGABNDOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 2676
   * </pre>
   *
   * Protobuf type {@code PLADHOEOBFP}
   */
  public static final class PLADHOEOBFP extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PLADHOEOBFP)
      PLADHOEOBFPOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PLADHOEOBFP.newBuilder() to construct.
    private PLADHOEOBFP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PLADHOEOBFP() {
      oBIKGEGABND_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PLADHOEOBFP();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PLADHOEOBFP(
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
            case 24: {

              sceneId_ = input.readUInt32();
              break;
            }
            case 114: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                oBIKGEGABND_ = new java.util.ArrayList<emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF>();
                mutable_bitField0_ |= 0x00000001;
              }
              oBIKGEGABND_.add(
                  input.readMessage(emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF.parser(), extensionRegistry));
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
          oBIKGEGABND_ = java.util.Collections.unmodifiableList(oBIKGEGABND_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.internal_static_PLADHOEOBFP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.internal_static_PLADHOEOBFP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP.class, emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP.Builder.class);
    }

    public static final int SCENE_ID_FIELD_NUMBER = 3;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 3;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int OBIKGEGABND_FIELD_NUMBER = 14;
    private java.util.List<emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF> oBIKGEGABND_;
    /**
     * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF> getOBIKGEGABNDList() {
      return oBIKGEGABND_;
    }
    /**
     * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIFOrBuilder> 
        getOBIKGEGABNDOrBuilderList() {
      return oBIKGEGABND_;
    }
    /**
     * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
     */
    @java.lang.Override
    public int getOBIKGEGABNDCount() {
      return oBIKGEGABND_.size();
    }
    /**
     * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF getOBIKGEGABND(int index) {
      return oBIKGEGABND_.get(index);
    }
    /**
     * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIFOrBuilder getOBIKGEGABNDOrBuilder(
        int index) {
      return oBIKGEGABND_.get(index);
    }

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
      if (sceneId_ != 0) {
        output.writeUInt32(3, sceneId_);
      }
      for (int i = 0; i < oBIKGEGABND_.size(); i++) {
        output.writeMessage(14, oBIKGEGABND_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, sceneId_);
      }
      for (int i = 0; i < oBIKGEGABND_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, oBIKGEGABND_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP other = (emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP) obj;

      if (getSceneId()
          != other.getSceneId()) return false;
      if (!getOBIKGEGABNDList()
          .equals(other.getOBIKGEGABNDList())) return false;
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
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      if (getOBIKGEGABNDCount() > 0) {
        hash = (37 * hash) + OBIKGEGABND_FIELD_NUMBER;
        hash = (53 * hash) + getOBIKGEGABNDList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP prototype) {
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
     * CmdId: 2676
     * </pre>
     *
     * Protobuf type {@code PLADHOEOBFP}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PLADHOEOBFP)
        emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFPOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.internal_static_PLADHOEOBFP_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.internal_static_PLADHOEOBFP_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP.class, emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP.newBuilder()
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
          getOBIKGEGABNDFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        sceneId_ = 0;

        if (oBIKGEGABNDBuilder_ == null) {
          oBIKGEGABND_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          oBIKGEGABNDBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.internal_static_PLADHOEOBFP_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP build() {
        emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP buildPartial() {
        emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP result = new emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP(this);
        int from_bitField0_ = bitField0_;
        result.sceneId_ = sceneId_;
        if (oBIKGEGABNDBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            oBIKGEGABND_ = java.util.Collections.unmodifiableList(oBIKGEGABND_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.oBIKGEGABND_ = oBIKGEGABND_;
        } else {
          result.oBIKGEGABND_ = oBIKGEGABNDBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP) {
          return mergeFrom((emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP other) {
        if (other == emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP.getDefaultInstance()) return this;
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (oBIKGEGABNDBuilder_ == null) {
          if (!other.oBIKGEGABND_.isEmpty()) {
            if (oBIKGEGABND_.isEmpty()) {
              oBIKGEGABND_ = other.oBIKGEGABND_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureOBIKGEGABNDIsMutable();
              oBIKGEGABND_.addAll(other.oBIKGEGABND_);
            }
            onChanged();
          }
        } else {
          if (!other.oBIKGEGABND_.isEmpty()) {
            if (oBIKGEGABNDBuilder_.isEmpty()) {
              oBIKGEGABNDBuilder_.dispose();
              oBIKGEGABNDBuilder_ = null;
              oBIKGEGABND_ = other.oBIKGEGABND_;
              bitField0_ = (bitField0_ & ~0x00000001);
              oBIKGEGABNDBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getOBIKGEGABNDFieldBuilder() : null;
            } else {
              oBIKGEGABNDBuilder_.addAllMessages(other.oBIKGEGABND_);
            }
          }
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
        emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 3;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 3;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF> oBIKGEGABND_ =
        java.util.Collections.emptyList();
      private void ensureOBIKGEGABNDIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          oBIKGEGABND_ = new java.util.ArrayList<emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF>(oBIKGEGABND_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF, emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF.Builder, emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIFOrBuilder> oBIKGEGABNDBuilder_;

      /**
       * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF> getOBIKGEGABNDList() {
        if (oBIKGEGABNDBuilder_ == null) {
          return java.util.Collections.unmodifiableList(oBIKGEGABND_);
        } else {
          return oBIKGEGABNDBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
       */
      public int getOBIKGEGABNDCount() {
        if (oBIKGEGABNDBuilder_ == null) {
          return oBIKGEGABND_.size();
        } else {
          return oBIKGEGABNDBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
       */
      public emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF getOBIKGEGABND(int index) {
        if (oBIKGEGABNDBuilder_ == null) {
          return oBIKGEGABND_.get(index);
        } else {
          return oBIKGEGABNDBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
       */
      public Builder setOBIKGEGABND(
          int index, emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF value) {
        if (oBIKGEGABNDBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOBIKGEGABNDIsMutable();
          oBIKGEGABND_.set(index, value);
          onChanged();
        } else {
          oBIKGEGABNDBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
       */
      public Builder setOBIKGEGABND(
          int index, emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF.Builder builderForValue) {
        if (oBIKGEGABNDBuilder_ == null) {
          ensureOBIKGEGABNDIsMutable();
          oBIKGEGABND_.set(index, builderForValue.build());
          onChanged();
        } else {
          oBIKGEGABNDBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
       */
      public Builder addOBIKGEGABND(emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF value) {
        if (oBIKGEGABNDBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOBIKGEGABNDIsMutable();
          oBIKGEGABND_.add(value);
          onChanged();
        } else {
          oBIKGEGABNDBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
       */
      public Builder addOBIKGEGABND(
          int index, emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF value) {
        if (oBIKGEGABNDBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOBIKGEGABNDIsMutable();
          oBIKGEGABND_.add(index, value);
          onChanged();
        } else {
          oBIKGEGABNDBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
       */
      public Builder addOBIKGEGABND(
          emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF.Builder builderForValue) {
        if (oBIKGEGABNDBuilder_ == null) {
          ensureOBIKGEGABNDIsMutable();
          oBIKGEGABND_.add(builderForValue.build());
          onChanged();
        } else {
          oBIKGEGABNDBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
       */
      public Builder addOBIKGEGABND(
          int index, emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF.Builder builderForValue) {
        if (oBIKGEGABNDBuilder_ == null) {
          ensureOBIKGEGABNDIsMutable();
          oBIKGEGABND_.add(index, builderForValue.build());
          onChanged();
        } else {
          oBIKGEGABNDBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
       */
      public Builder addAllOBIKGEGABND(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF> values) {
        if (oBIKGEGABNDBuilder_ == null) {
          ensureOBIKGEGABNDIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, oBIKGEGABND_);
          onChanged();
        } else {
          oBIKGEGABNDBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
       */
      public Builder clearOBIKGEGABND() {
        if (oBIKGEGABNDBuilder_ == null) {
          oBIKGEGABND_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          oBIKGEGABNDBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
       */
      public Builder removeOBIKGEGABND(int index) {
        if (oBIKGEGABNDBuilder_ == null) {
          ensureOBIKGEGABNDIsMutable();
          oBIKGEGABND_.remove(index);
          onChanged();
        } else {
          oBIKGEGABNDBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
       */
      public emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF.Builder getOBIKGEGABNDBuilder(
          int index) {
        return getOBIKGEGABNDFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
       */
      public emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIFOrBuilder getOBIKGEGABNDOrBuilder(
          int index) {
        if (oBIKGEGABNDBuilder_ == null) {
          return oBIKGEGABND_.get(index);  } else {
          return oBIKGEGABNDBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIFOrBuilder> 
           getOBIKGEGABNDOrBuilderList() {
        if (oBIKGEGABNDBuilder_ != null) {
          return oBIKGEGABNDBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(oBIKGEGABND_);
        }
      }
      /**
       * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
       */
      public emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF.Builder addOBIKGEGABNDBuilder() {
        return getOBIKGEGABNDFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF.getDefaultInstance());
      }
      /**
       * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
       */
      public emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF.Builder addOBIKGEGABNDBuilder(
          int index) {
        return getOBIKGEGABNDFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF.getDefaultInstance());
      }
      /**
       * <code>repeated .KDIMOOGPNIF OBIKGEGABND = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF.Builder> 
           getOBIKGEGABNDBuilderList() {
        return getOBIKGEGABNDFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF, emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF.Builder, emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIFOrBuilder> 
          getOBIKGEGABNDFieldBuilder() {
        if (oBIKGEGABNDBuilder_ == null) {
          oBIKGEGABNDBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF, emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIF.Builder, emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.KDIMOOGPNIFOrBuilder>(
                  oBIKGEGABND_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          oBIKGEGABND_ = null;
        }
        return oBIKGEGABNDBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PLADHOEOBFP)
    }

    // @@protoc_insertion_point(class_scope:PLADHOEOBFP)
    private static final emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP();
    }

    public static emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PLADHOEOBFP>
        PARSER = new com.google.protobuf.AbstractParser<PLADHOEOBFP>() {
      @java.lang.Override
      public PLADHOEOBFP parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PLADHOEOBFP(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PLADHOEOBFP> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PLADHOEOBFP> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PLADHOEOBFPOuterClass.PLADHOEOBFP getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PLADHOEOBFP_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PLADHOEOBFP_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021PLADHOEOBFP.proto\032\021KDIMOOGPNIF.proto\"B" +
      "\n\013PLADHOEOBFP\022\020\n\010scene_id\030\003 \001(\r\022!\n\013OBIKG" +
      "EGABND\030\016 \003(\0132\014.KDIMOOGPNIFB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.getDescriptor(),
        });
    internal_static_PLADHOEOBFP_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PLADHOEOBFP_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PLADHOEOBFP_descriptor,
        new java.lang.String[] { "SceneId", "OBIKGEGABND", });
    emu.grasscutter.net.proto.KDIMOOGPNIFOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

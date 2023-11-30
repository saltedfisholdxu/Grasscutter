// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MDKNMCFKHOF.proto

package emu.grasscutter.net.proto;

public final class MDKNMCFKHOFOuterClass {
  private MDKNMCFKHOFOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MDKNMCFKHOFOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MDKNMCFKHOF)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 CLFLBPJPBJB = 15;</code>
     * @return The cLFLBPJPBJB.
     */
    int getCLFLBPJPBJB();

    /**
     * <code>repeated uint32 affix_list = 13;</code>
     * @return A list containing the affixList.
     */
    java.util.List<java.lang.Integer> getAffixListList();
    /**
     * <code>repeated uint32 affix_list = 13;</code>
     * @return The count of affixList.
     */
    int getAffixListCount();
    /**
     * <code>repeated uint32 affix_list = 13;</code>
     * @param index The index of the element to return.
     * @return The affixList at the given index.
     */
    int getAffixList(int index);

    /**
     * <code>uint32 max_score = 2;</code>
     * @return The maxScore.
     */
    int getMaxScore();

    /**
     * <code>uint32 level_id = 14;</code>
     * @return The levelId.
     */
    int getLevelId();
  }
  /**
   * Protobuf type {@code MDKNMCFKHOF}
   */
  public static final class MDKNMCFKHOF extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MDKNMCFKHOF)
      MDKNMCFKHOFOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MDKNMCFKHOF.newBuilder() to construct.
    private MDKNMCFKHOF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MDKNMCFKHOF() {
      affixList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MDKNMCFKHOF();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MDKNMCFKHOF(
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
            case 16: {

              maxScore_ = input.readUInt32();
              break;
            }
            case 104: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                affixList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              affixList_.addInt(input.readUInt32());
              break;
            }
            case 106: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                affixList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                affixList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 112: {

              levelId_ = input.readUInt32();
              break;
            }
            case 120: {

              cLFLBPJPBJB_ = input.readUInt32();
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
          affixList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.internal_static_MDKNMCFKHOF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.internal_static_MDKNMCFKHOF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF.class, emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF.Builder.class);
    }

    public static final int CLFLBPJPBJB_FIELD_NUMBER = 15;
    private int cLFLBPJPBJB_;
    /**
     * <code>uint32 CLFLBPJPBJB = 15;</code>
     * @return The cLFLBPJPBJB.
     */
    @java.lang.Override
    public int getCLFLBPJPBJB() {
      return cLFLBPJPBJB_;
    }

    public static final int AFFIX_LIST_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList affixList_;
    /**
     * <code>repeated uint32 affix_list = 13;</code>
     * @return A list containing the affixList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAffixListList() {
      return affixList_;
    }
    /**
     * <code>repeated uint32 affix_list = 13;</code>
     * @return The count of affixList.
     */
    public int getAffixListCount() {
      return affixList_.size();
    }
    /**
     * <code>repeated uint32 affix_list = 13;</code>
     * @param index The index of the element to return.
     * @return The affixList at the given index.
     */
    public int getAffixList(int index) {
      return affixList_.getInt(index);
    }
    private int affixListMemoizedSerializedSize = -1;

    public static final int MAX_SCORE_FIELD_NUMBER = 2;
    private int maxScore_;
    /**
     * <code>uint32 max_score = 2;</code>
     * @return The maxScore.
     */
    @java.lang.Override
    public int getMaxScore() {
      return maxScore_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 14;
    private int levelId_;
    /**
     * <code>uint32 level_id = 14;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
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
      getSerializedSize();
      if (maxScore_ != 0) {
        output.writeUInt32(2, maxScore_);
      }
      if (getAffixListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(affixListMemoizedSerializedSize);
      }
      for (int i = 0; i < affixList_.size(); i++) {
        output.writeUInt32NoTag(affixList_.getInt(i));
      }
      if (levelId_ != 0) {
        output.writeUInt32(14, levelId_);
      }
      if (cLFLBPJPBJB_ != 0) {
        output.writeUInt32(15, cLFLBPJPBJB_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (maxScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, maxScore_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < affixList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(affixList_.getInt(i));
        }
        size += dataSize;
        if (!getAffixListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        affixListMemoizedSerializedSize = dataSize;
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, levelId_);
      }
      if (cLFLBPJPBJB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, cLFLBPJPBJB_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF other = (emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF) obj;

      if (getCLFLBPJPBJB()
          != other.getCLFLBPJPBJB()) return false;
      if (!getAffixListList()
          .equals(other.getAffixListList())) return false;
      if (getMaxScore()
          != other.getMaxScore()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
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
      hash = (37 * hash) + CLFLBPJPBJB_FIELD_NUMBER;
      hash = (53 * hash) + getCLFLBPJPBJB();
      if (getAffixListCount() > 0) {
        hash = (37 * hash) + AFFIX_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAffixListList().hashCode();
      }
      hash = (37 * hash) + MAX_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getMaxScore();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF prototype) {
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
     * Protobuf type {@code MDKNMCFKHOF}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MDKNMCFKHOF)
        emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOFOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.internal_static_MDKNMCFKHOF_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.internal_static_MDKNMCFKHOF_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF.class, emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF.newBuilder()
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
        cLFLBPJPBJB_ = 0;

        affixList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        maxScore_ = 0;

        levelId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.internal_static_MDKNMCFKHOF_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF build() {
        emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF buildPartial() {
        emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF result = new emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF(this);
        int from_bitField0_ = bitField0_;
        result.cLFLBPJPBJB_ = cLFLBPJPBJB_;
        if (((bitField0_ & 0x00000001) != 0)) {
          affixList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.affixList_ = affixList_;
        result.maxScore_ = maxScore_;
        result.levelId_ = levelId_;
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
        if (other instanceof emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF) {
          return mergeFrom((emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF other) {
        if (other == emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF.getDefaultInstance()) return this;
        if (other.getCLFLBPJPBJB() != 0) {
          setCLFLBPJPBJB(other.getCLFLBPJPBJB());
        }
        if (!other.affixList_.isEmpty()) {
          if (affixList_.isEmpty()) {
            affixList_ = other.affixList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAffixListIsMutable();
            affixList_.addAll(other.affixList_);
          }
          onChanged();
        }
        if (other.getMaxScore() != 0) {
          setMaxScore(other.getMaxScore());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
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
        emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int cLFLBPJPBJB_ ;
      /**
       * <code>uint32 CLFLBPJPBJB = 15;</code>
       * @return The cLFLBPJPBJB.
       */
      @java.lang.Override
      public int getCLFLBPJPBJB() {
        return cLFLBPJPBJB_;
      }
      /**
       * <code>uint32 CLFLBPJPBJB = 15;</code>
       * @param value The cLFLBPJPBJB to set.
       * @return This builder for chaining.
       */
      public Builder setCLFLBPJPBJB(int value) {
        
        cLFLBPJPBJB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 CLFLBPJPBJB = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearCLFLBPJPBJB() {
        
        cLFLBPJPBJB_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList affixList_ = emptyIntList();
      private void ensureAffixListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          affixList_ = mutableCopy(affixList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 affix_list = 13;</code>
       * @return A list containing the affixList.
       */
      public java.util.List<java.lang.Integer>
          getAffixListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(affixList_) : affixList_;
      }
      /**
       * <code>repeated uint32 affix_list = 13;</code>
       * @return The count of affixList.
       */
      public int getAffixListCount() {
        return affixList_.size();
      }
      /**
       * <code>repeated uint32 affix_list = 13;</code>
       * @param index The index of the element to return.
       * @return The affixList at the given index.
       */
      public int getAffixList(int index) {
        return affixList_.getInt(index);
      }
      /**
       * <code>repeated uint32 affix_list = 13;</code>
       * @param index The index to set the value at.
       * @param value The affixList to set.
       * @return This builder for chaining.
       */
      public Builder setAffixList(
          int index, int value) {
        ensureAffixListIsMutable();
        affixList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 affix_list = 13;</code>
       * @param value The affixList to add.
       * @return This builder for chaining.
       */
      public Builder addAffixList(int value) {
        ensureAffixListIsMutable();
        affixList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 affix_list = 13;</code>
       * @param values The affixList to add.
       * @return This builder for chaining.
       */
      public Builder addAllAffixList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAffixListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, affixList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 affix_list = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearAffixList() {
        affixList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int maxScore_ ;
      /**
       * <code>uint32 max_score = 2;</code>
       * @return The maxScore.
       */
      @java.lang.Override
      public int getMaxScore() {
        return maxScore_;
      }
      /**
       * <code>uint32 max_score = 2;</code>
       * @param value The maxScore to set.
       * @return This builder for chaining.
       */
      public Builder setMaxScore(int value) {
        
        maxScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_score = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxScore() {
        
        maxScore_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 14;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 14;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MDKNMCFKHOF)
    }

    // @@protoc_insertion_point(class_scope:MDKNMCFKHOF)
    private static final emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF();
    }

    public static emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MDKNMCFKHOF>
        PARSER = new com.google.protobuf.AbstractParser<MDKNMCFKHOF>() {
      @java.lang.Override
      public MDKNMCFKHOF parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MDKNMCFKHOF(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MDKNMCFKHOF> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MDKNMCFKHOF> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MDKNMCFKHOFOuterClass.MDKNMCFKHOF getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MDKNMCFKHOF_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MDKNMCFKHOF_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021MDKNMCFKHOF.proto\"[\n\013MDKNMCFKHOF\022\023\n\013CL" +
      "FLBPJPBJB\030\017 \001(\r\022\022\n\naffix_list\030\r \003(\r\022\021\n\tm" +
      "ax_score\030\002 \001(\r\022\020\n\010level_id\030\016 \001(\rB\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MDKNMCFKHOF_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MDKNMCFKHOF_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MDKNMCFKHOF_descriptor,
        new java.lang.String[] { "CLFLBPJPBJB", "AffixList", "MaxScore", "LevelId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SearchService.proto

package com.trace.trace.grpc;

/**
 * <pre>
 *请求
 * </pre>
 *
 * Protobuf type {@code com.trace.trace.grpc.QueryRequest}
 */
public  final class QueryRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.trace.trace.grpc.QueryRequest)
    QueryRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryRequest.newBuilder() to construct.
  private QueryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryRequest() {
    queryType_ = "";
    query_ = "";
    page_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            queryType_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            query_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            page_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.trace.trace.grpc.SearchServiceOuterClass.internal_static_com_trace_trace_grpc_QueryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.trace.trace.grpc.SearchServiceOuterClass.internal_static_com_trace_trace_grpc_QueryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.trace.trace.grpc.QueryRequest.class, com.trace.trace.grpc.QueryRequest.Builder.class);
  }

  public static final int QUERYTYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object queryType_;
  /**
   * <pre>
   *类型
   * </pre>
   *
   * <code>string queryType = 1;</code>
   */
  public java.lang.String getQueryType() {
    java.lang.Object ref = queryType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      queryType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *类型
   * </pre>
   *
   * <code>string queryType = 1;</code>
   */
  public com.google.protobuf.ByteString
      getQueryTypeBytes() {
    java.lang.Object ref = queryType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      queryType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUERY_FIELD_NUMBER = 2;
  private volatile java.lang.Object query_;
  /**
   * <pre>
   *请求内容
   * </pre>
   *
   * <code>string query = 2;</code>
   */
  public java.lang.String getQuery() {
    java.lang.Object ref = query_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      query_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *请求内容
   * </pre>
   *
   * <code>string query = 2;</code>
   */
  public com.google.protobuf.ByteString
      getQueryBytes() {
    java.lang.Object ref = query_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      query_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_FIELD_NUMBER = 3;
  private volatile java.lang.Object page_;
  /**
   * <pre>
   *分页的页数
   * </pre>
   *
   * <code>string page = 3;</code>
   */
  public java.lang.String getPage() {
    java.lang.Object ref = page_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      page_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *分页的页数
   * </pre>
   *
   * <code>string page = 3;</code>
   */
  public com.google.protobuf.ByteString
      getPageBytes() {
    java.lang.Object ref = page_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      page_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getQueryTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, queryType_);
    }
    if (!getQueryBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, query_);
    }
    if (!getPageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, page_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getQueryTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, queryType_);
    }
    if (!getQueryBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, query_);
    }
    if (!getPageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, page_);
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
    if (!(obj instanceof com.trace.trace.grpc.QueryRequest)) {
      return super.equals(obj);
    }
    com.trace.trace.grpc.QueryRequest other = (com.trace.trace.grpc.QueryRequest) obj;

    if (!getQueryType()
        .equals(other.getQueryType())) return false;
    if (!getQuery()
        .equals(other.getQuery())) return false;
    if (!getPage()
        .equals(other.getPage())) return false;
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
    hash = (37 * hash) + QUERYTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getQueryType().hashCode();
    hash = (37 * hash) + QUERY_FIELD_NUMBER;
    hash = (53 * hash) + getQuery().hashCode();
    hash = (37 * hash) + PAGE_FIELD_NUMBER;
    hash = (53 * hash) + getPage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.trace.trace.grpc.QueryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.trace.trace.grpc.QueryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.trace.trace.grpc.QueryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.trace.trace.grpc.QueryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.trace.trace.grpc.QueryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.trace.trace.grpc.QueryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.trace.trace.grpc.QueryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.trace.trace.grpc.QueryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.trace.trace.grpc.QueryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.trace.trace.grpc.QueryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.trace.trace.grpc.QueryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.trace.trace.grpc.QueryRequest parseFrom(
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
  public static Builder newBuilder(com.trace.trace.grpc.QueryRequest prototype) {
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
   *请求
   * </pre>
   *
   * Protobuf type {@code com.trace.trace.grpc.QueryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.trace.trace.grpc.QueryRequest)
      com.trace.trace.grpc.QueryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.trace.trace.grpc.SearchServiceOuterClass.internal_static_com_trace_trace_grpc_QueryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.trace.trace.grpc.SearchServiceOuterClass.internal_static_com_trace_trace_grpc_QueryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.trace.trace.grpc.QueryRequest.class, com.trace.trace.grpc.QueryRequest.Builder.class);
    }

    // Construct using com.trace.trace.grpc.QueryRequest.newBuilder()
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
      queryType_ = "";

      query_ = "";

      page_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.trace.trace.grpc.SearchServiceOuterClass.internal_static_com_trace_trace_grpc_QueryRequest_descriptor;
    }

    @java.lang.Override
    public com.trace.trace.grpc.QueryRequest getDefaultInstanceForType() {
      return com.trace.trace.grpc.QueryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.trace.trace.grpc.QueryRequest build() {
      com.trace.trace.grpc.QueryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.trace.trace.grpc.QueryRequest buildPartial() {
      com.trace.trace.grpc.QueryRequest result = new com.trace.trace.grpc.QueryRequest(this);
      result.queryType_ = queryType_;
      result.query_ = query_;
      result.page_ = page_;
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
      if (other instanceof com.trace.trace.grpc.QueryRequest) {
        return mergeFrom((com.trace.trace.grpc.QueryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.trace.trace.grpc.QueryRequest other) {
      if (other == com.trace.trace.grpc.QueryRequest.getDefaultInstance()) return this;
      if (!other.getQueryType().isEmpty()) {
        queryType_ = other.queryType_;
        onChanged();
      }
      if (!other.getQuery().isEmpty()) {
        query_ = other.query_;
        onChanged();
      }
      if (!other.getPage().isEmpty()) {
        page_ = other.page_;
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
      com.trace.trace.grpc.QueryRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.trace.trace.grpc.QueryRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object queryType_ = "";
    /**
     * <pre>
     *类型
     * </pre>
     *
     * <code>string queryType = 1;</code>
     */
    public java.lang.String getQueryType() {
      java.lang.Object ref = queryType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        queryType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *类型
     * </pre>
     *
     * <code>string queryType = 1;</code>
     */
    public com.google.protobuf.ByteString
        getQueryTypeBytes() {
      java.lang.Object ref = queryType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        queryType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *类型
     * </pre>
     *
     * <code>string queryType = 1;</code>
     */
    public Builder setQueryType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      queryType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *类型
     * </pre>
     *
     * <code>string queryType = 1;</code>
     */
    public Builder clearQueryType() {
      
      queryType_ = getDefaultInstance().getQueryType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *类型
     * </pre>
     *
     * <code>string queryType = 1;</code>
     */
    public Builder setQueryTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      queryType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object query_ = "";
    /**
     * <pre>
     *请求内容
     * </pre>
     *
     * <code>string query = 2;</code>
     */
    public java.lang.String getQuery() {
      java.lang.Object ref = query_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        query_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *请求内容
     * </pre>
     *
     * <code>string query = 2;</code>
     */
    public com.google.protobuf.ByteString
        getQueryBytes() {
      java.lang.Object ref = query_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        query_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *请求内容
     * </pre>
     *
     * <code>string query = 2;</code>
     */
    public Builder setQuery(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      query_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *请求内容
     * </pre>
     *
     * <code>string query = 2;</code>
     */
    public Builder clearQuery() {
      
      query_ = getDefaultInstance().getQuery();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *请求内容
     * </pre>
     *
     * <code>string query = 2;</code>
     */
    public Builder setQueryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      query_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object page_ = "";
    /**
     * <pre>
     *分页的页数
     * </pre>
     *
     * <code>string page = 3;</code>
     */
    public java.lang.String getPage() {
      java.lang.Object ref = page_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        page_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *分页的页数
     * </pre>
     *
     * <code>string page = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPageBytes() {
      java.lang.Object ref = page_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        page_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *分页的页数
     * </pre>
     *
     * <code>string page = 3;</code>
     */
    public Builder setPage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      page_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *分页的页数
     * </pre>
     *
     * <code>string page = 3;</code>
     */
    public Builder clearPage() {
      
      page_ = getDefaultInstance().getPage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *分页的页数
     * </pre>
     *
     * <code>string page = 3;</code>
     */
    public Builder setPageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      page_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.trace.trace.grpc.QueryRequest)
  }

  // @@protoc_insertion_point(class_scope:com.trace.trace.grpc.QueryRequest)
  private static final com.trace.trace.grpc.QueryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.trace.trace.grpc.QueryRequest();
  }

  public static com.trace.trace.grpc.QueryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryRequest>() {
    @java.lang.Override
    public QueryRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.trace.trace.grpc.QueryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

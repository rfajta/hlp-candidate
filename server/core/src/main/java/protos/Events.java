/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package protos;

public final class Events {
  private Events() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface InterestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protos.Interest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string eventType = 1;</code>
     */
    java.lang.String getEventType();
    /**
     * <code>optional string eventType = 1;</code>
     */
    com.google.protobuf.ByteString
        getEventTypeBytes();

    /**
     * <code>optional .protos.Interest.ResponseType responseType = 2;</code>
     */
    int getResponseTypeValue();
    /**
     * <code>optional .protos.Interest.ResponseType responseType = 2;</code>
     */
    protos.Events.Interest.ResponseType getResponseType();
  }
  /**
   * Protobuf type {@code protos.Interest}
   */
  public  static final class Interest extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:protos.Interest)
      InterestOrBuilder {
    // Use Interest.newBuilder() to construct.
    private Interest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private Interest() {
      eventType_ = "";
      responseType_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Interest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              eventType_ = s;
              break;
            }
            case 16: {
              int rawValue = input.readEnum();

              responseType_ = rawValue;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protos.Events.internal_static_protos_Interest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protos.Events.internal_static_protos_Interest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protos.Events.Interest.class, protos.Events.Interest.Builder.class);
    }

    /**
     * Protobuf enum {@code protos.Interest.ResponseType}
     */
    public enum ResponseType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>DONTSEND = 0;</code>
       *
       * <pre>
       *don't send events (used to cancel interest)
       * </pre>
       */
      DONTSEND(0, 0),
      /**
       * <code>PROTOBUF = 1;</code>
       *
       * <pre>
       *send protobuf objects
       * </pre>
       */
      PROTOBUF(1, 1),
      /**
       * <code>JSON = 2;</code>
       *
       * <pre>
       *marshall into JSON byte array
       * </pre>
       */
      JSON(2, 2),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DONTSEND = 0;</code>
       *
       * <pre>
       *don't send events (used to cancel interest)
       * </pre>
       */
      public static final int DONTSEND_VALUE = 0;
      /**
       * <code>PROTOBUF = 1;</code>
       *
       * <pre>
       *send protobuf objects
       * </pre>
       */
      public static final int PROTOBUF_VALUE = 1;
      /**
       * <code>JSON = 2;</code>
       *
       * <pre>
       *marshall into JSON byte array
       * </pre>
       */
      public static final int JSON_VALUE = 2;


      public final int getNumber() {
        if (index == -1) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      public static ResponseType valueOf(int value) {
        switch (value) {
          case 0: return DONTSEND;
          case 1: return PROTOBUF;
          case 2: return JSON;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<ResponseType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          ResponseType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ResponseType>() {
              public ResponseType findValueByNumber(int number) {
                return ResponseType.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return protos.Events.Interest.getDescriptor().getEnumTypes().get(0);
      }

      private static final ResponseType[] VALUES = values();

      public static ResponseType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private ResponseType(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:protos.Interest.ResponseType)
    }

    public static final int EVENTTYPE_FIELD_NUMBER = 1;
    private volatile java.lang.Object eventType_;
    /**
     * <code>optional string eventType = 1;</code>
     */
    public java.lang.String getEventType() {
      java.lang.Object ref = eventType_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventType_ = s;
        return s;
      }
    }
    /**
     * <code>optional string eventType = 1;</code>
     */
    public com.google.protobuf.ByteString
        getEventTypeBytes() {
      java.lang.Object ref = eventType_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eventType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RESPONSETYPE_FIELD_NUMBER = 2;
    private int responseType_;
    /**
     * <code>optional .protos.Interest.ResponseType responseType = 2;</code>
     */
    public int getResponseTypeValue() {
      return responseType_;
    }
    /**
     * <code>optional .protos.Interest.ResponseType responseType = 2;</code>
     */
    public protos.Events.Interest.ResponseType getResponseType() {
      protos.Events.Interest.ResponseType result = protos.Events.Interest.ResponseType.valueOf(responseType_);
      return result == null ? protos.Events.Interest.ResponseType.UNRECOGNIZED : result;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getEventTypeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, eventType_);
      }
      if (responseType_ != protos.Events.Interest.ResponseType.DONTSEND.getNumber()) {
        output.writeEnum(2, responseType_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getEventTypeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, eventType_);
      }
      if (responseType_ != protos.Events.Interest.ResponseType.DONTSEND.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, responseType_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static protos.Events.Interest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protos.Events.Interest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protos.Events.Interest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protos.Events.Interest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protos.Events.Interest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protos.Events.Interest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static protos.Events.Interest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static protos.Events.Interest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static protos.Events.Interest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protos.Events.Interest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(protos.Events.Interest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protos.Interest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protos.Interest)
        protos.Events.InterestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return protos.Events.internal_static_protos_Interest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return protos.Events.internal_static_protos_Interest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                protos.Events.Interest.class, protos.Events.Interest.Builder.class);
      }

      // Construct using protos.Events.Interest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        eventType_ = "";

        responseType_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protos.Events.internal_static_protos_Interest_descriptor;
      }

      public protos.Events.Interest getDefaultInstanceForType() {
        return protos.Events.Interest.getDefaultInstance();
      }

      public protos.Events.Interest build() {
        protos.Events.Interest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public protos.Events.Interest buildPartial() {
        protos.Events.Interest result = new protos.Events.Interest(this);
        result.eventType_ = eventType_;
        result.responseType_ = responseType_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof protos.Events.Interest) {
          return mergeFrom((protos.Events.Interest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(protos.Events.Interest other) {
        if (other == protos.Events.Interest.getDefaultInstance()) return this;
        if (!other.getEventType().isEmpty()) {
          eventType_ = other.eventType_;
          onChanged();
        }
        if (other.responseType_ != 0) {
          setResponseTypeValue(other.getResponseTypeValue());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        protos.Events.Interest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (protos.Events.Interest) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object eventType_ = "";
      /**
       * <code>optional string eventType = 1;</code>
       */
      public java.lang.String getEventType() {
        java.lang.Object ref = eventType_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          eventType_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string eventType = 1;</code>
       */
      public com.google.protobuf.ByteString
          getEventTypeBytes() {
        java.lang.Object ref = eventType_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          eventType_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string eventType = 1;</code>
       */
      public Builder setEventType(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        eventType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string eventType = 1;</code>
       */
      public Builder clearEventType() {
        
        eventType_ = getDefaultInstance().getEventType();
        onChanged();
        return this;
      }
      /**
       * <code>optional string eventType = 1;</code>
       */
      public Builder setEventTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        eventType_ = value;
        onChanged();
        return this;
      }

      private int responseType_ = 0;
      /**
       * <code>optional .protos.Interest.ResponseType responseType = 2;</code>
       */
      public int getResponseTypeValue() {
        return responseType_;
      }
      /**
       * <code>optional .protos.Interest.ResponseType responseType = 2;</code>
       */
      public Builder setResponseTypeValue(int value) {
        responseType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .protos.Interest.ResponseType responseType = 2;</code>
       */
      public protos.Events.Interest.ResponseType getResponseType() {
        protos.Events.Interest.ResponseType result = protos.Events.Interest.ResponseType.valueOf(responseType_);
        return result == null ? protos.Events.Interest.ResponseType.UNRECOGNIZED : result;
      }
      /**
       * <code>optional .protos.Interest.ResponseType responseType = 2;</code>
       */
      public Builder setResponseType(protos.Events.Interest.ResponseType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        responseType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .protos.Interest.ResponseType responseType = 2;</code>
       */
      public Builder clearResponseType() {
        
        responseType_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:protos.Interest)
    }

    // @@protoc_insertion_point(class_scope:protos.Interest)
    private static final protos.Events.Interest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new protos.Events.Interest();
    }

    public static protos.Events.Interest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Interest>
        PARSER = new com.google.protobuf.AbstractParser<Interest>() {
      public Interest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new Interest(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    public static com.google.protobuf.Parser<Interest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Interest> getParserForType() {
      return PARSER;
    }

    public protos.Events.Interest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RegisterOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protos.Register)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .protos.Interest events = 1;</code>
     */
    java.util.List<protos.Events.Interest> 
        getEventsList();
    /**
     * <code>repeated .protos.Interest events = 1;</code>
     */
    protos.Events.Interest getEvents(int index);
    /**
     * <code>repeated .protos.Interest events = 1;</code>
     */
    int getEventsCount();
    /**
     * <code>repeated .protos.Interest events = 1;</code>
     */
    java.util.List<? extends protos.Events.InterestOrBuilder> 
        getEventsOrBuilderList();
    /**
     * <code>repeated .protos.Interest events = 1;</code>
     */
    protos.Events.InterestOrBuilder getEventsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code protos.Register}
   *
   * <pre>
   *---------- consumer events ---------
   *Register is sent by consumers for registering events
   *string type - "register"
   * </pre>
   */
  public  static final class Register extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:protos.Register)
      RegisterOrBuilder {
    // Use Register.newBuilder() to construct.
    private Register(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private Register() {
      events_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Register(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                events_ = new java.util.ArrayList<protos.Events.Interest>();
                mutable_bitField0_ |= 0x00000001;
              }
              events_.add(input.readMessage(protos.Events.Interest.parser(), extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          events_ = java.util.Collections.unmodifiableList(events_);
        }
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protos.Events.internal_static_protos_Register_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protos.Events.internal_static_protos_Register_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protos.Events.Register.class, protos.Events.Register.Builder.class);
    }

    public static final int EVENTS_FIELD_NUMBER = 1;
    private java.util.List<protos.Events.Interest> events_;
    /**
     * <code>repeated .protos.Interest events = 1;</code>
     */
    public java.util.List<protos.Events.Interest> getEventsList() {
      return events_;
    }
    /**
     * <code>repeated .protos.Interest events = 1;</code>
     */
    public java.util.List<? extends protos.Events.InterestOrBuilder> 
        getEventsOrBuilderList() {
      return events_;
    }
    /**
     * <code>repeated .protos.Interest events = 1;</code>
     */
    public int getEventsCount() {
      return events_.size();
    }
    /**
     * <code>repeated .protos.Interest events = 1;</code>
     */
    public protos.Events.Interest getEvents(int index) {
      return events_.get(index);
    }
    /**
     * <code>repeated .protos.Interest events = 1;</code>
     */
    public protos.Events.InterestOrBuilder getEventsOrBuilder(
        int index) {
      return events_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < events_.size(); i++) {
        output.writeMessage(1, events_.get(i));
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < events_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, events_.get(i));
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static protos.Events.Register parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protos.Events.Register parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protos.Events.Register parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protos.Events.Register parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protos.Events.Register parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protos.Events.Register parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static protos.Events.Register parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static protos.Events.Register parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static protos.Events.Register parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protos.Events.Register parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(protos.Events.Register prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protos.Register}
     *
     * <pre>
     *---------- consumer events ---------
     *Register is sent by consumers for registering events
     *string type - "register"
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protos.Register)
        protos.Events.RegisterOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return protos.Events.internal_static_protos_Register_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return protos.Events.internal_static_protos_Register_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                protos.Events.Register.class, protos.Events.Register.Builder.class);
      }

      // Construct using protos.Events.Register.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getEventsFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        if (eventsBuilder_ == null) {
          events_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          eventsBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protos.Events.internal_static_protos_Register_descriptor;
      }

      public protos.Events.Register getDefaultInstanceForType() {
        return protos.Events.Register.getDefaultInstance();
      }

      public protos.Events.Register build() {
        protos.Events.Register result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public protos.Events.Register buildPartial() {
        protos.Events.Register result = new protos.Events.Register(this);
        int from_bitField0_ = bitField0_;
        if (eventsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            events_ = java.util.Collections.unmodifiableList(events_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.events_ = events_;
        } else {
          result.events_ = eventsBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof protos.Events.Register) {
          return mergeFrom((protos.Events.Register)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(protos.Events.Register other) {
        if (other == protos.Events.Register.getDefaultInstance()) return this;
        if (eventsBuilder_ == null) {
          if (!other.events_.isEmpty()) {
            if (events_.isEmpty()) {
              events_ = other.events_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureEventsIsMutable();
              events_.addAll(other.events_);
            }
            onChanged();
          }
        } else {
          if (!other.events_.isEmpty()) {
            if (eventsBuilder_.isEmpty()) {
              eventsBuilder_.dispose();
              eventsBuilder_ = null;
              events_ = other.events_;
              bitField0_ = (bitField0_ & ~0x00000001);
              eventsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getEventsFieldBuilder() : null;
            } else {
              eventsBuilder_.addAllMessages(other.events_);
            }
          }
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        protos.Events.Register parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (protos.Events.Register) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<protos.Events.Interest> events_ =
        java.util.Collections.emptyList();
      private void ensureEventsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          events_ = new java.util.ArrayList<protos.Events.Interest>(events_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          protos.Events.Interest, protos.Events.Interest.Builder, protos.Events.InterestOrBuilder> eventsBuilder_;

      /**
       * <code>repeated .protos.Interest events = 1;</code>
       */
      public java.util.List<protos.Events.Interest> getEventsList() {
        if (eventsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(events_);
        } else {
          return eventsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .protos.Interest events = 1;</code>
       */
      public int getEventsCount() {
        if (eventsBuilder_ == null) {
          return events_.size();
        } else {
          return eventsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .protos.Interest events = 1;</code>
       */
      public protos.Events.Interest getEvents(int index) {
        if (eventsBuilder_ == null) {
          return events_.get(index);
        } else {
          return eventsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .protos.Interest events = 1;</code>
       */
      public Builder setEvents(
          int index, protos.Events.Interest value) {
        if (eventsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEventsIsMutable();
          events_.set(index, value);
          onChanged();
        } else {
          eventsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .protos.Interest events = 1;</code>
       */
      public Builder setEvents(
          int index, protos.Events.Interest.Builder builderForValue) {
        if (eventsBuilder_ == null) {
          ensureEventsIsMutable();
          events_.set(index, builderForValue.build());
          onChanged();
        } else {
          eventsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protos.Interest events = 1;</code>
       */
      public Builder addEvents(protos.Events.Interest value) {
        if (eventsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEventsIsMutable();
          events_.add(value);
          onChanged();
        } else {
          eventsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .protos.Interest events = 1;</code>
       */
      public Builder addEvents(
          int index, protos.Events.Interest value) {
        if (eventsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEventsIsMutable();
          events_.add(index, value);
          onChanged();
        } else {
          eventsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .protos.Interest events = 1;</code>
       */
      public Builder addEvents(
          protos.Events.Interest.Builder builderForValue) {
        if (eventsBuilder_ == null) {
          ensureEventsIsMutable();
          events_.add(builderForValue.build());
          onChanged();
        } else {
          eventsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protos.Interest events = 1;</code>
       */
      public Builder addEvents(
          int index, protos.Events.Interest.Builder builderForValue) {
        if (eventsBuilder_ == null) {
          ensureEventsIsMutable();
          events_.add(index, builderForValue.build());
          onChanged();
        } else {
          eventsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .protos.Interest events = 1;</code>
       */
      public Builder addAllEvents(
          java.lang.Iterable<? extends protos.Events.Interest> values) {
        if (eventsBuilder_ == null) {
          ensureEventsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, events_);
          onChanged();
        } else {
          eventsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .protos.Interest events = 1;</code>
       */
      public Builder clearEvents() {
        if (eventsBuilder_ == null) {
          events_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          eventsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .protos.Interest events = 1;</code>
       */
      public Builder removeEvents(int index) {
        if (eventsBuilder_ == null) {
          ensureEventsIsMutable();
          events_.remove(index);
          onChanged();
        } else {
          eventsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .protos.Interest events = 1;</code>
       */
      public protos.Events.Interest.Builder getEventsBuilder(
          int index) {
        return getEventsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .protos.Interest events = 1;</code>
       */
      public protos.Events.InterestOrBuilder getEventsOrBuilder(
          int index) {
        if (eventsBuilder_ == null) {
          return events_.get(index);  } else {
          return eventsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .protos.Interest events = 1;</code>
       */
      public java.util.List<? extends protos.Events.InterestOrBuilder> 
           getEventsOrBuilderList() {
        if (eventsBuilder_ != null) {
          return eventsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(events_);
        }
      }
      /**
       * <code>repeated .protos.Interest events = 1;</code>
       */
      public protos.Events.Interest.Builder addEventsBuilder() {
        return getEventsFieldBuilder().addBuilder(
            protos.Events.Interest.getDefaultInstance());
      }
      /**
       * <code>repeated .protos.Interest events = 1;</code>
       */
      public protos.Events.Interest.Builder addEventsBuilder(
          int index) {
        return getEventsFieldBuilder().addBuilder(
            index, protos.Events.Interest.getDefaultInstance());
      }
      /**
       * <code>repeated .protos.Interest events = 1;</code>
       */
      public java.util.List<protos.Events.Interest.Builder> 
           getEventsBuilderList() {
        return getEventsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          protos.Events.Interest, protos.Events.Interest.Builder, protos.Events.InterestOrBuilder> 
          getEventsFieldBuilder() {
        if (eventsBuilder_ == null) {
          eventsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              protos.Events.Interest, protos.Events.Interest.Builder, protos.Events.InterestOrBuilder>(
                  events_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          events_ = null;
        }
        return eventsBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:protos.Register)
    }

    // @@protoc_insertion_point(class_scope:protos.Register)
    private static final protos.Events.Register DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new protos.Events.Register();
    }

    public static protos.Events.Register getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Register>
        PARSER = new com.google.protobuf.AbstractParser<Register>() {
      public Register parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new Register(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    public static com.google.protobuf.Parser<Register> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Register> getParserForType() {
      return PARSER;
    }

    public protos.Events.Register getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GenericOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protos.Generic)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string eventType = 1;</code>
     */
    java.lang.String getEventType();
    /**
     * <code>optional string eventType = 1;</code>
     */
    com.google.protobuf.ByteString
        getEventTypeBytes();

    /**
     * <code>optional bytes payload = 2;</code>
     */
    com.google.protobuf.ByteString getPayload();
  }
  /**
   * Protobuf type {@code protos.Generic}
   *
   * <pre>
   *---------- producer events ---------
   *Generic is used for encoding payload as JSON or raw bytes
   *string type - "generic"
   * </pre>
   */
  public  static final class Generic extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:protos.Generic)
      GenericOrBuilder {
    // Use Generic.newBuilder() to construct.
    private Generic(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private Generic() {
      eventType_ = "";
      payload_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Generic(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              eventType_ = s;
              break;
            }
            case 18: {

              payload_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protos.Events.internal_static_protos_Generic_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protos.Events.internal_static_protos_Generic_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protos.Events.Generic.class, protos.Events.Generic.Builder.class);
    }

    public static final int EVENTTYPE_FIELD_NUMBER = 1;
    private volatile java.lang.Object eventType_;
    /**
     * <code>optional string eventType = 1;</code>
     */
    public java.lang.String getEventType() {
      java.lang.Object ref = eventType_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventType_ = s;
        return s;
      }
    }
    /**
     * <code>optional string eventType = 1;</code>
     */
    public com.google.protobuf.ByteString
        getEventTypeBytes() {
      java.lang.Object ref = eventType_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eventType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PAYLOAD_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString payload_;
    /**
     * <code>optional bytes payload = 2;</code>
     */
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getEventTypeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, eventType_);
      }
      if (!payload_.isEmpty()) {
        output.writeBytes(2, payload_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getEventTypeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, eventType_);
      }
      if (!payload_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, payload_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static protos.Events.Generic parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protos.Events.Generic parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protos.Events.Generic parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protos.Events.Generic parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protos.Events.Generic parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protos.Events.Generic parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static protos.Events.Generic parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static protos.Events.Generic parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static protos.Events.Generic parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protos.Events.Generic parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(protos.Events.Generic prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protos.Generic}
     *
     * <pre>
     *---------- producer events ---------
     *Generic is used for encoding payload as JSON or raw bytes
     *string type - "generic"
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protos.Generic)
        protos.Events.GenericOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return protos.Events.internal_static_protos_Generic_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return protos.Events.internal_static_protos_Generic_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                protos.Events.Generic.class, protos.Events.Generic.Builder.class);
      }

      // Construct using protos.Events.Generic.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        eventType_ = "";

        payload_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protos.Events.internal_static_protos_Generic_descriptor;
      }

      public protos.Events.Generic getDefaultInstanceForType() {
        return protos.Events.Generic.getDefaultInstance();
      }

      public protos.Events.Generic build() {
        protos.Events.Generic result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public protos.Events.Generic buildPartial() {
        protos.Events.Generic result = new protos.Events.Generic(this);
        result.eventType_ = eventType_;
        result.payload_ = payload_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof protos.Events.Generic) {
          return mergeFrom((protos.Events.Generic)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(protos.Events.Generic other) {
        if (other == protos.Events.Generic.getDefaultInstance()) return this;
        if (!other.getEventType().isEmpty()) {
          eventType_ = other.eventType_;
          onChanged();
        }
        if (other.getPayload() != com.google.protobuf.ByteString.EMPTY) {
          setPayload(other.getPayload());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        protos.Events.Generic parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (protos.Events.Generic) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object eventType_ = "";
      /**
       * <code>optional string eventType = 1;</code>
       */
      public java.lang.String getEventType() {
        java.lang.Object ref = eventType_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          eventType_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string eventType = 1;</code>
       */
      public com.google.protobuf.ByteString
          getEventTypeBytes() {
        java.lang.Object ref = eventType_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          eventType_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string eventType = 1;</code>
       */
      public Builder setEventType(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        eventType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string eventType = 1;</code>
       */
      public Builder clearEventType() {
        
        eventType_ = getDefaultInstance().getEventType();
        onChanged();
        return this;
      }
      /**
       * <code>optional string eventType = 1;</code>
       */
      public Builder setEventTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        eventType_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes payload = 2;</code>
       */
      public com.google.protobuf.ByteString getPayload() {
        return payload_;
      }
      /**
       * <code>optional bytes payload = 2;</code>
       */
      public Builder setPayload(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        payload_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes payload = 2;</code>
       */
      public Builder clearPayload() {
        
        payload_ = getDefaultInstance().getPayload();
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:protos.Generic)
    }

    // @@protoc_insertion_point(class_scope:protos.Generic)
    private static final protos.Events.Generic DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new protos.Events.Generic();
    }

    public static protos.Events.Generic getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Generic>
        PARSER = new com.google.protobuf.AbstractParser<Generic>() {
      public Generic parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new Generic(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    public static com.google.protobuf.Parser<Generic> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Generic> getParserForType() {
      return PARSER;
    }

    public protos.Events.Generic getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface OpenchainEventOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protos.OpenchainEvent)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .protos.Register register = 1;</code>
     *
     * <pre>
     *consumer events
     * </pre>
     */
    protos.Events.Register getRegister();
    /**
     * <code>optional .protos.Register register = 1;</code>
     *
     * <pre>
     *consumer events
     * </pre>
     */
    protos.Events.RegisterOrBuilder getRegisterOrBuilder();

    /**
     * <code>optional .protos.Block block = 2;</code>
     *
     * <pre>
     *producer events
     * </pre>
     */
    protos.Openchain.Block getBlock();
    /**
     * <code>optional .protos.Block block = 2;</code>
     *
     * <pre>
     *producer events
     * </pre>
     */
    protos.Openchain.BlockOrBuilder getBlockOrBuilder();

    /**
     * <code>optional .protos.Generic generic = 3;</code>
     */
    protos.Events.Generic getGeneric();
    /**
     * <code>optional .protos.Generic generic = 3;</code>
     */
    protos.Events.GenericOrBuilder getGenericOrBuilder();

    public protos.Events.OpenchainEvent.EventCase getEventCase();
  }
  /**
   * Protobuf type {@code protos.OpenchainEvent}
   *
   * <pre>
   *OpenchainEvent is used by
   *  - consumers (adapters) to send Register
   *  - producer to advertise supported types and events 
   * </pre>
   */
  public  static final class OpenchainEvent extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:protos.OpenchainEvent)
      OpenchainEventOrBuilder {
    // Use OpenchainEvent.newBuilder() to construct.
    private OpenchainEvent(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private OpenchainEvent() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private OpenchainEvent(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              protos.Events.Register.Builder subBuilder = null;
              if (eventCase_ == 1) {
                subBuilder = ((protos.Events.Register) event_).toBuilder();
              }
              event_ =
                  input.readMessage(protos.Events.Register.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((protos.Events.Register) event_);
                event_ = subBuilder.buildPartial();
              }
              eventCase_ = 1;
              break;
            }
            case 18: {
              protos.Openchain.Block.Builder subBuilder = null;
              if (eventCase_ == 2) {
                subBuilder = ((protos.Openchain.Block) event_).toBuilder();
              }
              event_ =
                  input.readMessage(protos.Openchain.Block.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((protos.Openchain.Block) event_);
                event_ = subBuilder.buildPartial();
              }
              eventCase_ = 2;
              break;
            }
            case 26: {
              protos.Events.Generic.Builder subBuilder = null;
              if (eventCase_ == 3) {
                subBuilder = ((protos.Events.Generic) event_).toBuilder();
              }
              event_ =
                  input.readMessage(protos.Events.Generic.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((protos.Events.Generic) event_);
                event_ = subBuilder.buildPartial();
              }
              eventCase_ = 3;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protos.Events.internal_static_protos_OpenchainEvent_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protos.Events.internal_static_protos_OpenchainEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protos.Events.OpenchainEvent.class, protos.Events.OpenchainEvent.Builder.class);
    }

    private int eventCase_ = 0;
    private java.lang.Object event_;
    public enum EventCase
        implements com.google.protobuf.Internal.EnumLite {
      REGISTER(1),
      BLOCK(2),
      GENERIC(3),
      EVENT_NOT_SET(0);
      private int value = 0;
      private EventCase(int value) {
        this.value = value;
      }
      public static EventCase valueOf(int value) {
        switch (value) {
          case 1: return REGISTER;
          case 2: return BLOCK;
          case 3: return GENERIC;
          case 0: return EVENT_NOT_SET;
          default: throw new java.lang.IllegalArgumentException(
            "Value is undefined for this oneof enum.");
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public EventCase
    getEventCase() {
      return EventCase.valueOf(
          eventCase_);
    }

    public static final int REGISTER_FIELD_NUMBER = 1;
    /**
     * <code>optional .protos.Register register = 1;</code>
     *
     * <pre>
     *consumer events
     * </pre>
     */
    public protos.Events.Register getRegister() {
      if (eventCase_ == 1) {
         return (protos.Events.Register) event_;
      }
      return protos.Events.Register.getDefaultInstance();
    }
    /**
     * <code>optional .protos.Register register = 1;</code>
     *
     * <pre>
     *consumer events
     * </pre>
     */
    public protos.Events.RegisterOrBuilder getRegisterOrBuilder() {
      if (eventCase_ == 1) {
         return (protos.Events.Register) event_;
      }
      return protos.Events.Register.getDefaultInstance();
    }

    public static final int BLOCK_FIELD_NUMBER = 2;
    /**
     * <code>optional .protos.Block block = 2;</code>
     *
     * <pre>
     *producer events
     * </pre>
     */
    public protos.Openchain.Block getBlock() {
      if (eventCase_ == 2) {
         return (protos.Openchain.Block) event_;
      }
      return protos.Openchain.Block.getDefaultInstance();
    }
    /**
     * <code>optional .protos.Block block = 2;</code>
     *
     * <pre>
     *producer events
     * </pre>
     */
    public protos.Openchain.BlockOrBuilder getBlockOrBuilder() {
      if (eventCase_ == 2) {
         return (protos.Openchain.Block) event_;
      }
      return protos.Openchain.Block.getDefaultInstance();
    }

    public static final int GENERIC_FIELD_NUMBER = 3;
    /**
     * <code>optional .protos.Generic generic = 3;</code>
     */
    public protos.Events.Generic getGeneric() {
      if (eventCase_ == 3) {
         return (protos.Events.Generic) event_;
      }
      return protos.Events.Generic.getDefaultInstance();
    }
    /**
     * <code>optional .protos.Generic generic = 3;</code>
     */
    public protos.Events.GenericOrBuilder getGenericOrBuilder() {
      if (eventCase_ == 3) {
         return (protos.Events.Generic) event_;
      }
      return protos.Events.Generic.getDefaultInstance();
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (eventCase_ == 1) {
        output.writeMessage(1, (protos.Events.Register) event_);
      }
      if (eventCase_ == 2) {
        output.writeMessage(2, (protos.Openchain.Block) event_);
      }
      if (eventCase_ == 3) {
        output.writeMessage(3, (protos.Events.Generic) event_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (eventCase_ == 1) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, (protos.Events.Register) event_);
      }
      if (eventCase_ == 2) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, (protos.Openchain.Block) event_);
      }
      if (eventCase_ == 3) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, (protos.Events.Generic) event_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static protos.Events.OpenchainEvent parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protos.Events.OpenchainEvent parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protos.Events.OpenchainEvent parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protos.Events.OpenchainEvent parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protos.Events.OpenchainEvent parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protos.Events.OpenchainEvent parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static protos.Events.OpenchainEvent parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static protos.Events.OpenchainEvent parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static protos.Events.OpenchainEvent parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protos.Events.OpenchainEvent parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(protos.Events.OpenchainEvent prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protos.OpenchainEvent}
     *
     * <pre>
     *OpenchainEvent is used by
     *  - consumers (adapters) to send Register
     *  - producer to advertise supported types and events 
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protos.OpenchainEvent)
        protos.Events.OpenchainEventOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return protos.Events.internal_static_protos_OpenchainEvent_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return protos.Events.internal_static_protos_OpenchainEvent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                protos.Events.OpenchainEvent.class, protos.Events.OpenchainEvent.Builder.class);
      }

      // Construct using protos.Events.OpenchainEvent.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        eventCase_ = 0;
        event_ = null;
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protos.Events.internal_static_protos_OpenchainEvent_descriptor;
      }

      public protos.Events.OpenchainEvent getDefaultInstanceForType() {
        return protos.Events.OpenchainEvent.getDefaultInstance();
      }

      public protos.Events.OpenchainEvent build() {
        protos.Events.OpenchainEvent result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public protos.Events.OpenchainEvent buildPartial() {
        protos.Events.OpenchainEvent result = new protos.Events.OpenchainEvent(this);
        if (eventCase_ == 1) {
          if (registerBuilder_ == null) {
            result.event_ = event_;
          } else {
            result.event_ = registerBuilder_.build();
          }
        }
        if (eventCase_ == 2) {
          if (blockBuilder_ == null) {
            result.event_ = event_;
          } else {
            result.event_ = blockBuilder_.build();
          }
        }
        if (eventCase_ == 3) {
          if (genericBuilder_ == null) {
            result.event_ = event_;
          } else {
            result.event_ = genericBuilder_.build();
          }
        }
        result.eventCase_ = eventCase_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof protos.Events.OpenchainEvent) {
          return mergeFrom((protos.Events.OpenchainEvent)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(protos.Events.OpenchainEvent other) {
        if (other == protos.Events.OpenchainEvent.getDefaultInstance()) return this;
        switch (other.getEventCase()) {
          case REGISTER: {
            mergeRegister(other.getRegister());
            break;
          }
          case BLOCK: {
            mergeBlock(other.getBlock());
            break;
          }
          case GENERIC: {
            mergeGeneric(other.getGeneric());
            break;
          }
          case EVENT_NOT_SET: {
            break;
          }
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        protos.Events.OpenchainEvent parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (protos.Events.OpenchainEvent) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int eventCase_ = 0;
      private java.lang.Object event_;
      public EventCase
          getEventCase() {
        return EventCase.valueOf(
            eventCase_);
      }

      public Builder clearEvent() {
        eventCase_ = 0;
        event_ = null;
        onChanged();
        return this;
      }


      private com.google.protobuf.SingleFieldBuilder<
          protos.Events.Register, protos.Events.Register.Builder, protos.Events.RegisterOrBuilder> registerBuilder_;
      /**
       * <code>optional .protos.Register register = 1;</code>
       *
       * <pre>
       *consumer events
       * </pre>
       */
      public protos.Events.Register getRegister() {
        if (registerBuilder_ == null) {
          if (eventCase_ == 1) {
            return (protos.Events.Register) event_;
          }
          return protos.Events.Register.getDefaultInstance();
        } else {
          if (eventCase_ == 1) {
            return registerBuilder_.getMessage();
          }
          return protos.Events.Register.getDefaultInstance();
        }
      }
      /**
       * <code>optional .protos.Register register = 1;</code>
       *
       * <pre>
       *consumer events
       * </pre>
       */
      public Builder setRegister(protos.Events.Register value) {
        if (registerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          event_ = value;
          onChanged();
        } else {
          registerBuilder_.setMessage(value);
        }
        eventCase_ = 1;
        return this;
      }
      /**
       * <code>optional .protos.Register register = 1;</code>
       *
       * <pre>
       *consumer events
       * </pre>
       */
      public Builder setRegister(
          protos.Events.Register.Builder builderForValue) {
        if (registerBuilder_ == null) {
          event_ = builderForValue.build();
          onChanged();
        } else {
          registerBuilder_.setMessage(builderForValue.build());
        }
        eventCase_ = 1;
        return this;
      }
      /**
       * <code>optional .protos.Register register = 1;</code>
       *
       * <pre>
       *consumer events
       * </pre>
       */
      public Builder mergeRegister(protos.Events.Register value) {
        if (registerBuilder_ == null) {
          if (eventCase_ == 1 &&
              event_ != protos.Events.Register.getDefaultInstance()) {
            event_ = protos.Events.Register.newBuilder((protos.Events.Register) event_)
                .mergeFrom(value).buildPartial();
          } else {
            event_ = value;
          }
          onChanged();
        } else {
          if (eventCase_ == 1) {
            registerBuilder_.mergeFrom(value);
          }
          registerBuilder_.setMessage(value);
        }
        eventCase_ = 1;
        return this;
      }
      /**
       * <code>optional .protos.Register register = 1;</code>
       *
       * <pre>
       *consumer events
       * </pre>
       */
      public Builder clearRegister() {
        if (registerBuilder_ == null) {
          if (eventCase_ == 1) {
            eventCase_ = 0;
            event_ = null;
            onChanged();
          }
        } else {
          if (eventCase_ == 1) {
            eventCase_ = 0;
            event_ = null;
          }
          registerBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>optional .protos.Register register = 1;</code>
       *
       * <pre>
       *consumer events
       * </pre>
       */
      public protos.Events.Register.Builder getRegisterBuilder() {
        return getRegisterFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .protos.Register register = 1;</code>
       *
       * <pre>
       *consumer events
       * </pre>
       */
      public protos.Events.RegisterOrBuilder getRegisterOrBuilder() {
        if ((eventCase_ == 1) && (registerBuilder_ != null)) {
          return registerBuilder_.getMessageOrBuilder();
        } else {
          if (eventCase_ == 1) {
            return (protos.Events.Register) event_;
          }
          return protos.Events.Register.getDefaultInstance();
        }
      }
      /**
       * <code>optional .protos.Register register = 1;</code>
       *
       * <pre>
       *consumer events
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          protos.Events.Register, protos.Events.Register.Builder, protos.Events.RegisterOrBuilder> 
          getRegisterFieldBuilder() {
        if (registerBuilder_ == null) {
          if (!(eventCase_ == 1)) {
            event_ = protos.Events.Register.getDefaultInstance();
          }
          registerBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              protos.Events.Register, protos.Events.Register.Builder, protos.Events.RegisterOrBuilder>(
                  (protos.Events.Register) event_,
                  getParentForChildren(),
                  isClean());
          event_ = null;
        }
        eventCase_ = 1;
        onChanged();;
        return registerBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilder<
          protos.Openchain.Block, protos.Openchain.Block.Builder, protos.Openchain.BlockOrBuilder> blockBuilder_;
      /**
       * <code>optional .protos.Block block = 2;</code>
       *
       * <pre>
       *producer events
       * </pre>
       */
      public protos.Openchain.Block getBlock() {
        if (blockBuilder_ == null) {
          if (eventCase_ == 2) {
            return (protos.Openchain.Block) event_;
          }
          return protos.Openchain.Block.getDefaultInstance();
        } else {
          if (eventCase_ == 2) {
            return blockBuilder_.getMessage();
          }
          return protos.Openchain.Block.getDefaultInstance();
        }
      }
      /**
       * <code>optional .protos.Block block = 2;</code>
       *
       * <pre>
       *producer events
       * </pre>
       */
      public Builder setBlock(protos.Openchain.Block value) {
        if (blockBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          event_ = value;
          onChanged();
        } else {
          blockBuilder_.setMessage(value);
        }
        eventCase_ = 2;
        return this;
      }
      /**
       * <code>optional .protos.Block block = 2;</code>
       *
       * <pre>
       *producer events
       * </pre>
       */
      public Builder setBlock(
          protos.Openchain.Block.Builder builderForValue) {
        if (blockBuilder_ == null) {
          event_ = builderForValue.build();
          onChanged();
        } else {
          blockBuilder_.setMessage(builderForValue.build());
        }
        eventCase_ = 2;
        return this;
      }
      /**
       * <code>optional .protos.Block block = 2;</code>
       *
       * <pre>
       *producer events
       * </pre>
       */
      public Builder mergeBlock(protos.Openchain.Block value) {
        if (blockBuilder_ == null) {
          if (eventCase_ == 2 &&
              event_ != protos.Openchain.Block.getDefaultInstance()) {
            event_ = protos.Openchain.Block.newBuilder((protos.Openchain.Block) event_)
                .mergeFrom(value).buildPartial();
          } else {
            event_ = value;
          }
          onChanged();
        } else {
          if (eventCase_ == 2) {
            blockBuilder_.mergeFrom(value);
          }
          blockBuilder_.setMessage(value);
        }
        eventCase_ = 2;
        return this;
      }
      /**
       * <code>optional .protos.Block block = 2;</code>
       *
       * <pre>
       *producer events
       * </pre>
       */
      public Builder clearBlock() {
        if (blockBuilder_ == null) {
          if (eventCase_ == 2) {
            eventCase_ = 0;
            event_ = null;
            onChanged();
          }
        } else {
          if (eventCase_ == 2) {
            eventCase_ = 0;
            event_ = null;
          }
          blockBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>optional .protos.Block block = 2;</code>
       *
       * <pre>
       *producer events
       * </pre>
       */
      public protos.Openchain.Block.Builder getBlockBuilder() {
        return getBlockFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .protos.Block block = 2;</code>
       *
       * <pre>
       *producer events
       * </pre>
       */
      public protos.Openchain.BlockOrBuilder getBlockOrBuilder() {
        if ((eventCase_ == 2) && (blockBuilder_ != null)) {
          return blockBuilder_.getMessageOrBuilder();
        } else {
          if (eventCase_ == 2) {
            return (protos.Openchain.Block) event_;
          }
          return protos.Openchain.Block.getDefaultInstance();
        }
      }
      /**
       * <code>optional .protos.Block block = 2;</code>
       *
       * <pre>
       *producer events
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          protos.Openchain.Block, protos.Openchain.Block.Builder, protos.Openchain.BlockOrBuilder> 
          getBlockFieldBuilder() {
        if (blockBuilder_ == null) {
          if (!(eventCase_ == 2)) {
            event_ = protos.Openchain.Block.getDefaultInstance();
          }
          blockBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              protos.Openchain.Block, protos.Openchain.Block.Builder, protos.Openchain.BlockOrBuilder>(
                  (protos.Openchain.Block) event_,
                  getParentForChildren(),
                  isClean());
          event_ = null;
        }
        eventCase_ = 2;
        onChanged();;
        return blockBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilder<
          protos.Events.Generic, protos.Events.Generic.Builder, protos.Events.GenericOrBuilder> genericBuilder_;
      /**
       * <code>optional .protos.Generic generic = 3;</code>
       */
      public protos.Events.Generic getGeneric() {
        if (genericBuilder_ == null) {
          if (eventCase_ == 3) {
            return (protos.Events.Generic) event_;
          }
          return protos.Events.Generic.getDefaultInstance();
        } else {
          if (eventCase_ == 3) {
            return genericBuilder_.getMessage();
          }
          return protos.Events.Generic.getDefaultInstance();
        }
      }
      /**
       * <code>optional .protos.Generic generic = 3;</code>
       */
      public Builder setGeneric(protos.Events.Generic value) {
        if (genericBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          event_ = value;
          onChanged();
        } else {
          genericBuilder_.setMessage(value);
        }
        eventCase_ = 3;
        return this;
      }
      /**
       * <code>optional .protos.Generic generic = 3;</code>
       */
      public Builder setGeneric(
          protos.Events.Generic.Builder builderForValue) {
        if (genericBuilder_ == null) {
          event_ = builderForValue.build();
          onChanged();
        } else {
          genericBuilder_.setMessage(builderForValue.build());
        }
        eventCase_ = 3;
        return this;
      }
      /**
       * <code>optional .protos.Generic generic = 3;</code>
       */
      public Builder mergeGeneric(protos.Events.Generic value) {
        if (genericBuilder_ == null) {
          if (eventCase_ == 3 &&
              event_ != protos.Events.Generic.getDefaultInstance()) {
            event_ = protos.Events.Generic.newBuilder((protos.Events.Generic) event_)
                .mergeFrom(value).buildPartial();
          } else {
            event_ = value;
          }
          onChanged();
        } else {
          if (eventCase_ == 3) {
            genericBuilder_.mergeFrom(value);
          }
          genericBuilder_.setMessage(value);
        }
        eventCase_ = 3;
        return this;
      }
      /**
       * <code>optional .protos.Generic generic = 3;</code>
       */
      public Builder clearGeneric() {
        if (genericBuilder_ == null) {
          if (eventCase_ == 3) {
            eventCase_ = 0;
            event_ = null;
            onChanged();
          }
        } else {
          if (eventCase_ == 3) {
            eventCase_ = 0;
            event_ = null;
          }
          genericBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>optional .protos.Generic generic = 3;</code>
       */
      public protos.Events.Generic.Builder getGenericBuilder() {
        return getGenericFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .protos.Generic generic = 3;</code>
       */
      public protos.Events.GenericOrBuilder getGenericOrBuilder() {
        if ((eventCase_ == 3) && (genericBuilder_ != null)) {
          return genericBuilder_.getMessageOrBuilder();
        } else {
          if (eventCase_ == 3) {
            return (protos.Events.Generic) event_;
          }
          return protos.Events.Generic.getDefaultInstance();
        }
      }
      /**
       * <code>optional .protos.Generic generic = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          protos.Events.Generic, protos.Events.Generic.Builder, protos.Events.GenericOrBuilder> 
          getGenericFieldBuilder() {
        if (genericBuilder_ == null) {
          if (!(eventCase_ == 3)) {
            event_ = protos.Events.Generic.getDefaultInstance();
          }
          genericBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              protos.Events.Generic, protos.Events.Generic.Builder, protos.Events.GenericOrBuilder>(
                  (protos.Events.Generic) event_,
                  getParentForChildren(),
                  isClean());
          event_ = null;
        }
        eventCase_ = 3;
        onChanged();;
        return genericBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:protos.OpenchainEvent)
    }

    // @@protoc_insertion_point(class_scope:protos.OpenchainEvent)
    private static final protos.Events.OpenchainEvent DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new protos.Events.OpenchainEvent();
    }

    public static protos.Events.OpenchainEvent getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OpenchainEvent>
        PARSER = new com.google.protobuf.AbstractParser<OpenchainEvent>() {
      public OpenchainEvent parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new OpenchainEvent(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    public static com.google.protobuf.Parser<OpenchainEvent> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OpenchainEvent> getParserForType() {
      return PARSER;
    }

    public protos.Events.OpenchainEvent getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_Interest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protos_Interest_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_Register_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protos_Register_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_Generic_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protos_Generic_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_OpenchainEvent_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protos_OpenchainEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014events.proto\022\006protos\032\017openchain.proto\"" +
      "\210\001\n\010Interest\022\021\n\teventType\030\001 \001(\t\0223\n\014respo" +
      "nseType\030\002 \001(\0162\035.protos.Interest.Response" +
      "Type\"4\n\014ResponseType\022\014\n\010DONTSEND\020\000\022\014\n\010PR" +
      "OTOBUF\020\001\022\010\n\004JSON\020\002\",\n\010Register\022 \n\006events" +
      "\030\001 \003(\0132\020.protos.Interest\"-\n\007Generic\022\021\n\te" +
      "ventType\030\001 \001(\t\022\017\n\007payload\030\002 \001(\014\"\203\001\n\016Open" +
      "chainEvent\022$\n\010register\030\001 \001(\0132\020.protos.Re" +
      "gisterH\000\022\036\n\005block\030\002 \001(\0132\r.protos.BlockH\000" +
      "\022\"\n\007generic\030\003 \001(\0132\017.protos.GenericH\000B\007\n\005",
      "Event2O\n\017OpenchainEvents\022<\n\004Chat\022\026.proto" +
      "s.OpenchainEvent\032\026.protos.OpenchainEvent" +
      "\"\000(\0010\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          protos.Openchain.getDescriptor(),
        }, assigner);
    internal_static_protos_Interest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protos_Interest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_protos_Interest_descriptor,
        new java.lang.String[] { "EventType", "ResponseType", });
    internal_static_protos_Register_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_protos_Register_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_protos_Register_descriptor,
        new java.lang.String[] { "Events", });
    internal_static_protos_Generic_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_protos_Generic_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_protos_Generic_descriptor,
        new java.lang.String[] { "EventType", "Payload", });
    internal_static_protos_OpenchainEvent_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_protos_OpenchainEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_protos_OpenchainEvent_descriptor,
        new java.lang.String[] { "Register", "Block", "Generic", "Event", });
    protos.Openchain.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

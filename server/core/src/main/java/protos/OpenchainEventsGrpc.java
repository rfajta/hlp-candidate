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

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class OpenchainEventsGrpc {

  private OpenchainEventsGrpc() {}

  public static final String SERVICE_NAME = "protos.OpenchainEvents";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<protos.Events.OpenchainEvent,
      protos.Events.OpenchainEvent> METHOD_CHAT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "protos.OpenchainEvents", "Chat"),
          io.grpc.protobuf.ProtoUtils.marshaller(protos.Events.OpenchainEvent.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(protos.Events.OpenchainEvent.getDefaultInstance()));

  public static OpenchainEventsStub newStub(io.grpc.Channel channel) {
    return new OpenchainEventsStub(channel);
  }

  public static OpenchainEventsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OpenchainEventsBlockingStub(channel);
  }

  public static OpenchainEventsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OpenchainEventsFutureStub(channel);
  }

  public static interface OpenchainEvents {

    public io.grpc.stub.StreamObserver<protos.Events.OpenchainEvent> chat(
        io.grpc.stub.StreamObserver<protos.Events.OpenchainEvent> responseObserver);
  }

  public static interface OpenchainEventsBlockingClient {
  }

  public static interface OpenchainEventsFutureClient {
  }

  public static class OpenchainEventsStub extends io.grpc.stub.AbstractStub<OpenchainEventsStub>
      implements OpenchainEvents {
    private OpenchainEventsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OpenchainEventsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OpenchainEventsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OpenchainEventsStub(channel, callOptions);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<protos.Events.OpenchainEvent> chat(
        io.grpc.stub.StreamObserver<protos.Events.OpenchainEvent> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_CHAT, getCallOptions()), responseObserver);
    }
  }

  public static class OpenchainEventsBlockingStub extends io.grpc.stub.AbstractStub<OpenchainEventsBlockingStub>
      implements OpenchainEventsBlockingClient {
    private OpenchainEventsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OpenchainEventsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OpenchainEventsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OpenchainEventsBlockingStub(channel, callOptions);
    }
  }

  public static class OpenchainEventsFutureStub extends io.grpc.stub.AbstractStub<OpenchainEventsFutureStub>
      implements OpenchainEventsFutureClient {
    private OpenchainEventsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OpenchainEventsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OpenchainEventsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OpenchainEventsFutureStub(channel, callOptions);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final OpenchainEvents serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
      .addMethod(
        METHOD_CHAT,
        asyncBidiStreamingCall(
          new io.grpc.stub.ServerCalls.BidiStreamingMethod<
              protos.Events.OpenchainEvent,
              protos.Events.OpenchainEvent>() {
            @java.lang.Override
            public io.grpc.stub.StreamObserver<protos.Events.OpenchainEvent> invoke(
                io.grpc.stub.StreamObserver<protos.Events.OpenchainEvent> responseObserver) {
              return serviceImpl.chat(responseObserver);
            }
          })).build();
  }
}

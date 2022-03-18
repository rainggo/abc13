package com.skemaloop.test;

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
    comments = "Source: Bbb.proto")
public final class BbbGrpc {

  private BbbGrpc() {}

  public static final String SERVICE_NAME = "abc.aaa.Bbb";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSayHelloMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.skemaloop.test.BbbOuterClass.HelloRequest,
      com.skemaloop.test.BbbOuterClass.HelloReply> METHOD_SAY_HELLO = getSayHelloMethod();

  private static volatile io.grpc.MethodDescriptor<com.skemaloop.test.BbbOuterClass.HelloRequest,
      com.skemaloop.test.BbbOuterClass.HelloReply> getSayHelloMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.skemaloop.test.BbbOuterClass.HelloRequest,
      com.skemaloop.test.BbbOuterClass.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.skemaloop.test.BbbOuterClass.HelloRequest, com.skemaloop.test.BbbOuterClass.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = BbbGrpc.getSayHelloMethod) == null) {
      synchronized (BbbGrpc.class) {
        if ((getSayHelloMethod = BbbGrpc.getSayHelloMethod) == null) {
          BbbGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<com.skemaloop.test.BbbOuterClass.HelloRequest, com.skemaloop.test.BbbOuterClass.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "abc.aaa.Bbb", "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skemaloop.test.BbbOuterClass.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skemaloop.test.BbbOuterClass.HelloReply.getDefaultInstance()))
                  .setSchemaDescriptor(new BbbMethodDescriptorSupplier("SayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BbbStub newStub(io.grpc.Channel channel) {
    return new BbbStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BbbBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BbbBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BbbFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BbbFutureStub(channel);
  }

  /**
   */
  public static abstract class BbbImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(com.skemaloop.test.BbbOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.skemaloop.test.BbbOuterClass.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.skemaloop.test.BbbOuterClass.HelloRequest,
                com.skemaloop.test.BbbOuterClass.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class BbbStub extends io.grpc.stub.AbstractStub<BbbStub> {
    private BbbStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BbbStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BbbStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BbbStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.skemaloop.test.BbbOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.skemaloop.test.BbbOuterClass.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BbbBlockingStub extends io.grpc.stub.AbstractStub<BbbBlockingStub> {
    private BbbBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BbbBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BbbBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BbbBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.skemaloop.test.BbbOuterClass.HelloReply sayHello(com.skemaloop.test.BbbOuterClass.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BbbFutureStub extends io.grpc.stub.AbstractStub<BbbFutureStub> {
    private BbbFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BbbFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BbbFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BbbFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skemaloop.test.BbbOuterClass.HelloReply> sayHello(
        com.skemaloop.test.BbbOuterClass.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BbbImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BbbImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.skemaloop.test.BbbOuterClass.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.skemaloop.test.BbbOuterClass.HelloReply>) responseObserver);
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

  private static abstract class BbbBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BbbBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.skemaloop.test.BbbOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Bbb");
    }
  }

  private static final class BbbFileDescriptorSupplier
      extends BbbBaseDescriptorSupplier {
    BbbFileDescriptorSupplier() {}
  }

  private static final class BbbMethodDescriptorSupplier
      extends BbbBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BbbMethodDescriptorSupplier(String methodName) {
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
      synchronized (BbbGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BbbFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}

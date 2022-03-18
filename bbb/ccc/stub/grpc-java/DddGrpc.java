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
    comments = "Source: Ddd.proto")
public final class DddGrpc {

  private DddGrpc() {}

  public static final String SERVICE_NAME = "bbb.ccc.Ddd";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSayHelloMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.skemaloop.test.DddOuterClass.HelloRequest,
      com.skemaloop.test.DddOuterClass.HelloReply> METHOD_SAY_HELLO = getSayHelloMethod();

  private static volatile io.grpc.MethodDescriptor<com.skemaloop.test.DddOuterClass.HelloRequest,
      com.skemaloop.test.DddOuterClass.HelloReply> getSayHelloMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.skemaloop.test.DddOuterClass.HelloRequest,
      com.skemaloop.test.DddOuterClass.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.skemaloop.test.DddOuterClass.HelloRequest, com.skemaloop.test.DddOuterClass.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = DddGrpc.getSayHelloMethod) == null) {
      synchronized (DddGrpc.class) {
        if ((getSayHelloMethod = DddGrpc.getSayHelloMethod) == null) {
          DddGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<com.skemaloop.test.DddOuterClass.HelloRequest, com.skemaloop.test.DddOuterClass.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bbb.ccc.Ddd", "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skemaloop.test.DddOuterClass.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skemaloop.test.DddOuterClass.HelloReply.getDefaultInstance()))
                  .setSchemaDescriptor(new DddMethodDescriptorSupplier("SayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DddStub newStub(io.grpc.Channel channel) {
    return new DddStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DddBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DddBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DddFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DddFutureStub(channel);
  }

  /**
   */
  public static abstract class DddImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(com.skemaloop.test.DddOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.skemaloop.test.DddOuterClass.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.skemaloop.test.DddOuterClass.HelloRequest,
                com.skemaloop.test.DddOuterClass.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class DddStub extends io.grpc.stub.AbstractStub<DddStub> {
    private DddStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DddStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DddStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DddStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.skemaloop.test.DddOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.skemaloop.test.DddOuterClass.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DddBlockingStub extends io.grpc.stub.AbstractStub<DddBlockingStub> {
    private DddBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DddBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DddBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DddBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.skemaloop.test.DddOuterClass.HelloReply sayHello(com.skemaloop.test.DddOuterClass.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DddFutureStub extends io.grpc.stub.AbstractStub<DddFutureStub> {
    private DddFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DddFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DddFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DddFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skemaloop.test.DddOuterClass.HelloReply> sayHello(
        com.skemaloop.test.DddOuterClass.HelloRequest request) {
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
    private final DddImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DddImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.skemaloop.test.DddOuterClass.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.skemaloop.test.DddOuterClass.HelloReply>) responseObserver);
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

  private static abstract class DddBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DddBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.skemaloop.test.DddOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Ddd");
    }
  }

  private static final class DddFileDescriptorSupplier
      extends DddBaseDescriptorSupplier {
    DddFileDescriptorSupplier() {}
  }

  private static final class DddMethodDescriptorSupplier
      extends DddBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DddMethodDescriptorSupplier(String methodName) {
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
      synchronized (DddGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DddFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}

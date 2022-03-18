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
    comments = "Source: Ooo.proto")
public final class OooGrpc {

  private OooGrpc() {}

  public static final String SERVICE_NAME = "mmm.nnn.Ooo";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSayHelloMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.skemaloop.test.OooOuterClass.HelloRequest,
      com.skemaloop.test.OooOuterClass.HelloReply> METHOD_SAY_HELLO = getSayHelloMethod();

  private static volatile io.grpc.MethodDescriptor<com.skemaloop.test.OooOuterClass.HelloRequest,
      com.skemaloop.test.OooOuterClass.HelloReply> getSayHelloMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.skemaloop.test.OooOuterClass.HelloRequest,
      com.skemaloop.test.OooOuterClass.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.skemaloop.test.OooOuterClass.HelloRequest, com.skemaloop.test.OooOuterClass.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = OooGrpc.getSayHelloMethod) == null) {
      synchronized (OooGrpc.class) {
        if ((getSayHelloMethod = OooGrpc.getSayHelloMethod) == null) {
          OooGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<com.skemaloop.test.OooOuterClass.HelloRequest, com.skemaloop.test.OooOuterClass.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "mmm.nnn.Ooo", "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skemaloop.test.OooOuterClass.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skemaloop.test.OooOuterClass.HelloReply.getDefaultInstance()))
                  .setSchemaDescriptor(new OooMethodDescriptorSupplier("SayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OooStub newStub(io.grpc.Channel channel) {
    return new OooStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OooBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OooBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OooFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OooFutureStub(channel);
  }

  /**
   */
  public static abstract class OooImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(com.skemaloop.test.OooOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.skemaloop.test.OooOuterClass.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.skemaloop.test.OooOuterClass.HelloRequest,
                com.skemaloop.test.OooOuterClass.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class OooStub extends io.grpc.stub.AbstractStub<OooStub> {
    private OooStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OooStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OooStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OooStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.skemaloop.test.OooOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.skemaloop.test.OooOuterClass.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OooBlockingStub extends io.grpc.stub.AbstractStub<OooBlockingStub> {
    private OooBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OooBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OooBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OooBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.skemaloop.test.OooOuterClass.HelloReply sayHello(com.skemaloop.test.OooOuterClass.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OooFutureStub extends io.grpc.stub.AbstractStub<OooFutureStub> {
    private OooFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OooFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OooFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OooFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skemaloop.test.OooOuterClass.HelloReply> sayHello(
        com.skemaloop.test.OooOuterClass.HelloRequest request) {
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
    private final OooImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OooImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.skemaloop.test.OooOuterClass.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.skemaloop.test.OooOuterClass.HelloReply>) responseObserver);
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

  private static abstract class OooBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OooBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.skemaloop.test.OooOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Ooo");
    }
  }

  private static final class OooFileDescriptorSupplier
      extends OooBaseDescriptorSupplier {
    OooFileDescriptorSupplier() {}
  }

  private static final class OooMethodDescriptorSupplier
      extends OooBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OooMethodDescriptorSupplier(String methodName) {
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
      synchronized (OooGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OooFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}

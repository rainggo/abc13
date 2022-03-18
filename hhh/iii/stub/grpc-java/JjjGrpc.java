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
    comments = "Source: Jjj.proto")
public final class JjjGrpc {

  private JjjGrpc() {}

  public static final String SERVICE_NAME = "hhh.iii.Jjj";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSayHelloMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.skemaloop.test.JjjOuterClass.HelloRequest,
      com.skemaloop.test.JjjOuterClass.HelloReply> METHOD_SAY_HELLO = getSayHelloMethod();

  private static volatile io.grpc.MethodDescriptor<com.skemaloop.test.JjjOuterClass.HelloRequest,
      com.skemaloop.test.JjjOuterClass.HelloReply> getSayHelloMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.skemaloop.test.JjjOuterClass.HelloRequest,
      com.skemaloop.test.JjjOuterClass.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.skemaloop.test.JjjOuterClass.HelloRequest, com.skemaloop.test.JjjOuterClass.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = JjjGrpc.getSayHelloMethod) == null) {
      synchronized (JjjGrpc.class) {
        if ((getSayHelloMethod = JjjGrpc.getSayHelloMethod) == null) {
          JjjGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<com.skemaloop.test.JjjOuterClass.HelloRequest, com.skemaloop.test.JjjOuterClass.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "hhh.iii.Jjj", "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skemaloop.test.JjjOuterClass.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skemaloop.test.JjjOuterClass.HelloReply.getDefaultInstance()))
                  .setSchemaDescriptor(new JjjMethodDescriptorSupplier("SayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JjjStub newStub(io.grpc.Channel channel) {
    return new JjjStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JjjBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new JjjBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JjjFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new JjjFutureStub(channel);
  }

  /**
   */
  public static abstract class JjjImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(com.skemaloop.test.JjjOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.skemaloop.test.JjjOuterClass.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.skemaloop.test.JjjOuterClass.HelloRequest,
                com.skemaloop.test.JjjOuterClass.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class JjjStub extends io.grpc.stub.AbstractStub<JjjStub> {
    private JjjStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JjjStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JjjStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JjjStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.skemaloop.test.JjjOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.skemaloop.test.JjjOuterClass.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JjjBlockingStub extends io.grpc.stub.AbstractStub<JjjBlockingStub> {
    private JjjBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JjjBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JjjBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JjjBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.skemaloop.test.JjjOuterClass.HelloReply sayHello(com.skemaloop.test.JjjOuterClass.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JjjFutureStub extends io.grpc.stub.AbstractStub<JjjFutureStub> {
    private JjjFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JjjFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JjjFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JjjFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.skemaloop.test.JjjOuterClass.HelloReply> sayHello(
        com.skemaloop.test.JjjOuterClass.HelloRequest request) {
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
    private final JjjImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JjjImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.skemaloop.test.JjjOuterClass.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.skemaloop.test.JjjOuterClass.HelloReply>) responseObserver);
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

  private static abstract class JjjBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JjjBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.skemaloop.test.JjjOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Jjj");
    }
  }

  private static final class JjjFileDescriptorSupplier
      extends JjjBaseDescriptorSupplier {
    JjjFileDescriptorSupplier() {}
  }

  private static final class JjjMethodDescriptorSupplier
      extends JjjBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JjjMethodDescriptorSupplier(String methodName) {
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
      synchronized (JjjGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JjjFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}

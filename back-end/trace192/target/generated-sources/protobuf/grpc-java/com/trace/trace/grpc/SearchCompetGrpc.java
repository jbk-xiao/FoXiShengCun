package com.trace.trace.grpc;

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
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: SearchCompet.proto")
public final class SearchCompetGrpc {

  private SearchCompetGrpc() {}

  public static final String SERVICE_NAME = "com.trace.trace.grpc.SearchCompet";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.trace.trace.grpc.CompetRequest,
      com.trace.trace.grpc.CompetResponse> getSearchCompetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchCompet",
      requestType = com.trace.trace.grpc.CompetRequest.class,
      responseType = com.trace.trace.grpc.CompetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trace.trace.grpc.CompetRequest,
      com.trace.trace.grpc.CompetResponse> getSearchCompetMethod() {
    io.grpc.MethodDescriptor<com.trace.trace.grpc.CompetRequest, com.trace.trace.grpc.CompetResponse> getSearchCompetMethod;
    if ((getSearchCompetMethod = SearchCompetGrpc.getSearchCompetMethod) == null) {
      synchronized (SearchCompetGrpc.class) {
        if ((getSearchCompetMethod = SearchCompetGrpc.getSearchCompetMethod) == null) {
          SearchCompetGrpc.getSearchCompetMethod = getSearchCompetMethod =
              io.grpc.MethodDescriptor.<com.trace.trace.grpc.CompetRequest, com.trace.trace.grpc.CompetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "searchCompet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trace.trace.grpc.CompetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trace.trace.grpc.CompetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SearchCompetMethodDescriptorSupplier("searchCompet"))
              .build();
        }
      }
    }
    return getSearchCompetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SearchCompetStub newStub(io.grpc.Channel channel) {
    return new SearchCompetStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SearchCompetBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SearchCompetBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SearchCompetFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SearchCompetFutureStub(channel);
  }

  /**
   */
  public static abstract class SearchCompetImplBase implements io.grpc.BindableService {

    /**
     */
    public void searchCompet(com.trace.trace.grpc.CompetRequest request,
        io.grpc.stub.StreamObserver<com.trace.trace.grpc.CompetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchCompetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchCompetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.trace.trace.grpc.CompetRequest,
                com.trace.trace.grpc.CompetResponse>(
                  this, METHODID_SEARCH_COMPET)))
          .build();
    }
  }

  /**
   */
  public static final class SearchCompetStub extends io.grpc.stub.AbstractStub<SearchCompetStub> {
    private SearchCompetStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchCompetStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchCompetStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchCompetStub(channel, callOptions);
    }

    /**
     */
    public void searchCompet(com.trace.trace.grpc.CompetRequest request,
        io.grpc.stub.StreamObserver<com.trace.trace.grpc.CompetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchCompetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SearchCompetBlockingStub extends io.grpc.stub.AbstractStub<SearchCompetBlockingStub> {
    private SearchCompetBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchCompetBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchCompetBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchCompetBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.trace.trace.grpc.CompetResponse searchCompet(com.trace.trace.grpc.CompetRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchCompetMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SearchCompetFutureStub extends io.grpc.stub.AbstractStub<SearchCompetFutureStub> {
    private SearchCompetFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchCompetFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchCompetFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchCompetFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trace.trace.grpc.CompetResponse> searchCompet(
        com.trace.trace.grpc.CompetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchCompetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_COMPET = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SearchCompetImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SearchCompetImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_COMPET:
          serviceImpl.searchCompet((com.trace.trace.grpc.CompetRequest) request,
              (io.grpc.stub.StreamObserver<com.trace.trace.grpc.CompetResponse>) responseObserver);
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

  private static abstract class SearchCompetBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SearchCompetBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.trace.trace.grpc.SearchCompetOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SearchCompet");
    }
  }

  private static final class SearchCompetFileDescriptorSupplier
      extends SearchCompetBaseDescriptorSupplier {
    SearchCompetFileDescriptorSupplier() {}
  }

  private static final class SearchCompetMethodDescriptorSupplier
      extends SearchCompetBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SearchCompetMethodDescriptorSupplier(String methodName) {
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
      synchronized (SearchCompetGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SearchCompetFileDescriptorSupplier())
              .addMethod(getSearchCompetMethod())
              .build();
        }
      }
    }
    return result;
  }
}

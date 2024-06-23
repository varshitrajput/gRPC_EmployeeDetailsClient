package proto;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: employeeDetails.proto")
public final class EmployeeDetailsGrpc {

  private EmployeeDetailsGrpc() {}

  public static final String SERVICE_NAME = "EmployeeDetails";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.EmployeeDetailsOuterClass.EmployeeID,
      proto.EmployeeDetailsOuterClass.Employee> getGetEmployeeDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmployeeDetails",
      requestType = proto.EmployeeDetailsOuterClass.EmployeeID.class,
      responseType = proto.EmployeeDetailsOuterClass.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.EmployeeDetailsOuterClass.EmployeeID,
      proto.EmployeeDetailsOuterClass.Employee> getGetEmployeeDetailsMethod() {
    io.grpc.MethodDescriptor<proto.EmployeeDetailsOuterClass.EmployeeID, proto.EmployeeDetailsOuterClass.Employee> getGetEmployeeDetailsMethod;
    if ((getGetEmployeeDetailsMethod = EmployeeDetailsGrpc.getGetEmployeeDetailsMethod) == null) {
      synchronized (EmployeeDetailsGrpc.class) {
        if ((getGetEmployeeDetailsMethod = EmployeeDetailsGrpc.getGetEmployeeDetailsMethod) == null) {
          EmployeeDetailsGrpc.getGetEmployeeDetailsMethod = getGetEmployeeDetailsMethod = 
              io.grpc.MethodDescriptor.<proto.EmployeeDetailsOuterClass.EmployeeID, proto.EmployeeDetailsOuterClass.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EmployeeDetails", "GetEmployeeDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.EmployeeDetailsOuterClass.EmployeeID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.EmployeeDetailsOuterClass.Employee.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeDetailsMethodDescriptorSupplier("GetEmployeeDetails"))
                  .build();
          }
        }
     }
     return getGetEmployeeDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.EmployeeDetailsOuterClass.Employee,
      proto.EmployeeDetailsOuterClass.EmployeeID> getSetEmployeeDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetEmployeeDetails",
      requestType = proto.EmployeeDetailsOuterClass.Employee.class,
      responseType = proto.EmployeeDetailsOuterClass.EmployeeID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.EmployeeDetailsOuterClass.Employee,
      proto.EmployeeDetailsOuterClass.EmployeeID> getSetEmployeeDetailsMethod() {
    io.grpc.MethodDescriptor<proto.EmployeeDetailsOuterClass.Employee, proto.EmployeeDetailsOuterClass.EmployeeID> getSetEmployeeDetailsMethod;
    if ((getSetEmployeeDetailsMethod = EmployeeDetailsGrpc.getSetEmployeeDetailsMethod) == null) {
      synchronized (EmployeeDetailsGrpc.class) {
        if ((getSetEmployeeDetailsMethod = EmployeeDetailsGrpc.getSetEmployeeDetailsMethod) == null) {
          EmployeeDetailsGrpc.getSetEmployeeDetailsMethod = getSetEmployeeDetailsMethod = 
              io.grpc.MethodDescriptor.<proto.EmployeeDetailsOuterClass.Employee, proto.EmployeeDetailsOuterClass.EmployeeID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EmployeeDetails", "SetEmployeeDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.EmployeeDetailsOuterClass.Employee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.EmployeeDetailsOuterClass.EmployeeID.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeDetailsMethodDescriptorSupplier("SetEmployeeDetails"))
                  .build();
          }
        }
     }
     return getSetEmployeeDetailsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeDetailsStub newStub(io.grpc.Channel channel) {
    return new EmployeeDetailsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeDetailsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EmployeeDetailsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployeeDetailsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EmployeeDetailsFutureStub(channel);
  }

  /**
   */
  public static abstract class EmployeeDetailsImplBase implements io.grpc.BindableService {

    /**
     */
    public void getEmployeeDetails(proto.EmployeeDetailsOuterClass.EmployeeID request,
        io.grpc.stub.StreamObserver<proto.EmployeeDetailsOuterClass.Employee> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEmployeeDetailsMethod(), responseObserver);
    }

    /**
     */
    public void setEmployeeDetails(proto.EmployeeDetailsOuterClass.Employee request,
        io.grpc.stub.StreamObserver<proto.EmployeeDetailsOuterClass.EmployeeID> responseObserver) {
      asyncUnimplementedUnaryCall(getSetEmployeeDetailsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetEmployeeDetailsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.EmployeeDetailsOuterClass.EmployeeID,
                proto.EmployeeDetailsOuterClass.Employee>(
                  this, METHODID_GET_EMPLOYEE_DETAILS)))
          .addMethod(
            getSetEmployeeDetailsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.EmployeeDetailsOuterClass.Employee,
                proto.EmployeeDetailsOuterClass.EmployeeID>(
                  this, METHODID_SET_EMPLOYEE_DETAILS)))
          .build();
    }
  }

  /**
   */
  public static final class EmployeeDetailsStub extends io.grpc.stub.AbstractStub<EmployeeDetailsStub> {
    private EmployeeDetailsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeDetailsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeDetailsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeDetailsStub(channel, callOptions);
    }

    /**
     */
    public void getEmployeeDetails(proto.EmployeeDetailsOuterClass.EmployeeID request,
        io.grpc.stub.StreamObserver<proto.EmployeeDetailsOuterClass.Employee> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEmployeeDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setEmployeeDetails(proto.EmployeeDetailsOuterClass.Employee request,
        io.grpc.stub.StreamObserver<proto.EmployeeDetailsOuterClass.EmployeeID> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetEmployeeDetailsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EmployeeDetailsBlockingStub extends io.grpc.stub.AbstractStub<EmployeeDetailsBlockingStub> {
    private EmployeeDetailsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeDetailsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeDetailsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeDetailsBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.EmployeeDetailsOuterClass.Employee getEmployeeDetails(proto.EmployeeDetailsOuterClass.EmployeeID request) {
      return blockingUnaryCall(
          getChannel(), getGetEmployeeDetailsMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.EmployeeDetailsOuterClass.EmployeeID setEmployeeDetails(proto.EmployeeDetailsOuterClass.Employee request) {
      return blockingUnaryCall(
          getChannel(), getSetEmployeeDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EmployeeDetailsFutureStub extends io.grpc.stub.AbstractStub<EmployeeDetailsFutureStub> {
    private EmployeeDetailsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeDetailsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeDetailsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeDetailsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.EmployeeDetailsOuterClass.Employee> getEmployeeDetails(
        proto.EmployeeDetailsOuterClass.EmployeeID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEmployeeDetailsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.EmployeeDetailsOuterClass.EmployeeID> setEmployeeDetails(
        proto.EmployeeDetailsOuterClass.Employee request) {
      return futureUnaryCall(
          getChannel().newCall(getSetEmployeeDetailsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EMPLOYEE_DETAILS = 0;
  private static final int METHODID_SET_EMPLOYEE_DETAILS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmployeeDetailsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmployeeDetailsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EMPLOYEE_DETAILS:
          serviceImpl.getEmployeeDetails((proto.EmployeeDetailsOuterClass.EmployeeID) request,
              (io.grpc.stub.StreamObserver<proto.EmployeeDetailsOuterClass.Employee>) responseObserver);
          break;
        case METHODID_SET_EMPLOYEE_DETAILS:
          serviceImpl.setEmployeeDetails((proto.EmployeeDetailsOuterClass.Employee) request,
              (io.grpc.stub.StreamObserver<proto.EmployeeDetailsOuterClass.EmployeeID>) responseObserver);
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

  private static abstract class EmployeeDetailsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployeeDetailsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.EmployeeDetailsOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmployeeDetails");
    }
  }

  private static final class EmployeeDetailsFileDescriptorSupplier
      extends EmployeeDetailsBaseDescriptorSupplier {
    EmployeeDetailsFileDescriptorSupplier() {}
  }

  private static final class EmployeeDetailsMethodDescriptorSupplier
      extends EmployeeDetailsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmployeeDetailsMethodDescriptorSupplier(String methodName) {
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
      synchronized (EmployeeDetailsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployeeDetailsFileDescriptorSupplier())
              .addMethod(getGetEmployeeDetailsMethod())
              .addMethod(getSetEmployeeDetailsMethod())
              .build();
        }
      }
    }
    return result;
  }
}

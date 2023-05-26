package org.sid.registrationservice.web.grpc.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: owner.proto")
public final class OwnerServiceGrpc {

  private OwnerServiceGrpc() {}

  public static final String SERVICE_NAME = "OwnerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<OwnerOuterClass.Empty,
      OwnerOuterClass.OwnerList> getGetOwnersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOwners",
      requestType = OwnerOuterClass.Empty.class,
      responseType = OwnerOuterClass.OwnerList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<OwnerOuterClass.Empty,
      OwnerOuterClass.OwnerList> getGetOwnersMethod() {
    io.grpc.MethodDescriptor<OwnerOuterClass.Empty, OwnerOuterClass.OwnerList> getGetOwnersMethod;
    if ((getGetOwnersMethod = OwnerServiceGrpc.getGetOwnersMethod) == null) {
      synchronized (OwnerServiceGrpc.class) {
        if ((getGetOwnersMethod = OwnerServiceGrpc.getGetOwnersMethod) == null) {
          OwnerServiceGrpc.getGetOwnersMethod = getGetOwnersMethod = 
              io.grpc.MethodDescriptor.<OwnerOuterClass.Empty, OwnerOuterClass.OwnerList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OwnerService", "getOwners"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OwnerOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OwnerOuterClass.OwnerList.getDefaultInstance()))
                  .setSchemaDescriptor(new OwnerServiceMethodDescriptorSupplier("getOwners"))
                  .build();
          }
        }
     }
     return getGetOwnersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<OwnerOuterClass.OwnerId,
      OwnerOuterClass.Owner> getGetOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOwner",
      requestType = OwnerOuterClass.OwnerId.class,
      responseType = OwnerOuterClass.Owner.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<OwnerOuterClass.OwnerId,
      OwnerOuterClass.Owner> getGetOwnerMethod() {
    io.grpc.MethodDescriptor<OwnerOuterClass.OwnerId, OwnerOuterClass.Owner> getGetOwnerMethod;
    if ((getGetOwnerMethod = OwnerServiceGrpc.getGetOwnerMethod) == null) {
      synchronized (OwnerServiceGrpc.class) {
        if ((getGetOwnerMethod = OwnerServiceGrpc.getGetOwnerMethod) == null) {
          OwnerServiceGrpc.getGetOwnerMethod = getGetOwnerMethod = 
              io.grpc.MethodDescriptor.<OwnerOuterClass.OwnerId, OwnerOuterClass.Owner>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OwnerService", "getOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OwnerOuterClass.OwnerId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OwnerOuterClass.Owner.getDefaultInstance()))
                  .setSchemaDescriptor(new OwnerServiceMethodDescriptorSupplier("getOwner"))
                  .build();
          }
        }
     }
     return getGetOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<OwnerOuterClass.OwnerRequest,
      OwnerOuterClass.Owner> getSaveOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveOwner",
      requestType = OwnerOuterClass.OwnerRequest.class,
      responseType = OwnerOuterClass.Owner.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<OwnerOuterClass.OwnerRequest,
      OwnerOuterClass.Owner> getSaveOwnerMethod() {
    io.grpc.MethodDescriptor<OwnerOuterClass.OwnerRequest, OwnerOuterClass.Owner> getSaveOwnerMethod;
    if ((getSaveOwnerMethod = OwnerServiceGrpc.getSaveOwnerMethod) == null) {
      synchronized (OwnerServiceGrpc.class) {
        if ((getSaveOwnerMethod = OwnerServiceGrpc.getSaveOwnerMethod) == null) {
          OwnerServiceGrpc.getSaveOwnerMethod = getSaveOwnerMethod = 
              io.grpc.MethodDescriptor.<OwnerOuterClass.OwnerRequest, OwnerOuterClass.Owner>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OwnerService", "saveOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OwnerOuterClass.OwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OwnerOuterClass.Owner.getDefaultInstance()))
                  .setSchemaDescriptor(new OwnerServiceMethodDescriptorSupplier("saveOwner"))
                  .build();
          }
        }
     }
     return getSaveOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<OwnerOuterClass.OwnerUpdateRequest,
      OwnerOuterClass.Owner> getUpdateOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateOwner",
      requestType = OwnerOuterClass.OwnerUpdateRequest.class,
      responseType = OwnerOuterClass.Owner.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<OwnerOuterClass.OwnerUpdateRequest,
      OwnerOuterClass.Owner> getUpdateOwnerMethod() {
    io.grpc.MethodDescriptor<OwnerOuterClass.OwnerUpdateRequest, OwnerOuterClass.Owner> getUpdateOwnerMethod;
    if ((getUpdateOwnerMethod = OwnerServiceGrpc.getUpdateOwnerMethod) == null) {
      synchronized (OwnerServiceGrpc.class) {
        if ((getUpdateOwnerMethod = OwnerServiceGrpc.getUpdateOwnerMethod) == null) {
          OwnerServiceGrpc.getUpdateOwnerMethod = getUpdateOwnerMethod = 
              io.grpc.MethodDescriptor.<OwnerOuterClass.OwnerUpdateRequest, OwnerOuterClass.Owner>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OwnerService", "updateOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OwnerOuterClass.OwnerUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OwnerOuterClass.Owner.getDefaultInstance()))
                  .setSchemaDescriptor(new OwnerServiceMethodDescriptorSupplier("updateOwner"))
                  .build();
          }
        }
     }
     return getUpdateOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<OwnerOuterClass.OwnerId,
      OwnerOuterClass.Empty> getDeleteOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteOwner",
      requestType = OwnerOuterClass.OwnerId.class,
      responseType = OwnerOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<OwnerOuterClass.OwnerId,
      OwnerOuterClass.Empty> getDeleteOwnerMethod() {
    io.grpc.MethodDescriptor<OwnerOuterClass.OwnerId, OwnerOuterClass.Empty> getDeleteOwnerMethod;
    if ((getDeleteOwnerMethod = OwnerServiceGrpc.getDeleteOwnerMethod) == null) {
      synchronized (OwnerServiceGrpc.class) {
        if ((getDeleteOwnerMethod = OwnerServiceGrpc.getDeleteOwnerMethod) == null) {
          OwnerServiceGrpc.getDeleteOwnerMethod = getDeleteOwnerMethod = 
              io.grpc.MethodDescriptor.<OwnerOuterClass.OwnerId, OwnerOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OwnerService", "deleteOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OwnerOuterClass.OwnerId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OwnerOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new OwnerServiceMethodDescriptorSupplier("deleteOwner"))
                  .build();
          }
        }
     }
     return getDeleteOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<OwnerOuterClass.Empty,
      OwnerOuterClass.VehiculeList> getGetVehiculesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVehicules",
      requestType = OwnerOuterClass.Empty.class,
      responseType = OwnerOuterClass.VehiculeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<OwnerOuterClass.Empty,
      OwnerOuterClass.VehiculeList> getGetVehiculesMethod() {
    io.grpc.MethodDescriptor<OwnerOuterClass.Empty, OwnerOuterClass.VehiculeList> getGetVehiculesMethod;
    if ((getGetVehiculesMethod = OwnerServiceGrpc.getGetVehiculesMethod) == null) {
      synchronized (OwnerServiceGrpc.class) {
        if ((getGetVehiculesMethod = OwnerServiceGrpc.getGetVehiculesMethod) == null) {
          OwnerServiceGrpc.getGetVehiculesMethod = getGetVehiculesMethod = 
              io.grpc.MethodDescriptor.<OwnerOuterClass.Empty, OwnerOuterClass.VehiculeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OwnerService", "getVehicules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OwnerOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OwnerOuterClass.VehiculeList.getDefaultInstance()))
                  .setSchemaDescriptor(new OwnerServiceMethodDescriptorSupplier("getVehicules"))
                  .build();
          }
        }
     }
     return getGetVehiculesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<OwnerOuterClass.VehicleId,
      OwnerOuterClass.Vehicule> getGetVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVehicule",
      requestType = OwnerOuterClass.VehicleId.class,
      responseType = OwnerOuterClass.Vehicule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<OwnerOuterClass.VehicleId,
      OwnerOuterClass.Vehicule> getGetVehiculeMethod() {
    io.grpc.MethodDescriptor<OwnerOuterClass.VehicleId, OwnerOuterClass.Vehicule> getGetVehiculeMethod;
    if ((getGetVehiculeMethod = OwnerServiceGrpc.getGetVehiculeMethod) == null) {
      synchronized (OwnerServiceGrpc.class) {
        if ((getGetVehiculeMethod = OwnerServiceGrpc.getGetVehiculeMethod) == null) {
          OwnerServiceGrpc.getGetVehiculeMethod = getGetVehiculeMethod = 
              io.grpc.MethodDescriptor.<OwnerOuterClass.VehicleId, OwnerOuterClass.Vehicule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OwnerService", "getVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OwnerOuterClass.VehicleId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OwnerOuterClass.Vehicule.getDefaultInstance()))
                  .setSchemaDescriptor(new OwnerServiceMethodDescriptorSupplier("getVehicule"))
                  .build();
          }
        }
     }
     return getGetVehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<OwnerOuterClass.VehiculeRequest,
      OwnerOuterClass.Vehicule> getSaveVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveVehicule",
      requestType = OwnerOuterClass.VehiculeRequest.class,
      responseType = OwnerOuterClass.Vehicule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<OwnerOuterClass.VehiculeRequest,
      OwnerOuterClass.Vehicule> getSaveVehiculeMethod() {
    io.grpc.MethodDescriptor<OwnerOuterClass.VehiculeRequest, OwnerOuterClass.Vehicule> getSaveVehiculeMethod;
    if ((getSaveVehiculeMethod = OwnerServiceGrpc.getSaveVehiculeMethod) == null) {
      synchronized (OwnerServiceGrpc.class) {
        if ((getSaveVehiculeMethod = OwnerServiceGrpc.getSaveVehiculeMethod) == null) {
          OwnerServiceGrpc.getSaveVehiculeMethod = getSaveVehiculeMethod = 
              io.grpc.MethodDescriptor.<OwnerOuterClass.VehiculeRequest, OwnerOuterClass.Vehicule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OwnerService", "saveVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OwnerOuterClass.VehiculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OwnerOuterClass.Vehicule.getDefaultInstance()))
                  .setSchemaDescriptor(new OwnerServiceMethodDescriptorSupplier("saveVehicule"))
                  .build();
          }
        }
     }
     return getSaveVehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<OwnerOuterClass.VehiculeUpdateRequest,
      OwnerOuterClass.Vehicule> getUpdateVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateVehicule",
      requestType = OwnerOuterClass.VehiculeUpdateRequest.class,
      responseType = OwnerOuterClass.Vehicule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<OwnerOuterClass.VehiculeUpdateRequest,
      OwnerOuterClass.Vehicule> getUpdateVehiculeMethod() {
    io.grpc.MethodDescriptor<OwnerOuterClass.VehiculeUpdateRequest, OwnerOuterClass.Vehicule> getUpdateVehiculeMethod;
    if ((getUpdateVehiculeMethod = OwnerServiceGrpc.getUpdateVehiculeMethod) == null) {
      synchronized (OwnerServiceGrpc.class) {
        if ((getUpdateVehiculeMethod = OwnerServiceGrpc.getUpdateVehiculeMethod) == null) {
          OwnerServiceGrpc.getUpdateVehiculeMethod = getUpdateVehiculeMethod = 
              io.grpc.MethodDescriptor.<OwnerOuterClass.VehiculeUpdateRequest, OwnerOuterClass.Vehicule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OwnerService", "updateVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OwnerOuterClass.VehiculeUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OwnerOuterClass.Vehicule.getDefaultInstance()))
                  .setSchemaDescriptor(new OwnerServiceMethodDescriptorSupplier("updateVehicule"))
                  .build();
          }
        }
     }
     return getUpdateVehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<OwnerOuterClass.VehicleId,
      OwnerOuterClass.Empty> getDeleteVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteVehicule",
      requestType = OwnerOuterClass.VehicleId.class,
      responseType = OwnerOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<OwnerOuterClass.VehicleId,
      OwnerOuterClass.Empty> getDeleteVehiculeMethod() {
    io.grpc.MethodDescriptor<OwnerOuterClass.VehicleId, OwnerOuterClass.Empty> getDeleteVehiculeMethod;
    if ((getDeleteVehiculeMethod = OwnerServiceGrpc.getDeleteVehiculeMethod) == null) {
      synchronized (OwnerServiceGrpc.class) {
        if ((getDeleteVehiculeMethod = OwnerServiceGrpc.getDeleteVehiculeMethod) == null) {
          OwnerServiceGrpc.getDeleteVehiculeMethod = getDeleteVehiculeMethod = 
              io.grpc.MethodDescriptor.<OwnerOuterClass.VehicleId, OwnerOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OwnerService", "deleteVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OwnerOuterClass.VehicleId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OwnerOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new OwnerServiceMethodDescriptorSupplier("deleteVehicule"))
                  .build();
          }
        }
     }
     return getDeleteVehiculeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OwnerServiceStub newStub(io.grpc.Channel channel) {
    return new OwnerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OwnerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OwnerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OwnerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OwnerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class OwnerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Owner operations
     * </pre>
     */
    public void getOwners(OwnerOuterClass.Empty request,
                          io.grpc.stub.StreamObserver<OwnerOuterClass.OwnerList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOwnersMethod(), responseObserver);
    }

    /**
     */
    public void getOwner(OwnerOuterClass.OwnerId request,
                         io.grpc.stub.StreamObserver<OwnerOuterClass.Owner> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOwnerMethod(), responseObserver);
    }

    /**
     */
    public void saveOwner(OwnerOuterClass.OwnerRequest request,
                          io.grpc.stub.StreamObserver<OwnerOuterClass.Owner> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveOwnerMethod(), responseObserver);
    }

    /**
     */
    public void updateOwner(OwnerOuterClass.OwnerUpdateRequest request,
                            io.grpc.stub.StreamObserver<OwnerOuterClass.Owner> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateOwnerMethod(), responseObserver);
    }

    /**
     */
    public void deleteOwner(OwnerOuterClass.OwnerId request,
                            io.grpc.stub.StreamObserver<OwnerOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Vehicule operations
     * </pre>
     */
    public void getVehicules(OwnerOuterClass.Empty request,
                             io.grpc.stub.StreamObserver<OwnerOuterClass.VehiculeList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehiculesMethod(), responseObserver);
    }

    /**
     */
    public void getVehicule(OwnerOuterClass.VehicleId request,
                            io.grpc.stub.StreamObserver<OwnerOuterClass.Vehicule> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehiculeMethod(), responseObserver);
    }

    /**
     */
    public void saveVehicule(OwnerOuterClass.VehiculeRequest request,
                             io.grpc.stub.StreamObserver<OwnerOuterClass.Vehicule> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveVehiculeMethod(), responseObserver);
    }

    /**
     */
    public void updateVehicule(OwnerOuterClass.VehiculeUpdateRequest request,
                               io.grpc.stub.StreamObserver<OwnerOuterClass.Vehicule> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateVehiculeMethod(), responseObserver);
    }

    /**
     */
    public void deleteVehicule(OwnerOuterClass.VehicleId request,
                               io.grpc.stub.StreamObserver<OwnerOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteVehiculeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetOwnersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                OwnerOuterClass.Empty,
                OwnerOuterClass.OwnerList>(
                  this, METHODID_GET_OWNERS)))
          .addMethod(
            getGetOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                OwnerOuterClass.OwnerId,
                OwnerOuterClass.Owner>(
                  this, METHODID_GET_OWNER)))
          .addMethod(
            getSaveOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                OwnerOuterClass.OwnerRequest,
                OwnerOuterClass.Owner>(
                  this, METHODID_SAVE_OWNER)))
          .addMethod(
            getUpdateOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                OwnerOuterClass.OwnerUpdateRequest,
                OwnerOuterClass.Owner>(
                  this, METHODID_UPDATE_OWNER)))
          .addMethod(
            getDeleteOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                OwnerOuterClass.OwnerId,
                OwnerOuterClass.Empty>(
                  this, METHODID_DELETE_OWNER)))
          .addMethod(
            getGetVehiculesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                OwnerOuterClass.Empty,
                OwnerOuterClass.VehiculeList>(
                  this, METHODID_GET_VEHICULES)))
          .addMethod(
            getGetVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                OwnerOuterClass.VehicleId,
                OwnerOuterClass.Vehicule>(
                  this, METHODID_GET_VEHICULE)))
          .addMethod(
            getSaveVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                OwnerOuterClass.VehiculeRequest,
                OwnerOuterClass.Vehicule>(
                  this, METHODID_SAVE_VEHICULE)))
          .addMethod(
            getUpdateVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                OwnerOuterClass.VehiculeUpdateRequest,
                OwnerOuterClass.Vehicule>(
                  this, METHODID_UPDATE_VEHICULE)))
          .addMethod(
            getDeleteVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                OwnerOuterClass.VehicleId,
                OwnerOuterClass.Empty>(
                  this, METHODID_DELETE_VEHICULE)))
          .build();
    }
  }

  /**
   */
  public static final class OwnerServiceStub extends io.grpc.stub.AbstractStub<OwnerServiceStub> {
    private OwnerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OwnerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OwnerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OwnerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Owner operations
     * </pre>
     */
    public void getOwners(OwnerOuterClass.Empty request,
                          io.grpc.stub.StreamObserver<OwnerOuterClass.OwnerList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOwnersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOwner(OwnerOuterClass.OwnerId request,
                         io.grpc.stub.StreamObserver<OwnerOuterClass.Owner> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveOwner(OwnerOuterClass.OwnerRequest request,
                          io.grpc.stub.StreamObserver<OwnerOuterClass.Owner> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOwner(OwnerOuterClass.OwnerUpdateRequest request,
                            io.grpc.stub.StreamObserver<OwnerOuterClass.Owner> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteOwner(OwnerOuterClass.OwnerId request,
                            io.grpc.stub.StreamObserver<OwnerOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Vehicule operations
     * </pre>
     */
    public void getVehicules(OwnerOuterClass.Empty request,
                             io.grpc.stub.StreamObserver<OwnerOuterClass.VehiculeList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehiculesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVehicule(OwnerOuterClass.VehicleId request,
                            io.grpc.stub.StreamObserver<OwnerOuterClass.Vehicule> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveVehicule(OwnerOuterClass.VehiculeRequest request,
                             io.grpc.stub.StreamObserver<OwnerOuterClass.Vehicule> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveVehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateVehicule(OwnerOuterClass.VehiculeUpdateRequest request,
                               io.grpc.stub.StreamObserver<OwnerOuterClass.Vehicule> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateVehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteVehicule(OwnerOuterClass.VehicleId request,
                               io.grpc.stub.StreamObserver<OwnerOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteVehiculeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OwnerServiceBlockingStub extends io.grpc.stub.AbstractStub<OwnerServiceBlockingStub> {
    private OwnerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OwnerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OwnerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OwnerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Owner operations
     * </pre>
     */
    public OwnerOuterClass.OwnerList getOwners(OwnerOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetOwnersMethod(), getCallOptions(), request);
    }

    /**
     */
    public OwnerOuterClass.Owner getOwner(OwnerOuterClass.OwnerId request) {
      return blockingUnaryCall(
          getChannel(), getGetOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public OwnerOuterClass.Owner saveOwner(OwnerOuterClass.OwnerRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public OwnerOuterClass.Owner updateOwner(OwnerOuterClass.OwnerUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public OwnerOuterClass.Empty deleteOwner(OwnerOuterClass.OwnerId request) {
      return blockingUnaryCall(
          getChannel(), getDeleteOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Vehicule operations
     * </pre>
     */
    public OwnerOuterClass.VehiculeList getVehicules(OwnerOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetVehiculesMethod(), getCallOptions(), request);
    }

    /**
     */
    public OwnerOuterClass.Vehicule getVehicule(OwnerOuterClass.VehicleId request) {
      return blockingUnaryCall(
          getChannel(), getGetVehiculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public OwnerOuterClass.Vehicule saveVehicule(OwnerOuterClass.VehiculeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveVehiculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public OwnerOuterClass.Vehicule updateVehicule(OwnerOuterClass.VehiculeUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateVehiculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public OwnerOuterClass.Empty deleteVehicule(OwnerOuterClass.VehicleId request) {
      return blockingUnaryCall(
          getChannel(), getDeleteVehiculeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OwnerServiceFutureStub extends io.grpc.stub.AbstractStub<OwnerServiceFutureStub> {
    private OwnerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OwnerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OwnerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OwnerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Owner operations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<OwnerOuterClass.OwnerList> getOwners(
        OwnerOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOwnersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<OwnerOuterClass.Owner> getOwner(
        OwnerOuterClass.OwnerId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<OwnerOuterClass.Owner> saveOwner(
        OwnerOuterClass.OwnerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<OwnerOuterClass.Owner> updateOwner(
        OwnerOuterClass.OwnerUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<OwnerOuterClass.Empty> deleteOwner(
        OwnerOuterClass.OwnerId request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Vehicule operations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<OwnerOuterClass.VehiculeList> getVehicules(
        OwnerOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehiculesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<OwnerOuterClass.Vehicule> getVehicule(
        OwnerOuterClass.VehicleId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehiculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<OwnerOuterClass.Vehicule> saveVehicule(
        OwnerOuterClass.VehiculeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveVehiculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<OwnerOuterClass.Vehicule> updateVehicule(
        OwnerOuterClass.VehiculeUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateVehiculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<OwnerOuterClass.Empty> deleteVehicule(
        OwnerOuterClass.VehicleId request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteVehiculeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_OWNERS = 0;
  private static final int METHODID_GET_OWNER = 1;
  private static final int METHODID_SAVE_OWNER = 2;
  private static final int METHODID_UPDATE_OWNER = 3;
  private static final int METHODID_DELETE_OWNER = 4;
  private static final int METHODID_GET_VEHICULES = 5;
  private static final int METHODID_GET_VEHICULE = 6;
  private static final int METHODID_SAVE_VEHICULE = 7;
  private static final int METHODID_UPDATE_VEHICULE = 8;
  private static final int METHODID_DELETE_VEHICULE = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OwnerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OwnerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_OWNERS:
          serviceImpl.getOwners((OwnerOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<OwnerOuterClass.OwnerList>) responseObserver);
          break;
        case METHODID_GET_OWNER:
          serviceImpl.getOwner((OwnerOuterClass.OwnerId) request,
              (io.grpc.stub.StreamObserver<OwnerOuterClass.Owner>) responseObserver);
          break;
        case METHODID_SAVE_OWNER:
          serviceImpl.saveOwner((OwnerOuterClass.OwnerRequest) request,
              (io.grpc.stub.StreamObserver<OwnerOuterClass.Owner>) responseObserver);
          break;
        case METHODID_UPDATE_OWNER:
          serviceImpl.updateOwner((OwnerOuterClass.OwnerUpdateRequest) request,
              (io.grpc.stub.StreamObserver<OwnerOuterClass.Owner>) responseObserver);
          break;
        case METHODID_DELETE_OWNER:
          serviceImpl.deleteOwner((OwnerOuterClass.OwnerId) request,
              (io.grpc.stub.StreamObserver<OwnerOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GET_VEHICULES:
          serviceImpl.getVehicules((OwnerOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<OwnerOuterClass.VehiculeList>) responseObserver);
          break;
        case METHODID_GET_VEHICULE:
          serviceImpl.getVehicule((OwnerOuterClass.VehicleId) request,
              (io.grpc.stub.StreamObserver<OwnerOuterClass.Vehicule>) responseObserver);
          break;
        case METHODID_SAVE_VEHICULE:
          serviceImpl.saveVehicule((OwnerOuterClass.VehiculeRequest) request,
              (io.grpc.stub.StreamObserver<OwnerOuterClass.Vehicule>) responseObserver);
          break;
        case METHODID_UPDATE_VEHICULE:
          serviceImpl.updateVehicule((OwnerOuterClass.VehiculeUpdateRequest) request,
              (io.grpc.stub.StreamObserver<OwnerOuterClass.Vehicule>) responseObserver);
          break;
        case METHODID_DELETE_VEHICULE:
          serviceImpl.deleteVehicule((OwnerOuterClass.VehicleId) request,
              (io.grpc.stub.StreamObserver<OwnerOuterClass.Empty>) responseObserver);
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

  private static abstract class OwnerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OwnerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return OwnerOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OwnerService");
    }
  }

  private static final class OwnerServiceFileDescriptorSupplier
      extends OwnerServiceBaseDescriptorSupplier {
    OwnerServiceFileDescriptorSupplier() {}
  }

  private static final class OwnerServiceMethodDescriptorSupplier
      extends OwnerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OwnerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (OwnerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OwnerServiceFileDescriptorSupplier())
              .addMethod(getGetOwnersMethod())
              .addMethod(getGetOwnerMethod())
              .addMethod(getSaveOwnerMethod())
              .addMethod(getUpdateOwnerMethod())
              .addMethod(getDeleteOwnerMethod())
              .addMethod(getGetVehiculesMethod())
              .addMethod(getGetVehiculeMethod())
              .addMethod(getSaveVehiculeMethod())
              .addMethod(getUpdateVehiculeMethod())
              .addMethod(getDeleteVehiculeMethod())
              .build();
        }
      }
    }
    return result;
  }
}

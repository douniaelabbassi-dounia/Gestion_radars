package org.sid.registrationservice.web.grpc;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import org.sid.registrationservice.entities.Proprietaire;
import org.sid.registrationservice.entities.Vehicule;
import org.sid.registrationservice.repositories.OwnerRepository;
import org.sid.registrationservice.repositories.VehicleRepository;
import org.sid.registrationservice.web.grpc.stubs.OwnerOuterClass;
import org.sid.registrationservice.web.grpc.stubs.OwnerServiceGrpc;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@AllArgsConstructor
public class OwnerGrpcService extends OwnerServiceGrpc.OwnerServiceImplBase {
    private final OwnerRepository ownerRepository;
    private final VehicleRepository vehicleRepository;

    @Override
    public void getOwners(OwnerOuterClass.Empty request, StreamObserver<OwnerOuterClass.OwnerList> responseObserver) {
        Iterable<Proprietaire> owners = ownerRepository.findAll();
        OwnerOuterClass.OwnerList.Builder responseBuilder = OwnerOuterClass.OwnerList.newBuilder();
        for (Proprietaire owner : owners) {
            OwnerOuterClass.Owner ownerResponse = OwnerOuterClass.Owner.newBuilder()
                    .setId(owner.getId().intValue())
                    .setName(owner.getName())
                    .setEmail(owner.getEmail())
                    .setBirthDate(owner.getBirthDate())
                    .build();
            responseBuilder.addOwners(ownerResponse);
        }
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getOwner(OwnerOuterClass.OwnerId request, StreamObserver<OwnerOuterClass.Owner> responseObserver) {
        Long ownerId = (long)request.getId();
        if(ownerRepository.existsById(ownerId)){
            Proprietaire owner = ownerRepository.findById(ownerId).orElse(null);
            OwnerOuterClass.Owner ownerResponse = OwnerOuterClass.Owner.newBuilder()
                    .setId(owner.getId().intValue())
                    .setName(owner.getName())
                    .setEmail(owner.getEmail())
                    .setBirthDate(owner.getBirthDate())
                    .build();
            responseObserver.onNext(ownerResponse);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void saveOwner(OwnerOuterClass.OwnerRequest request, StreamObserver<OwnerOuterClass.Owner> responseObserver) {
        Proprietaire owner = Proprietaire.builder()
                .id(null)
                .email(request.getEmail())
                .name(request.getName())
                .birthDate(request.getBirthDate())
                .build();
        owner = ownerRepository.save(owner);
        responseObserver.onNext(OwnerOuterClass.Owner.newBuilder()
                .setId(owner.getId().intValue())
                .setName(owner.getName())
                .setEmail(owner.getEmail())
                .setBirthDate(owner.getBirthDate())
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void updateOwner(OwnerOuterClass.OwnerUpdateRequest request, StreamObserver<OwnerOuterClass.Owner> responseObserver) {
        Long ownerId = (long)request.getId();
        if(ownerRepository.existsById(ownerId)){
            System.out.println("Owner exists");
            Proprietaire owner = ownerRepository.findById(ownerId).get();
            owner.setName(request.getName());
            owner.setEmail(request.getEmail());
            owner.setBirthDate(request.getBirthDate());
            System.out.println("Owner updated");
            System.out.println(owner.getName());
            owner = ownerRepository.save(owner);

            OwnerOuterClass.Owner ownerResponse = OwnerOuterClass.Owner.newBuilder()
                    .setId(owner.getId().intValue())
                    .setName(owner.getName())
                    .setEmail(owner.getEmail())
                    .setBirthDate(owner.getBirthDate())
                    .build();
            responseObserver.onNext(ownerResponse);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void deleteOwner(OwnerOuterClass.OwnerId request, StreamObserver<OwnerOuterClass.Empty> responseObserver) {
        Long ownerId = (long)request.getId();
        if(ownerRepository.existsById(ownerId)){
            ownerRepository.deleteById(ownerId);
        }
        responseObserver.onNext(OwnerOuterClass.Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void getVehicules(OwnerOuterClass.Empty request, StreamObserver<OwnerOuterClass.VehiculeList> responseObserver) {
        Iterable<Vehicule> vehicles = vehicleRepository.findAll();
        OwnerOuterClass.VehiculeList.Builder responseBuilder = OwnerOuterClass.VehiculeList.newBuilder();
        for (Vehicule vehicule : vehicles) {
            OwnerOuterClass.Vehicule vehiculeResponse = OwnerOuterClass.Vehicule.newBuilder()
                    .setId(vehicule.getId().intValue())
                    .setRegNumber(vehicule.getRegNumber())
                    .setBrand(vehicule.getBrand())
                    .setFiscalPower(vehicule.getFiscalPower())
                    .setModel(vehicule.getModel())
                    .build();
            responseBuilder.addVehicules(vehiculeResponse);
        }
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getVehicule(OwnerOuterClass.VehicleId request, StreamObserver<OwnerOuterClass.Vehicule> responseObserver) {
        Long vehicleId = (long)request.getId();
        if(vehicleRepository.existsById(vehicleId)){
            Vehicule vehicule = vehicleRepository.findById(vehicleId).orElse(null);
            OwnerOuterClass.Vehicule vehiculeResponse = OwnerOuterClass.Vehicule.newBuilder()
                    .setId(vehicule.getId().intValue())
                    .setRegNumber(vehicule.getRegNumber())
                    .setBrand(vehicule.getBrand())
                    .setFiscalPower(vehicule.getFiscalPower())
                    .setModel(vehicule.getModel())
                    .setOwner(OwnerOuterClass.Owner.newBuilder()
                            .setId(vehicule.getOwner().getId().intValue())
                            .setName(vehicule.getOwner().getName())
                            .setEmail(vehicule.getOwner().getEmail())
                            .setBirthDate(vehicule.getOwner().getBirthDate())
                            .build())
                    .build();
            responseObserver.onNext(vehiculeResponse);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void saveVehicule(OwnerOuterClass.VehiculeRequest request, StreamObserver<OwnerOuterClass.Vehicule> responseObserver) {
        Vehicule vehicule = Vehicule.builder()
                .id(null)
                .regNumber(request.getRegNumber())
                .brand(request.getBrand())
                .fiscalPower(request.getFiscalPower())
                .model(request.getModel())
                .build();
        vehicule = vehicleRepository.save(vehicule);
        OwnerOuterClass.Vehicule vehiculeResponse = OwnerOuterClass.Vehicule.newBuilder()
                .setId(vehicule.getId().intValue())
                .setRegNumber(vehicule.getRegNumber())
                .setBrand(vehicule.getBrand())
                .setFiscalPower(vehicule.getFiscalPower())
                .setModel(vehicule.getModel())
                .build();
        responseObserver.onNext(vehiculeResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void updateVehicule(OwnerOuterClass.VehiculeUpdateRequest request, StreamObserver<OwnerOuterClass.Vehicule> responseObserver) {
        Long vehicleId = (long)request.getId();
        if(vehicleRepository.existsById(vehicleId)){
            Vehicule vehicule = vehicleRepository.findById(vehicleId).get();
            vehicule.setRegNumber(request.getRegNumber());
            vehicule.setBrand(request.getBrand());
            vehicule.setFiscalPower(request.getFiscalPower());
            vehicule.setModel(request.getModel());
            vehicule = vehicleRepository.save(vehicule);

            OwnerOuterClass.Vehicule vehiculeResponse = OwnerOuterClass.Vehicule.newBuilder()
                    .setId(vehicule.getId().intValue())
                    .setRegNumber(vehicule.getRegNumber())
                    .setBrand(vehicule.getBrand())
                    .setFiscalPower(vehicule.getFiscalPower())
                    .setModel(vehicule.getModel())
                    .build();
            responseObserver.onNext(vehiculeResponse);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void deleteVehicule(OwnerOuterClass.VehicleId request, StreamObserver<OwnerOuterClass.Empty> responseObserver) {
        Long vehicleId = (long)request.getId();
        if(vehicleRepository.existsById(vehicleId)){
            vehicleRepository.deleteById(vehicleId);
        }
        responseObserver.onNext(OwnerOuterClass.Empty.newBuilder().build());
        responseObserver.onCompleted();
    }
}

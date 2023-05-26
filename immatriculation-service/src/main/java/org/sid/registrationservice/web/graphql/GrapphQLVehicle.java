package org.sid.registrationservice.web.graphql;

import org.sid.registrationservice.entities.Proprietaire;
import org.sid.registrationservice.entities.Vehicule;
import org.sid.registrationservice.dto.VehicleRequest;
import org.sid.registrationservice.repositories.OwnerRepository;
import org.sid.registrationservice.repositories.VehicleRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GrapphQLVehicle {
    private final VehicleRepository vehicleRepository;
    private final OwnerRepository ownerRepository;

    public GrapphQLVehicle(VehicleRepository vehicleRepository, OwnerRepository ownerRepository) {
        this.vehicleRepository = vehicleRepository;
        this.ownerRepository = ownerRepository;
    }
    @QueryMapping
    public List<Vehicule> getVehicles(){
        return vehicleRepository.findAll();
    }
    @QueryMapping("getVehicle")
    public Vehicule getVehicleById(@Argument Long id){
        return vehicleRepository.findById(id).get();
    }
    @MutationMapping("saveVehicle")
    public Vehicule saveVehicle(@Argument VehicleRequest vehicleRequest){
        Vehicule vehicule = new Vehicule();

        if(vehicleRequest.getRegNumber() != null) vehicule.setRegNumber(vehicleRequest.getRegNumber());
        if(vehicleRequest.getBrand() != null) vehicule.setBrand(vehicleRequest.getBrand());
        if(vehicleRequest.getFiscalPower() != null) vehicule.setFiscalPower(vehicleRequest.getFiscalPower());
        if(vehicleRequest.getModel() != null) vehicule.setModel(vehicleRequest.getModel());
        vehicule.setId(null);
        return vehicleRepository.save(vehicule);
    }
    @MutationMapping("updateVehicle")
    public Vehicule updateVehicle(@Argument Long id, @Argument Vehicule vehiculeRequest){
        Vehicule vehicule = vehicleRepository.findById(id).get();

        if(vehiculeRequest.getRegNumber() != null) vehicule.setRegNumber(vehiculeRequest.getRegNumber());
        if(vehiculeRequest.getBrand() != null) vehicule.setBrand(vehiculeRequest.getBrand());
        if(vehiculeRequest.getFiscalPower() != null) vehicule.setFiscalPower(vehiculeRequest.getFiscalPower());
        if(vehiculeRequest.getModel() != null) vehicule.setModel(vehiculeRequest.getModel());
        if(vehiculeRequest.getOwner() != null){
            Proprietaire owner = new Proprietaire();
            owner.setId(null);
            if (vehiculeRequest.getOwner().getName() != null) owner.setName(vehiculeRequest.getOwner().getName());
            if (vehiculeRequest.getOwner().getEmail() != null) owner.setEmail(vehiculeRequest.getOwner().getEmail());
            if (vehiculeRequest.getOwner().getBirthDate() != null) owner.setBirthDate(vehiculeRequest.getOwner().getBirthDate());
            vehicule.setOwner(owner);
        }

        return vehicleRepository.save(vehicule);
    }
    @MutationMapping("deleteVehicle")
    public boolean deleteVehicle(@Argument Long id){
        vehicleRepository.deleteById(id);
        return true;
    }

    @MutationMapping("addVehicleToOwner")
    public Vehicule addVehicleToOwner(@Argument Long ownerId, @Argument Long vehicleId){
        if(vehicleRepository.existsById(vehicleId) && ownerRepository.existsById(ownerId)){
            Vehicule vehicule = vehicleRepository.findById(vehicleId).get();
            Proprietaire owner = ownerRepository.findById(ownerId).get();
            vehicule.setOwner(owner);
            return vehicleRepository.save(vehicule);
        }
        else return null;
    }
}

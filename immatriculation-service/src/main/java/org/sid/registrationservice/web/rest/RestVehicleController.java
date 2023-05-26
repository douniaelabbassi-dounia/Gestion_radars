package org.sid.registrationservice.web.rest;

import org.sid.registrationservice.dto.VehicleRequest;
import org.sid.registrationservice.entities.Vehicule;
import org.sid.registrationservice.repositories.OwnerRepository;
import org.sid.registrationservice.repositories.VehicleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/web")
public class RestVehicleController {
    private final VehicleRepository vehicleRepository;
    private final OwnerRepository ownerRepository;

    public RestVehicleController(VehicleRepository vehicleRepository, OwnerRepository ownerRepository) {
        this.vehicleRepository = vehicleRepository;
        this.ownerRepository = ownerRepository;
    }

    @GetMapping("/vehicles")
    public List<Vehicule> getVehicles(){
        return vehicleRepository.findAll();
    }

    @GetMapping("/vehicles/{id}")
    public Vehicule getVehicleById(@PathVariable("id") Long id){
        if(vehicleRepository.existsById(id)){
            return vehicleRepository.findById(id).get();
        }
        else return null;
    }

    @PostMapping("/vehicles")
    public Vehicule saveVehicle(@RequestBody VehicleRequest vehicleRequest){
        Vehicule vehicule = Vehicule.builder()
                .id(null)
                .owner(null)
                .brand(vehicleRequest.getBrand())
                .fiscalPower(vehicleRequest.getFiscalPower())
                .model(vehicleRequest.getModel())
                .regNumber(vehicleRequest.getRegNumber())
                .build();
        return vehicleRepository.save(vehicule);
    }

    @PutMapping("/vehicles/{id}")
    public Vehicule updateVehicle(@PathVariable("id") Long id, @RequestBody VehicleRequest vehicleRequest){
        if(vehicleRepository.existsById(id)){
           Vehicule vehicule = vehicleRepository.findById(id).get();
           if (vehicleRequest.getBrand() != null) vehicule.setBrand(vehicleRequest.getBrand());
           if (vehicleRequest.getFiscalPower() != null) vehicule.setFiscalPower(vehicleRequest.getFiscalPower());
           if (vehicleRequest.getModel() != null) vehicule.setModel(vehicleRequest.getModel());
           if (vehicleRequest.getRegNumber() != null) vehicule.setRegNumber(vehicleRequest.getRegNumber());
           return vehicleRepository.save(vehicule);
        }
        else return null;
    }

    // - Delete
    @DeleteMapping("/vehicles/{id}")
    public boolean deleteVehicle(@PathVariable("id") Long id){
        if(vehicleRepository.existsById(id)){
            vehicleRepository.deleteById(id);
            return true;
        }
        else return false;
    }


    @PostMapping("/vehicles/{vehicleId}/owners/{ownerId}")
    public Vehicule addVehicleToOwner(@PathVariable Long vehicleId, @PathVariable Long ownerId) {
        if(vehicleRepository.existsById(vehicleId) && ownerRepository.existsById(ownerId)){
            Vehicule vehicule = vehicleRepository.findById(vehicleId).get();
            vehicule.setOwner(ownerRepository.findById(ownerId).get());
            return vehicleRepository.save(vehicule);
        }
        else return null;
    }

    @GetMapping("/vehicles/exist/{id}")
    public boolean vehicleExists(@PathVariable("id") Long id){
        return vehicleRepository.existsById(id);
    }

}

package org.sid.registrationservice;

import org.sid.registrationservice.dto.OwnerRequest;
import org.sid.registrationservice.dto.VehicleRequest;
import org.sid.registrationservice.web.rest.RestOwnerController;
import org.sid.registrationservice.web.rest.RestVehicleController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class ImmatriculationServiceApplication implements CommandLineRunner {

    private final RestOwnerController restOwnerController;
    private final RestVehicleController restVehicleController;

    public ImmatriculationServiceApplication(RestOwnerController restOwnerController, RestVehicleController restVehicleController) {
        this.restOwnerController = restOwnerController;
        this.restVehicleController = restVehicleController;
    }

    public static void main(String[] args) {
        SpringApplication.run(ImmatriculationServiceApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        Stream.of("FATIMA", "BOUCHRA", "HAMZA", "MUSTAPHA").forEach(name -> {
            OwnerRequest ownerRequest = OwnerRequest.builder()
                    .name(name)
                    .birthDate(new Date().toString())
                    .email(name + "@gmail.com")
                    .build();
            restOwnerController.saveOwner(ownerRequest);
        });

        restOwnerController.getOwners().forEach(owner -> {
            Stream.of("DACIA", "KIA").forEach(brand -> {
                VehicleRequest vehicleRequest = VehicleRequest.builder()
                        .regNumber("REG-" + Math.random() * 10000)
                        .brand(brand)
                        .fiscalPower((float)(Math.random() * 10))
                        .model("modele " + Math.random() * 100)
                        .build();

                Long vehicleId = restVehicleController.saveVehicle(vehicleRequest).getId();
                Long ownerId = owner.getId();

                restVehicleController.addVehicleToOwner(vehicleId, ownerId);
            });
        });
    }
}

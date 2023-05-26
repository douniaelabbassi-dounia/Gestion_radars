package org.sid.infractionservice;

import org.sid.infractionservice.entities.Infraction;
import org.sid.infractionservice.repositories.InfractionRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class InfractionServiceApplication implements CommandLineRunner {

	private final InfractionRepository infractionRepository;

	public static void main(String[] args) {
		SpringApplication.run(InfractionServiceApplication.class, args);
	}

	@Override
	public void run(String... args)  {
		for(int i = 0; i < 2; i++) {
			Infraction infraction = Infraction.builder()
					.id(null)
					.date("2021-01-01")
					.vehiculeSpeed(110.0 + i*10)
					.radarMaxSpeed(100.0 + i*10)
					.fineAmount(100.0 + i*10)
					.radarId(null)
					.vehicleId(null)
					.build();
			infractionRepository.save(infraction);
			System.out.println(infraction);
		}
	}
}

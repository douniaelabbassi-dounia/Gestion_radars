package org.sid.infractionservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Data @Entity @ToString @Builder
@AllArgsConstructor @NoArgsConstructor
public class Infraction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    private Double vehiculeSpeed;
    private Double radarMaxSpeed;
    private Double fineAmount;
    private Long radarId;
    private Long vehicleId;
}


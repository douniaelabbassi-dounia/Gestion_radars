package org.sid.registrationservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor  @ToString
@NoArgsConstructor @Builder
public class Vehicule {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String regNumber;
    private String brand;
    private Float fiscalPower;
    private String model;
    @ManyToOne
    private Proprietaire owner;
}

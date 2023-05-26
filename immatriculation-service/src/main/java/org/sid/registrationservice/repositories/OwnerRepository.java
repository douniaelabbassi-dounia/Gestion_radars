package org.sid.registrationservice.repositories;

import org.sid.registrationservice.entities.Proprietaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OwnerRepository extends JpaRepository<Proprietaire, Long> {

}

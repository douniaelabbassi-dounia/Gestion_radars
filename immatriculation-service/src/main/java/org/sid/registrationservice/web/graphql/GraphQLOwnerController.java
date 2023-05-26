package org.sid.registrationservice.web.graphql;

import org.sid.registrationservice.entities.Proprietaire;
import org.sid.registrationservice.dto.OwnerRequest;
import org.sid.registrationservice.repositories.OwnerRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GraphQLOwnerController {
    private OwnerRepository ownerRepository;

    public GraphQLOwnerController(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @QueryMapping
    public List<Proprietaire> getOwners(){
        return ownerRepository.findAll();
    }

    // - Get by id
    @QueryMapping("getOwner")
    public Proprietaire getOwnerById(@Argument Long id){
        return ownerRepository.findById(id).get();
    }

    // - Save
    @MutationMapping("saveOwner")
    public Proprietaire saveOwner(@Argument OwnerRequest ownerRequest){
        Proprietaire owner = new Proprietaire();

        if(ownerRequest.getName() != null) owner.setName(ownerRequest.getName());
        if(ownerRequest.getEmail() != null) owner.setEmail(ownerRequest.getEmail());
        if(ownerRequest.getBirthDate() != null) owner.setBirthDate(ownerRequest.getBirthDate());

        owner.setId(null);
        owner.setVehicules(null);
        return ownerRepository.save(owner);
    }

    // - Update
    @MutationMapping("updateOwner")
    public Proprietaire updateOwner(@Argument Long id, @Argument Proprietaire ownerRequest){
        Proprietaire owner = ownerRepository.findById(id).get();

        if(ownerRequest.getName() != null) owner.setName(ownerRequest.getName());
        if(ownerRequest.getEmail() != null) owner.setEmail(ownerRequest.getEmail());
        if(ownerRequest.getBirthDate() != null) owner.setBirthDate(ownerRequest.getBirthDate());

        return ownerRepository.save(owner);
    }

    // - Delete
    @MutationMapping("deleteOwner")
    public boolean deleteOwner(@Argument Long id){
        ownerRepository.deleteById(id);
        return true;
    }
}

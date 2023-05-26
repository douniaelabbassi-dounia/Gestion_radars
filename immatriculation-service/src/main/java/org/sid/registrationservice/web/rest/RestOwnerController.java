package org.sid.registrationservice.web.rest;
import org.sid.registrationservice.dto.OwnerRequest;
import org.sid.registrationservice.entities.Proprietaire;
import org.sid.registrationservice.repositories.OwnerRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/web")
public class RestOwnerController {
    private OwnerRepository ownerRepository;

    public RestOwnerController(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @GetMapping("/owners")
    public List<Proprietaire> getOwners(){
        return ownerRepository.findAll();
    }
    @GetMapping("/owners/{id}")
    public Proprietaire getOwnerById(@PathVariable("id") Long id){
        return ownerRepository.findById(id).get();
    }
    @PostMapping("/owners")
    public Proprietaire saveOwner(@RequestBody OwnerRequest ownerRequest){
        Proprietaire owner = Proprietaire.builder()
                .id(null)
                .name(ownerRequest.getName())
                .email(ownerRequest.getEmail())
                .birthDate(ownerRequest.getBirthDate())
                .build();

        return ownerRepository.save(owner);
    }
    @PutMapping("/owners/{id}")
    public Proprietaire updateOwner(@PathVariable("id") Long id, @RequestBody OwnerRequest ownerRequest){
        if(ownerRepository.existsById(id)){
            Proprietaire owner = ownerRepository.findById(id).get();

            if(ownerRequest.getName() != null) owner.setName(ownerRequest.getName());
            if(ownerRequest.getEmail() != null) owner.setEmail(ownerRequest.getEmail());
            if(ownerRequest.getBirthDate() != null) owner.setBirthDate(ownerRequest.getBirthDate());

            return ownerRepository.save(owner);
        }
        else return null;
    }
    @DeleteMapping("/owners/{id}")
    public boolean deleteOwner(@PathVariable("id") Long id){
        if(ownerRepository.existsById(id)){
            ownerRepository.deleteById(id);
            return true;
        }
        else{
            return false;
        }
    }
    @GetMapping("/owners/exist/{id}")
    public boolean ownerExists(@PathVariable("id") Long id){
        return ownerRepository.existsById(id);
    }
}

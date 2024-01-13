package strelok.spring.petclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import strelok.spring.petclinic.data.entities.Owner;
import strelok.spring.petclinic.data.entities.PetType;
import strelok.spring.petclinic.data.entities.Vet;
import strelok.spring.petclinic.data.services.OwnerService;
import strelok.spring.petclinic.data.services.PetTypeService;
import strelok.spring.petclinic.data.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType petType1 = new PetType();
        petType1.setName("Dogs");
        PetType petType2 = new PetType();
        petType2.setName("Cats");
        petTypeService.save(petType1);
        petTypeService.save(petType2);

        Owner owner1 = new Owner();
        owner1.setFirstName("Ivanov ");
        owner1.setLastName("Alex");
        owner1.setAddress("Panchenko 2");
        owner1.setCity("Saratov");
        owner1.setPhone("+79877777777");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Petrov ");
        owner2.setLastName("Anton");
        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setFirstName("Kruglov ");
        owner3.setLastName("Andrei");
        ownerService.save(owner3);

        Vet vet1 = new Vet();
        vet1.setFirstName("Zaiceva ");
        vet1.setLastName("Irina");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Smirnova ");
        vet2.setLastName("Maria");
        vetService.save(vet2);


        //and so
    }
}

package zatribune.spring.petclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import zatribune.spring.petclinic.data.entities.Owner;
import zatribune.spring.petclinic.data.entities.PetType;
import zatribune.spring.petclinic.data.entities.Vet;
import zatribune.spring.petclinic.data.services.OwnerService;
import zatribune.spring.petclinic.data.services.PetTypeService;
import zatribune.spring.petclinic.data.services.VetService;

@Component
public class DataLoader  implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService){
        this.ownerService=ownerService;
        this.vetService=vetService;
        this.petTypeService=petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType petType1=new PetType();
        petType1.setName("Dogs");
        PetType petType2=new PetType();
        petType2.setName("Cats");
        petTypeService.save(petType1);
        petTypeService.save(petType2);

        Owner owner1=new Owner();
        owner1.setFirstName("Muhammad");
        owner1.setLastName("Ali");
        owner1.setAddress("123 tahrir square");
        owner1.setCity("Cairo");
        owner1.setPhone("+201114388288");
        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner2.setFirstName("James");
        owner2.setLastName("Bond");
        ownerService.save(owner2);

        Owner owner3=new Owner();
        owner3.setFirstName("Sara");
        owner3.setLastName("Whatever");
        ownerService.save(owner3);

        Vet vet1=new Vet();
        vet1.setFirstName("Roman");
        vet1.setLastName("Rocket");
        vetService.save(vet1);

        Vet vet2=new Vet();
        vet2.setFirstName("Karim");
        vet2.setLastName("bta3 7arim");
        vetService.save(vet2);


        //and so
    }
}

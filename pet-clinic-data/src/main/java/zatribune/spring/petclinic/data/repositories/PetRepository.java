package zatribune.spring.petclinic.data.repositories;

import org.springframework.data.repository.CrudRepository;
import zatribune.spring.petclinic.data.entities.Pet;

public interface PetRepository extends CrudRepository<Pet,Long> {
}

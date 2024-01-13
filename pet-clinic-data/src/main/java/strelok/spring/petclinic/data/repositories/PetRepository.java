package strelok.spring.petclinic.data.repositories;

import org.springframework.data.repository.CrudRepository;
import strelok.spring.petclinic.data.entities.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}

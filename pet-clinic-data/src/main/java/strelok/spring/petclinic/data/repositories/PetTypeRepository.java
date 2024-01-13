package strelok.spring.petclinic.data.repositories;

import org.springframework.data.repository.CrudRepository;
import strelok.spring.petclinic.data.entities.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}

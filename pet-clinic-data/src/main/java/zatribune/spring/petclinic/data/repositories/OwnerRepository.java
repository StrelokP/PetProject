package zatribune.spring.petclinic.data.repositories;

import org.springframework.data.repository.CrudRepository;
import zatribune.spring.petclinic.data.entities.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findOwnerByLastName(String lastName);
}

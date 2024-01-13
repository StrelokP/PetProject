package zatribune.spring.petclinic.data.repositories;

import org.springframework.data.repository.CrudRepository;
import zatribune.spring.petclinic.data.entities.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}

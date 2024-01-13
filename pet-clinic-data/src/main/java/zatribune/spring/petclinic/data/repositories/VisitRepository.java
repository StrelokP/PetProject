package zatribune.spring.petclinic.data.repositories;

import org.springframework.data.repository.CrudRepository;
import zatribune.spring.petclinic.data.entities.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}

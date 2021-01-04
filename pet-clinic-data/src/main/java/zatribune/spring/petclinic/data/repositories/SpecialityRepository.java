package zatribune.spring.petclinic.data.repositories;

import org.springframework.data.repository.CrudRepository;
import zatribune.spring.petclinic.data.entities.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}

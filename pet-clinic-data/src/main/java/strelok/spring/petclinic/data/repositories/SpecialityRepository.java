package strelok.spring.petclinic.data.repositories;

import org.springframework.data.repository.CrudRepository;
import strelok.spring.petclinic.data.entities.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}

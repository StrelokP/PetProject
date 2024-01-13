package strelok.spring.petclinic.data.repositories;

import org.springframework.data.repository.CrudRepository;
import strelok.spring.petclinic.data.entities.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}

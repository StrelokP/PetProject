package strelok.spring.petclinic.data.services;

import strelok.spring.petclinic.data.entities.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}

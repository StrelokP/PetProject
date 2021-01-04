package zatribune.spring.petclinic.data.services;

import zatribune.spring.petclinic.data.entities.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);
}

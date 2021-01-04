package zatribune.spring.petclinic.data.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import zatribune.spring.petclinic.data.entities.Owner;
import zatribune.spring.petclinic.data.services.CrudService;
import zatribune.spring.petclinic.data.services.OwnerService;

import java.util.Set;
@Service
@Profile({"default","MapData"})
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        //todo: add validation
        return super.save(owner.getId(),owner);
    }

    @Override
    public void delete(Owner object) {
       super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
       super.deleteById(id);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}

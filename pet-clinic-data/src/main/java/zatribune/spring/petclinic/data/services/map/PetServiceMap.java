package zatribune.spring.petclinic.data.services.map;

import org.springframework.stereotype.Service;
import zatribune.spring.petclinic.data.entities.Pet;
import zatribune.spring.petclinic.data.services.CrudService;
import zatribune.spring.petclinic.data.services.PetService;

import java.util.Set;
@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService{
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Pet object) {
         super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }
}

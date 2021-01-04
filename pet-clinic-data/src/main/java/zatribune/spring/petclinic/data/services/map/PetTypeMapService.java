package zatribune.spring.petclinic.data.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import zatribune.spring.petclinic.data.entities.PetType;
import zatribune.spring.petclinic.data.services.PetTypeService;

import java.util.Set;

@Service
@Profile({"default","MapData"})
public class PetTypeMapService extends AbstractMapService<PetType,Long> implements PetTypeService{
    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        //todo: add validation
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(PetType object) {
       super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }
}

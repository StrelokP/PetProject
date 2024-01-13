package zatribune.spring.petclinic.data.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import zatribune.spring.petclinic.data.entities.Vet;
import zatribune.spring.petclinic.data.services.CrudService;
import zatribune.spring.petclinic.data.services.VetService;

import java.util.Set;

@Service
@Profile({"default", "MapData"})
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        //todo: add validation
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }
}

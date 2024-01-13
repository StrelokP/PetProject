package strelok.spring.petclinic.data.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import strelok.spring.petclinic.data.entities.Visit;
import strelok.spring.petclinic.data.services.VisitService;

import java.util.Set;

@Service
@Profile({"default", "MapData"})
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {
    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit object) {
        if (object.getPet() == null || object.getPet().getOwner() == null || object.getPet().getId() == null
                || object.getPet().getOwner().getId() == null)
            throw new RuntimeException("Invalid Visit");
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }
}

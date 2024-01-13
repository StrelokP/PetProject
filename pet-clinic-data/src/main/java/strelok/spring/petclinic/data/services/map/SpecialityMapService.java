package strelok.spring.petclinic.data.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import strelok.spring.petclinic.data.entities.Speciality;
import strelok.spring.petclinic.data.services.SpecialityService;

import java.util.Set;

@Service
@Profile({"default", "MapData"})
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {
    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        //todo: add validation
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }
}

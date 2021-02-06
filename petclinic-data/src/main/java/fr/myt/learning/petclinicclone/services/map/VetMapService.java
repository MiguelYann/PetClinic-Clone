package fr.myt.learning.petclinicclone.services.map;

import java.util.Set;

import fr.myt.learning.petclinicclone.domain.Vet;
import fr.myt.learning.petclinicclone.services.CrudService;
import fr.myt.learning.petclinicclone.services.VetService;

public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

}

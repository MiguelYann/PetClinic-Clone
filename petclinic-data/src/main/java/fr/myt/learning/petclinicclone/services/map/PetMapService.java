package fr.myt.learning.petclinicclone.services.map;

import java.util.Set;

import fr.myt.learning.petclinicclone.domain.Pet;
import fr.myt.learning.petclinicclone.services.CrudService;

public class PetMapService extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

  @Override
  public Pet save(Pet t) {
    return null;
  }

  @Override
  public Pet findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Set<Pet> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Pet pet) {
    super.delete(pet);
  }

}

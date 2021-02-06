package fr.myt.learning.petclinicclone.services.map;

import java.util.Set;

import fr.myt.learning.petclinicclone.domain.Owner;
import fr.myt.learning.petclinicclone.services.CrudService;
import fr.myt.learning.petclinicclone.services.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

  @Override
  public Owner findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Owner save(Owner owner) {
    return super.save(owner.getId(), owner);
  }

  @Override
  public Set<Owner> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Owner owner) {
    super.delete(owner);
  }

  @Override
  public Owner findByLastName(String lastName) {
    return null;
  }
}

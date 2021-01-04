package fr.myt.learning.petclinicclone.services;

import fr.myt.learning.petclinicclone.domain.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

  Owner findByLastName(String lastName);
}

package fr.myt.learning.petclinicclone.services;

import java.util.Set;

import fr.myt.learning.petclinicclone.domain.Owner;

public interface OwnerService {
  Owner findById(Long id);

  Owner save(Owner owner);

  Set<Owner> findAll();

  Owner findByLastName(String lastName);

}

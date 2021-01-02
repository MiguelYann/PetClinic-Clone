package fr.myt.learning.petclinicclone.services;

import java.util.Set;

import fr.myt.learning.petclinicclone.domain.Pet;

public interface PetService {
  Pet findById(Long id);

  Pet save(Pet owner);

  Set<Pet> findAll();
}

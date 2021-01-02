package fr.myt.learning.petclinicclone.services;

import java.util.Set;

import fr.myt.learning.petclinicclone.domain.Vet;

public interface VetService {
  Vet findById(Long id);

  Vet save(Vet owner);

  Set<Vet> findAll();
}

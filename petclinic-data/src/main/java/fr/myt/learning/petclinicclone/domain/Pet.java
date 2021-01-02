package fr.myt.learning.petclinicclone.domain;

import java.time.LocalDate;

public class Pet extends BaseEntity {

  private PetType petType;
  private Owner owner;
  private LocalDate localDate;

  public PetType getPetType() {
    return this.petType;
  }

  public void setPetType(PetType petType) {
    this.petType = petType;
  }

  public Owner getOwner() {
    return this.owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  public LocalDate getLocalDate() {
    return this.localDate;
  }

  public void setLocalDate(LocalDate localDate) {
    this.localDate = localDate;
  }

}

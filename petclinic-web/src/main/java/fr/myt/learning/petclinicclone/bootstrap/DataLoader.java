package fr.myt.learning.petclinicclone.bootstrap;

import fr.myt.learning.petclinicclone.domain.Owner;
import fr.myt.learning.petclinicclone.domain.Vet;
import fr.myt.learning.petclinicclone.services.OwnerService;
import fr.myt.learning.petclinicclone.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner firstOwner = new Owner();
        firstOwner.setFirstName("John");
        firstOwner.setLastName("Wick");
        ownerService.save(firstOwner);

        Owner secondOwner = new Owner();
        firstOwner.setFirstName("Marta");
        firstOwner.setLastName("Kim");
        ownerService.save(secondOwner);

        System.out.println("Load owners");
        Vet firstVet = new Vet();
        firstVet.setLastName("Yoyo");
        firstVet.setFirstName("Yaya");
        vetService.save(firstVet);

        Vet secondVet = new Vet();
        firstVet.setLastName("toto");
        firstVet.setFirstName("tata");
        vetService.save(secondVet);

        System.out.println("Load vets ...r");


    }
}

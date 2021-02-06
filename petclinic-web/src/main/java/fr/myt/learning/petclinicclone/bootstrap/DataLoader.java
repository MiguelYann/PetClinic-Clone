package fr.myt.learning.petclinicclone.bootstrap;

import fr.myt.learning.petclinicclone.domain.Owner;
import fr.myt.learning.petclinicclone.domain.Vet;
import fr.myt.learning.petclinicclone.services.OwnerService;
import fr.myt.learning.petclinicclone.services.VetService;
import fr.myt.learning.petclinicclone.services.map.OwnerMapService;
import fr.myt.learning.petclinicclone.services.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerMapService();
        this.vetService = new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner firstOwner = new Owner();
        firstOwner.setId(1L);
        firstOwner.setFirstName("John");
        firstOwner.setLastName("Wick");
        ownerService.save(firstOwner);

        Owner secondOwner = new Owner();
        firstOwner.setId(2L);
        firstOwner.setFirstName("Marta");
        firstOwner.setLastName("Kim");
        ownerService.save(secondOwner);

        System.out.println("Load owners");
        Vet firstVet = new Vet();
        firstVet.setId(1L);
        firstVet.setLastName("Yoyo");
        firstVet.setFirstName("Yaya");
        vetService.save(firstVet);

        Vet secondVet = new Vet();
        firstVet.setId(2L);
        firstVet.setLastName("toto");
        firstVet.setFirstName("tata");
        vetService.save(secondVet);

        System.out.println("Load vets ...r");


    }
}

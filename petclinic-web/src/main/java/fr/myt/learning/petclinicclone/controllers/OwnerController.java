package fr.myt.learning.petclinicclone.controllers;

import fr.myt.learning.petclinicclone.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/index", "/index.html"})
    public String getAllOwner(Model model) {
        System.out.println(model);
        model.addAttribute("owners", ownerService.findAll());
        System.out.println(model);

        return "owners/index";
    }
}

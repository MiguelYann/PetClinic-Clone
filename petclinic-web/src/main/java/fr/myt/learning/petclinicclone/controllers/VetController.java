package fr.myt.learning.petclinicclone.controllers;

import fr.myt.learning.petclinicclone.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"", "/index"})
    public String getAllVets(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}

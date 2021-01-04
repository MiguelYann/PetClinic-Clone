package fr.myt.learning.petclinicclone.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {

  @RequestMapping({ "", "/index" })
  public String getAllVets() {
    return "vets/index";
  }
}

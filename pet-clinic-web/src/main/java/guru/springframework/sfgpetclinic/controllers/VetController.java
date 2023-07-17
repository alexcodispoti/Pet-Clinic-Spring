package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {

    //nella requets inserisco l'Url che richiamèra il metodo listVets(), ricondotto poi al file index.html sotto la root
    //vets/list.hmtl

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }


    @RequestMapping(value = {"/","/list"})
    public String listOwners(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/list";
    }
}

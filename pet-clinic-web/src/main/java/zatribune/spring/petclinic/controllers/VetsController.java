package zatribune.spring.petclinic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import zatribune.spring.petclinic.data.services.VetService;

@Controller
public class VetsController {

    private final VetService vetService;

    @Autowired
    public VetsController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping("/vets/vetsList")
    public String getVetsPage(Model model){
        model.addAttribute("vets",vetService.findAll());
        return "/vets/vetsList";
    }
}

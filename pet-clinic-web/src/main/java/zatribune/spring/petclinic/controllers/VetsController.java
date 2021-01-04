package zatribune.spring.petclinic.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import zatribune.spring.petclinic.data.services.VetService;

@Slf4j
@Controller
public class VetsController {

    private final VetService vetService;

    @Autowired
    public VetsController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping("/vetsList")
    public String getVetsPage(Model model){
        log.debug("I'm in the "+getClass().getSimpleName());
        model.addAttribute("vets",vetService.findAll());
        return "/vets/vetsList";
    }
}

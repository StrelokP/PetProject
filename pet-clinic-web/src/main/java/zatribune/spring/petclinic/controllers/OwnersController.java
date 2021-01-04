package zatribune.spring.petclinic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import zatribune.spring.petclinic.data.services.OwnerService;

@Controller
public class OwnersController {

    private final OwnerService ownerService;

    @Autowired
    public OwnersController(OwnerService ownerService){
        this.ownerService=ownerService;
    }

    @RequestMapping("/owners/ownersList")
    public String getOwnersPage(Model model){
        model.addAttribute("owners",ownerService.findAll());
        return "/owners/ownersList";
    }
}

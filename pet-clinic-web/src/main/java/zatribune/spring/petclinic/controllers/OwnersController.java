package zatribune.spring.petclinic.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import zatribune.spring.petclinic.data.services.OwnerService;

@Slf4j
@Controller
public class OwnersController {

    private final OwnerService ownerService;

    @Autowired
    public OwnersController(OwnerService ownerService){
        this.ownerService=ownerService;
    }

    // don't name the mapping like the returned view -->for testing purposes
    @RequestMapping("ownersList")
    public String getOwnersPage(Model model){
        log.debug("I'm in the "+getClass().getSimpleName());
        model.addAttribute("owners",ownerService.findAll());
        return "/owners/ownersList";
    }
}

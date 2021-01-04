package zatribune.spring.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {



    @RequestMapping({"/","","index","index.html","pet-clinic"})
    public String getIndexPage(Model model){

        return "index";
    }
}

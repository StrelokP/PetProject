package zatribune.spring.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/fragments/home")
    public String getHome(Model model){
        return "/fragments/home";
    }
}

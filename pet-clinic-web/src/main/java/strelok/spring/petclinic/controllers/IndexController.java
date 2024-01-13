package strelok.spring.petclinic.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {


    @RequestMapping({"/", "", "index", "index.html", "pet-clinic"})
    public String getIndexPage(Model model) {
        log.debug("I'm in the " + getClass().getSimpleName());
        return "index";
    }
}

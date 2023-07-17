package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    //metodo che ritorna index e thymeleaf cercherà un template con il nome index
    @RequestMapping(value = {"/"," ","index"})
    public String index(){
        return "index";
    }
}

package guru.springframework.spring5recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/","", "/Index"})
    public String getIndexPage() {
        System.out.println("Some Message to say 12345");
        return "index";
    }
}

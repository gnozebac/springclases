package net.magbdigital.sb.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping ({"/index","/home"})
    public String index(Model model){
        model.addAttribute("titulo","Hoa mundo spring");
        return "index";
    }
}

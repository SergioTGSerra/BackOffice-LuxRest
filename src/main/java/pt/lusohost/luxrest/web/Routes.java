package pt.lusohost.luxrest.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Routes {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/dashboard")
    public String dashboard(){
        return "dashboard";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/category")
    public String category(){
        return "category";
    }
}

package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String greetings(Model model){
        User user= new User("Mitali");
        model.addAttribute("user", user);
        System.out.println("Welcome User : "+ user.getName());
        return "index";
    }

}



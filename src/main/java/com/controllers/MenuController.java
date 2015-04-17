package com.controllers;

import com.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MenuController {

    @RequestMapping(value = "/menu/{userName}", method = RequestMethod.GET)
    public String login(@PathVariable String userName, Model model){
        model.addAttribute("message", "Hello " + userName);
        return "menu";
    }

}

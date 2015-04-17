package com.controllers;

import com.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model){
        model.addAttribute("user", new User());
        return "login";
    }

    @RequestMapping(value = "/login/user", method = RequestMethod.POST)
    public String printWelcome(
            @ModelAttribute("user")
            @Valid
            User user,
            Errors errors) {
        if(errors.hasErrors()) {
            return "/login";
        }
        return "redirect:/menu/"+user.getName();
    }





}

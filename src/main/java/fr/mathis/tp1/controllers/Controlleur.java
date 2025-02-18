package fr.mathis.tp1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class Controlleur {
    @RequestMapping("/")
    public String getTemplate1(Model param1) {

        param1.addAttribute("name","Capteur température");

        return "template1";
    }
}

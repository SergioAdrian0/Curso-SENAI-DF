package com.senai.projetowebsenai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class HomeController {

    @GetMapping
   // @GetMapping("/")
    //String index(Principal principal) {
        //return principal != null ? "home/homeSignedIn" : "home/homeNotSignedIn";
    public String index(Model model){//Model RECEBE REQUISIÇÕES VINDAS DO CONTROLLER E GERA SUAS RESPOSTAS;
        model.addAttribute("nome", "Francisco");
        String home = model != null ? "home/index" : "home/index";
        return home;
    }
}

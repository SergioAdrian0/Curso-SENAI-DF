package com.senai.projetowebsenai.controller;

import com.senai.projetowebsenai.model.UserModel;
import com.senai.projetowebsenai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/user")//ACESSO À ESSE ENDEREÇO;
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    public String getAllUsers(Model model){
        List<UserModel> users = userService.findAll();
        model.addAttribute("users", users);
        return "user/users";
    }

    @GetMapping(value = "/novo")
    public String formUser(){
        return "user/novo";
    }
}

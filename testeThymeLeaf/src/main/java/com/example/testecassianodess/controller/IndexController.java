package com.example.testecassianodess.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController{

    /* Esse método retorna a página index */
    @GetMapping("/")
    public String index(){
        return "redirect:/eventos";
    }

}

package com.informaticadsy.spring.app1.springboot_aplications.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EjemploController {

    @GetMapping("/detalles")

    public String info(Model mod){
        mod.addAttribute("Titulo", "Pagina Spring");
        mod.addAttribute("Nombre", "Megan");
        mod.addAttribute("Apellido", "Fox");
        mod.addAttribute("Edad", "33");
        mod.addAttribute("Extra", "te amo");

        return "detalles";
        
        
    }
}
package com.ecoders.spring.appone.springboot_appone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Model model) {
        model.addAttribute("Titulo", "Servidor en linea con Spring Boot");
        model.addAttribute("Detalle", "Aplicacion de ejemplo para Spring Boot");
        model.addAttribute("Servidor", "Servidor dex desarrollado por Ecoders");
        return "detalles_info";
    }

}

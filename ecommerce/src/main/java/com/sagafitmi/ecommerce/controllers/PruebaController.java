package com.sagafitmi.ecommerce.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prueba")

public class PruebaController {
    
    @GetMapping("/hola")
    public String saludo() {
        return "hola";
    }

}

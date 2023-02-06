package com.joanmoncho.tiendavintage.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MiControlador {
    @GetMapping("/login")
    public String indice(){
        return "login/login";
    }
}

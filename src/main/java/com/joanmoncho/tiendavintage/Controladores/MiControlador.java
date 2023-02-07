package com.joanmoncho.tiendavintage.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MiControlador {
    @GetMapping("/index")
    public String home(){
        return "index";
    }
    @GetMapping("/login")
    public String indice(){
        return "/login/login";
    }

    @GetMapping("/registrar")
    public String registrar(){
        return "/login/registrar";
    }

    @GetMapping("/cesta")
    public String cesta(){
        return "/cesta/cesta";
    }

}

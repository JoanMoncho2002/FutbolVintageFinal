package com.joanmoncho.tiendavintage.Controladores;

import com.joanmoncho.tiendavintage.Modelo.UsuarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.joanmoncho.tiendavintage.Repositorio.IUserRepository;
import org.springframework.ui.Model;

@Controller
public class MiControlador {
    //LOGIN                                 *
    @Autowired
    private IUserRepository iUserRepository;

    @GetMapping({"/login"})
    public String goToLogin(Model model){
        return "/login/login";
    }

    //REGISTER                                *

    @GetMapping({"/registrar"})
    public String goToregister(Model model){
        model.addAttribute("usuario", new UsuarioEntity());
        return "/login/registrar";
    }
    @PostMapping("/processregister")
    public String processRegister(UsuarioEntity usuario) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(usuario.getPassword());
        usuario.setPassword(encodedPassword);
        iUserRepository.save(usuario);
        return "index";
    }

    @PostMapping("/usuario")
    public String usuario() {
        return "index";
    }

    /*@ModelAttribute("usuario")
    public UserModel user() {
        return new UserModel();
    }*/

    //ANTIGUO
    /* @GetMapping("/index")
    public String home(){
        return "index";
    }
    @GetMapping("/login")
    public String login(){
        return "/login/login";
    }

    @GetMapping("/registrar")
    public String registrar(){
        return "/login/registrar";
    }

    @GetMapping("/cesta")
    public String cesta(){
        return "/cesta/cesta";
    }*/

}

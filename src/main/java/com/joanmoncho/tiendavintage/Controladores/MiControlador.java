package com.joanmoncho.tiendavintage.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.joanmoncho.tiendavintage.Repositorio.IUserRepository;
import com.joanmoncho.tiendavintage.Modelo.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MiControlador {
    //LOGIN                                 *
    @Autowired
    private IUserRepository iUserRepository;

    @GetMapping({"/login"})
    public String goToLogin(Model model){
        return "login";
    }

    //PUBLIC                                *
    @GetMapping({"/","index"})
    public String index(){
        return "index";
    }

    //REGISTER                                *

    @GetMapping({"/register"})
    public String goToregister(Model model){
        model.addAttribute("user", new UserModel());
        return "register";
    }
    @PostMapping("/process_register")
    public String processRegister(UserModel user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        iUserRepository.save(user);
        return "index";
    }

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

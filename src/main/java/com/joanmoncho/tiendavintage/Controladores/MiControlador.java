package com.joanmoncho.tiendavintage.Controladores;

import com.joanmoncho.tiendavintage.Usuarios.Dto.UsuarioRegistroDto;
import com.joanmoncho.tiendavintage.Usuarios.Modelo.Usuario;
import com.joanmoncho.tiendavintage.Usuarios.Servicio.UsuarioServicio;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registrar")
public class MiControlador {
    private UsuarioServicio usuarioServicio;
    public MiControlador(UsuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }

    @ModelAttribute("usuario")
    public UsuarioRegistroDto retornarNuevoUsuarioRegistroDto(){
        return new UsuarioRegistroDto();
    }

    @GetMapping
    public String mostrarFormularioDeRegistro(){
        return "registro";
    }

    @PostMapping
    public String registrarCuentaDeUsuarii(@ModelAttribute("usuario") UsuarioRegistroDto registroDto){
        usuarioServicio.guardar(registroDto);
        return "redirect:/registro?exito";
    }

    /*@GetMapping("/login")
    public String indice(){
        return "login/login";
    }

    @GetMapping("/registrar")
    public String indice2(){
        return "login/registrar";
    }

     */

}

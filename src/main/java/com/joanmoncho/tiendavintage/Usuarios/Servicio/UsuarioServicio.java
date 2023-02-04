package com.joanmoncho.tiendavintage.Usuarios.Servicio;

import com.joanmoncho.tiendavintage.Usuarios.Dto.UsuarioRegistroDto;
import com.joanmoncho.tiendavintage.Usuarios.Modelo.Usuario;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UsuarioServicio {

    public Usuario guardar(UsuarioRegistroDto registroDto);

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    List<Usuario> listarUsuarios();
}

package com.joanmoncho.tiendavintage.Usuarios.Repositorio;

import com.joanmoncho.tiendavintage.Usuarios.Modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

    public Usuario findByEmail(String email);
}

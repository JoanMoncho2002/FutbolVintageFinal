package com.joanmoncho.tiendavintage.Repositorio;

import com.joanmoncho.tiendavintage.Modelo.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UsuarioEntity, Long> {
    UsuarioEntity findByEmail(String email);
}

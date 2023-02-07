package com.joanmoncho.tiendavintage.Repositorio;

import com.joanmoncho.tiendavintage.Modelo.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserModel, Long> {
    UserModel findByEmail(String email);
}

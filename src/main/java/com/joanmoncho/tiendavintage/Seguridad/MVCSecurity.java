package com.joanmoncho.tiendavintage.Seguridad;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MVCSecurity implements WebMvcConfigurer {

    public void addViewController(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
    }

}

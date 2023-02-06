package com.joanmoncho.tiendavintage.Seguridad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
@Configuration
public class ConfigSeguridad {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests((authorize) ->
                    authorize.requestMatchers("", "/", "/home", "/registrar","/login", "/css/**","/img/**", "/js/**").permitAll()
                            .requestMatchers("/index").permitAll()
                            .requestMatchers("/users").hasRole("ADMIN")
            ).formLogin((form) -> form
                            .loginPage("/login")
                            .permitAll()
            ).logout(LogoutConfigurer::permitAll);
        return http.build();
    }
    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user =
                User.withDefaultPasswordEncoder()
                        .username("root")
                        .password("1234")
                        .roles("USER")
                        .build();
        return new InMemoryUserDetailsManager(user);
    }
}

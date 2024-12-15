package com.art.app.rest.Security;

 import org.springframework.beans.factory.annotation.Autowired;
/* 

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
            .csrf(csrf -> csrf.ignoringRequestMatchers("/api/**", "/login"))
            .formLogin(httpForm -> {
                httpForm.loginPage("/login").permitAll();
            })
            .authorizeHttpRequests(authz -> {
                authz.requestMatchers("/login").permitAll();
                authz.anyRequest().authenticated();
            })
            .logout(logout -> logout.permitAll())
            .build();
    }
}

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.art.app.rest.Models.MyAppUserService;;
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Autowired
    private MyAppUserService appUserService;

    @Bean
    public UserDetailsService userDetailsService(){
        return appUserService;
    }
    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(appUserService);
        return provider;
    }
    @Bean
    //@Lazy
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity httpSecurity ) throws Exception{
        return httpSecurity
            .csrf(AbstractHttpConfigurer::disable)
            .formLogin(httpForm -> {
                httpForm 
                    .loginPage("/login").permitAll();

                httpForm.defaultSuccessUrl("/admin");
            })
            
            .authorizeHttpRequests(registry ->{
                registry.requestMatchers("/","/products/**", "/test/**", "/registration", "/admin", "/index.html","/css/registration.css", "/css/**","/js/**", "/login", "/resources/**", "/static/**").permitAll();
                
                registry.anyRequest().authenticated();
                System.out.println("Access configured for /test/** and all other paths");
            })
            
    

            .build();
    }
}
//, "/css/**", "/js/**"


*/

package com.art.app.rest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.art.app.rest.Models.MyAppUser;
import com.art.app.rest.Repo.MyAppUserRepository;

@RestController
public class RegistrationController {
/* 
    @Autowired
    private MyAppUserRepository myAppUserRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping(value="/registration" , consumes = "application/x-www-form-urlencoded")
    public MyAppUser createUser(@ModelAttribute MyAppUser user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return myAppUserRepository.save(user);
    }
    
    */
}

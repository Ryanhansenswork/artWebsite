package com.art.app.rest.Models;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;*/
import org.springframework.stereotype.Service;

import com.art.app.rest.Repo.MyAppUserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MyAppUserService /*implements UserDetailsService*/ {

    @Autowired
    private MyAppUserRepository repository;
    


    public Optional<MyAppUser> findByUsername(String username) {
        return repository.findByUsername(username);
    }

    /*@Autowired
    private PasswordEncoder passwordEncoder;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<MyAppUser> user = repository.findByUsername(username);

        if(user.isPresent())
        {
            var userObj = user.get();
            return User.builder()
                .username(userObj.getUsername())
                .password(userObj.getPassword())
                .build();
        }else
        {
            throw new UsernameNotFoundException("username not found" + username);
        }
      
    }
    /*public MyAppUser registerUser(MyAppUser user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return repository.save(user);
    }*/

}

package com.art.app.rest.Models;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Getter

@Entity
@Table(name= "myappuser")
public class MyAppUser {

    //@Id
    //@GeneratedValue(strategy  = GenerationType.AUTO)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long userID;
    private String username;
    private String email;
    private String password;


    public long getId() {
        return userID;
    }
    public void setId(Long userID) {
        this.userID = userID;
    }
    public String getUsername(){
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}

package com.example.eshope.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor 
public class User implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    public int idUser;
    public String login;
    public String password;
    public int connectionNumber;

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

}

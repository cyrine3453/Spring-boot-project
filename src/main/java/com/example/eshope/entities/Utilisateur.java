package com.example.eshope.entities;

import java.io.Serializable;
import java.util.Collection;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor 
public class Utilisateur implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    private String login;
    private String password;
    private int connectionNumber;

    @OneToOne
    private UserInformations userInformations;
    @OneToMany (mappedBy = "utilisateur" , fetch = FetchType.LAZY)
    private Collection<Command> commandes;

    @ManyToMany (fetch = FetchType.EAGER)
    private Collection<Role> roles;
}

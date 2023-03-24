package com.example.eshope.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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


    @JsonManagedReference
    @OneToOne
    private UserInformations userInformations;


    @JsonManagedReference
    @OneToMany (mappedBy = "utilisateur" , fetch = FetchType.LAZY)
    private Collection<Command> commandes;

    @JsonManagedReference
    @ManyToMany
    @JoinTable(name = "USER_ROLES",
    joinColumns = @JoinColumn(name = "USER_ID"),
    inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
    private List<Role> roles = new ArrayList<>();

    public List<Role> getRoles() {
        return roles;
    }
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }


    public void setRole(Role role) {
        this.roles.add(role);
    }
}

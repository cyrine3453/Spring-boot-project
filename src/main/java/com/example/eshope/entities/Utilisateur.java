package com.example.eshope.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
    @OneToMany (mappedBy = "utilisateur" , fetch = FetchType.EAGER)
    private Collection<Command> commandes;

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

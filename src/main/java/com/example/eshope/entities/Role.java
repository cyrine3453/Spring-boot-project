package com.example.eshope.entities;

import java.io.Serializable;
import java.util.Collection;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity@Data@AllArgsConstructor@NoArgsConstructor
public class Role implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRole;
    private String RoleName;

    @ManyToMany(mappedBy = "roles")
    private Collection<Utilisateur> utilisateurs;
}

package com.example.eshope.entities;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity@Data@AllArgsConstructor@NoArgsConstructor
public class UserInformations implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInformations;
    private String address;
    private String city;
    private String email;
    private int phoneNumber;

    @OneToOne
    private Utilisateur utilisateur;
}

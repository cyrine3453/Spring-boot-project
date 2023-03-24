package com.example.eshope.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

@Entity@Data @Getter @Setter
@AllArgsConstructor@NoArgsConstructor
public class UserInformations implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInformations;
    private String address;
    private String city;
    private String email;
    private int phoneNumber;

    @JsonBackReference
    @OneToOne
    private Utilisateur utilisateur;
}

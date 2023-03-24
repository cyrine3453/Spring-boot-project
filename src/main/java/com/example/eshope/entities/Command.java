package com.example.eshope.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data  @AllArgsConstructor @NoArgsConstructor
public class Command implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCommand;
    private LocalDateTime CommandDate;

    @JsonBackReference
    @ManyToOne
    private Utilisateur utilisateur;
    @JsonManagedReference
    @OneToMany (mappedBy = "command" , fetch = FetchType.LAZY)
    private Collection<CommandLine> commandLines;

    @JsonManagedReference
    @OneToOne (mappedBy = "command" , fetch = FetchType.LAZY)
    private Payment payment;
}

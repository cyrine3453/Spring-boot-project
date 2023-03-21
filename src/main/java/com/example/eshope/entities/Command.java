package com.example.eshope.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Collection;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data  @AllArgsConstructor @NoArgsConstructor
public class Command implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommand;
    private LocalDateTime CommandDate;

    @ManyToOne
    private Utilisateur utilisateur;
    @OneToMany (mappedBy = "command" , fetch = FetchType.LAZY)
    private Collection<CommandLine> commandLines;
    @OneToOne (mappedBy = "command" , fetch = FetchType.LAZY)
    private Payment payment;
}

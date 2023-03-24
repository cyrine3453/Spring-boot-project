package com.example.eshope.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class CommandLine implements Serializable{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCommandLine;
    private int quantity;

    @ManyToOne
    private Article article;

    @JsonBackReference
    @ManyToOne
    private Command command;

} 


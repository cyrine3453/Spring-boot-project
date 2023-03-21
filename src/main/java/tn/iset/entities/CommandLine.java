package tn.iset.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class CommandLine implements Serializable{
    public int idCommandLine;
    public int quantity;

    @ManyToOne
    public Article article;
} 


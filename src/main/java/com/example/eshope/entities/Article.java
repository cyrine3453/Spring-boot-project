package com.example.eshope.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Article implements Serializable{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idArticle;
    private String description;
    private String brand;
    private float price;

    
}

package tn.iset.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Article implements Serializable{
    public int idArticle;
    public String description;
    public String brand;
    public float price;

    
}

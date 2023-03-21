package tn.iset.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor 
public class User implements Serializable{
    public int idUser;
    public String login;
    public String password;
    public int connectionNumber;

    
}

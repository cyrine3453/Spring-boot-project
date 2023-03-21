package com.example.eshope.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity@Data@AllArgsConstructor@NoArgsConstructor
public class UserInformations implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idInformations;
    public String address;
    public String city;
    public String email;
    public String phoneNumber;
}

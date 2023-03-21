package com.example.eshope.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data@AllArgsConstructor@NoArgsConstructor
public class CreditCardPayment implements Serializable {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cardNumber;
    private LocalTime experationDate;
    public void setExperationDate(LocalDateTime now) {
    }
}

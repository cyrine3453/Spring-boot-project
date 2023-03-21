package com.example.eshope.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data@AllArgsConstructor@NoArgsConstructor

@DiscriminatorValue("CreditCard")
public class CreditCardPayment extends Payment implements Serializable {
    private String cardNumber;
    private LocalTime experationDate;
    public void setExperationDate(LocalDateTime now) {
    }
}

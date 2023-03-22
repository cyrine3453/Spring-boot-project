package com.example.eshope.entities;

import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity @Data @EqualsAndHashCode(callSuper = true)
@AllArgsConstructor@NoArgsConstructor

@DiscriminatorValue("CreditCard")
public class CreditCardPayment extends Payment {
    private String cardNumber;
    private LocalTime experationDate;
    public void setExperationDate(LocalDateTime now) {
    }
}

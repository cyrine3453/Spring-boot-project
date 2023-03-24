package com.example.eshope.entities;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity@Data @EqualsAndHashCode(callSuper = true)
@AllArgsConstructor@NoArgsConstructor

@DiscriminatorValue("Paypal")

public class PaypalPayment extends Payment implements Serializable{


    private String accountNumber;

}

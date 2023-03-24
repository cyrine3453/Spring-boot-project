package com.example.eshope.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity@Data @EqualsAndHashCode(callSuper = true)
@AllArgsConstructor @NoArgsConstructor


@DiscriminatorValue("Paypal")
public class PaypalPayment extends Payment {
    private String accountNumber;

}

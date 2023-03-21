package tn.iset.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data@AllArgsConstructor@NoArgsConstructor
public class Payment implements Serializable{
    public int idPayment;
    public float amount;
    public LocalDateTime paymentDate;
    
}

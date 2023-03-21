package com.example.eshope.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eshope.entities.CreditCardPayment;

public interface CreditCardPaymentRepository extends JpaRepository<CreditCardPayment, Integer> {
     
}

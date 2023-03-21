package com.example.eshope.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eshope.entities.PaypalPayment;

public interface PaypalPaymentRepository extends JpaRepository<PaypalPayment, Integer>{ 

}

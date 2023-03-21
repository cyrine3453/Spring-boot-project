package com.example.eshope.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eshope.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}

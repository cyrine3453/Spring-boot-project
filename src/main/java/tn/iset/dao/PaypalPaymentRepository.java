package tn.iset.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.iset.entities.PaypalPayment;

public interface PaypalPaymentRepository extends JpaRepository<PaypalPayment, String> {
    
}

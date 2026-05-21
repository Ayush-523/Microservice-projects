package com.example.service;

import com.example.entity.Payment;
import com.example.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    public Payment doPayment(Payment payment){

        payment.setPaymentStatus("success");

        payment.setTransactionId(UUID.randomUUID().toString());

        return repository.save(payment);
    }
}
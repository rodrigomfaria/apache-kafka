package com.rmf.payment_service.service;

import com.rmf.payment_service.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
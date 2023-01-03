package com.encora.javafschallenge.service;

import java.math.BigDecimal;

public class PaymentService extends StockService {
    public boolean processPayment(String userEmail, Long orderId, BigDecimal value) {
        //We don't care about the business logic here since the main focus
        //is refactoring CheckoutService
        return true;
    }
}

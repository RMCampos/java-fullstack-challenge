package com.encora.javafschallenge.service;

import com.encora.javafschallenge.repository.entity.Item;

public class StockService extends EmailService {
    public Long updateStock(Item item, Long amount) {
        //We don't care about the business logic here since the main focus
        //is refactoring CheckoutService
        return amount--;   
    }
}

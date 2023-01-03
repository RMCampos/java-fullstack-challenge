package com.encora.javafschallenge.repository;

import com.encora.javafschallenge.repository.entity.Order;

public class OrderRepository {
    public Order saveOrder() throws Exception {
        //We don't care about the business logic here since the main focus
        //is refactoring CheckoutService.
        //In this case, we can assume that Order will be returned with the
        //needed properties.
        return new Order();
    }
}

package com.encora.javafschallenge.service;

import java.util.Map;


import com.encora.javafschallenge.repository.OrderRepository;
import com.encora.javafschallenge.repository.entity.Item;
import com.encora.javafschallenge.repository.entity.Order;

//** Challenge **
//Refactor CheckoutService in a way that all the extensions (chained inheritance)
//get eliminated.
public class CheckoutService extends PaymentService {

    private OrderRepository orderRepository;
    
    public void placeOrder(String userEmail, Map<Item, Long> itemOrder) {

        Order order;
        try {
            order = orderRepository.saveOrder();
            if (processPayment(userEmail, order.id, order.value)) {
                itemOrder.keySet().forEach(k -> {
                    updateStock(k, itemOrder.get(k));
                });
                sendOrderConfirmation(userEmail, order);
            }
        } catch (Exception e) {
            //TO-DO: Create an specific Exception and handle it properly.
        }
    }
}
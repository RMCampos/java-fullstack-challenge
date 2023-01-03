package com.encora.javafschallenge.repository.entity;

import java.math.BigDecimal;
import java.util.Set;

public class Order {
    public Long id;
    public BigDecimal value;
    public Set<Item> items;
}

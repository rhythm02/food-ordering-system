package com.assignment.foodOrderingSystem.model;

import com.assignment.foodOrderingSystem.service.Cart;
import lombok.Getter;

@Getter

public class Customer {
    private int customerId;
    private String customerName;
    private Cart cart;

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.cart = new Cart();
    }
}

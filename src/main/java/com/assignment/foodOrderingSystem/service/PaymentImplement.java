package com.assignment.foodOrderingSystem.service;

import com.assignment.foodOrderingSystem.model.Customer;

import java.util.HashMap;

public class PaymentImplement implements Payment{
    @Override
    public int calculateTotal(Customer customer) {
        int totalCost = 0;
        for (HashMap.Entry<String, Integer> entry : customer.getCart().getCart().entrySet()
             ) {
            totalCost += entry.getValue();
        }
        return totalCost;
    }
}

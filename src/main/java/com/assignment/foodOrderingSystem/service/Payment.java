package com.assignment.foodOrderingSystem.service;

import java.util.HashMap;

class Payment {
    int calculateTotal(Cart cart) {
        int totalCost = 0;
        for (HashMap.Entry<String, Integer> entry : cart.getCart().entrySet()
             ) {
            System.out.println("payment: "+entry.getValue());
            totalCost += entry.getValue();
        }
        return totalCost;
    }
}

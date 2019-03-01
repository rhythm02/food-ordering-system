package com.assignment.foodOrderingSystem.service;

import com.assignment.foodOrderingSystem.model.Customer;
import com.assignment.foodOrderingSystem.model.Request;

import java.io.IOException;

public interface PlaceOrder {
    void addOrder(Request request, Customer customer);
    void removeOrder(String foodItem, Customer customer);
    void updateQuantity(Request request, Customer customer);
    int checkout(Customer customer);
}

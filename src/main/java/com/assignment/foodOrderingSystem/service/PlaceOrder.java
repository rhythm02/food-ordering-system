package com.assignment.foodOrderingSystem.service;

import com.assignment.foodOrderingSystem.model.Customer;
import com.assignment.foodOrderingSystem.model.Request;

import java.io.IOException;

public interface PlaceOrder {
    public void addOrder(Request request);
    public int checkout(Customer customer);
}

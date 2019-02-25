package com.assignment.foodOrderingSystem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.Map;

@Getter
@AllArgsConstructor
public class Customer {
    private int customerId;
    private String customerName;
    private Cart cart;
}

package com.assignment.foodOrderingSystem.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Request {
    String hotelName;
    Cuisine cuisine;
    String foodItem;
    int quantity;
}

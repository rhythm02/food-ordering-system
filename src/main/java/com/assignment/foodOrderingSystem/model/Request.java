package com.assignment.foodOrderingSystem.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Request {
    String hotelName;
    Cuisine cuisine;
    String foodItem;
    int quantity;
}

package com.assignment.foodOrderingSystem.service;

import com.assignment.foodOrderingSystem.model.Hotel;
import com.assignment.foodOrderingSystem.model.Menu;
import com.assignment.foodOrderingSystem.model.Request;
import lombok.Getter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class Cart {
    private Map<String, Integer> cart;
    private Menu menu;

    public Cart() {
        menu = new Menu();
        cart = new HashMap<>();
    }

    void addItem(Request request, List<Hotel> hotelList) {
        for (Hotel hotel:hotelList) {
            if(hotel.getName().equals(request.getHotelName())) {
                int itemPrice = hotel.getMenu().getRateCard().get(request.getCuisine()).get(request.getFoodItem())*request.getQuantity();
                cart.put(request.getFoodItem(), itemPrice);
            }
        }
    }

    void removeItem(String foodItem) {
        cart.remove(foodItem);
    }

    void updateQuantity(Request request, List<Hotel> hotelList) {
        cart.remove(request.getFoodItem());
        addItem(request, hotelList);
        }
    }

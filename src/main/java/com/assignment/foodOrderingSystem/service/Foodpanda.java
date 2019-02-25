package com.assignment.foodOrderingSystem.service;

import com.assignment.foodOrderingSystem.model.*;
import lombok.AllArgsConstructor;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Foodpanda implements PlaceOrder {
   private Customer customer;
   private HotelList hotelList;
   private int OrderId;

   public Foodpanda(Customer customer) {
       this.customer = customer;
       OrderId = 100+customer.getCustomerId();
       hotelList = new HotelList();
   }

    @Override
    public void addOrder(Request request) {
        for (Hotel hotel :hotelList.getHotels()
             ) {
            if(hotel.getName() == request.getHotelName()){
                if(hotel.getMenu().getRateCard().containsKey(request.getCuisine())) {
                    Cuisine cuisine = request.getCuisine();
                    String foodItem = request.getFoodItem();
                    int quantity = request.getQuantity();
                    customer.getCart().addItem(hotel.getName(), cuisine, foodItem, quantity);
                }
            }
        }

    }

    @Override
    public int checkout(Customer customer) {
        return(new PaymentImplement().calculateTotal(customer));

    }

        /* for (HashMap.Entry<String, Integer> entry:request.getRequestItems().entrySet()
        ) {
            String foodItem = entry.getKey();
            System.out.println(entry.getKey());

            int quantity = entry.getValue();
            customer.getCart().removeItem(foodItem, quantity);
        }*/
}

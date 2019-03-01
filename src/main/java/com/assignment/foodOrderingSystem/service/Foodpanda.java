package com.assignment.foodOrderingSystem.service;

import com.assignment.foodOrderingSystem.model.*;

public class Foodpanda implements PlaceOrder {
   private ManageHotels manageHotels;

   Foodpanda(ManageHotels manageHotels) {
       this.manageHotels = manageHotels;
   }

    @Override
    public void addOrder(Request request, Customer customer) {
        for (Hotel hotel :manageHotels.hotelList) {
            if(hotel.getName().equals(request.getHotelName())
                  && hotel.getMenu().getRateCard().containsKey(request.getCuisine())) {
                customer.getCart().addItem(request, manageHotels.hotelList);
            }
        }
    }

    @Override
    public void removeOrder(String foodItem, Customer customer) {
        for (Hotel hotel :manageHotels.hotelList) {
                customer.getCart().removeItem(foodItem);
        }
    }

    @Override
    public void updateQuantity(Request request, Customer customer) {
        customer.getCart().updateQuantity(request, manageHotels.hotelList);
    }

    @Override
    public int checkout(Customer customer) {
        return(new Payment().calculateTotal(customer.getCart()));
    }

}

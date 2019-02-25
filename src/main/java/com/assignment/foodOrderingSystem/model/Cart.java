package com.assignment.foodOrderingSystem.model;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class Cart {
    private Map<String, Integer> cart;
    private Menu menu;
    private HotelList hotelList;

    public Cart(){
        menu = new Menu();
        cart = new HashMap<>();
        hotelList= new HotelList();
    }

    public void addItem(String hotelName, Cuisine cuisine, String foodItem, int quantity) {
        if(menu.getRateCard().containsKey(cuisine))
        {//                    int itemPrice = hotel.getMenu().getRateCard().get(cuisine).get(foodItem)*quantity;

            for (Hotel hotel:hotelList.getHotels()
                 ) {
                if(hotel.getName() == hotelName) {
                    int itemPrice = hotel.getMenu().getRateCard().get(cuisine).get(foodItem)*quantity;
                    cart.put(foodItem, itemPrice);
                    System.out.println(itemPrice);


                }

            }
           /* int itemPrice = menu.getRateCard().get(cuisine).get(foodItem)*quantity;
            cart.put(foodItem, itemPrice);
            System.out.println(itemPrice);*/
        }
    }

    /*public void removeItem(String foodItem, int quantity) {
        if(cart.containsKey(foodItem))
        {
            if(quantity == 0) {
                cart.remove(foodItem);
                System.out.println(foodItem + " removed from cart.");
            }
            else {
                cart.remove(foodItem);
                addItem(foodItem,quantity);
            }
        }
        else{
            System.out.println("No such item in the cart");
        }
    }*/
}

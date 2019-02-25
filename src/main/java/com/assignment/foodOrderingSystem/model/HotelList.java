package com.assignment.foodOrderingSystem.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Getter
@EqualsAndHashCode
public class HotelList {
    private Hotel kfc;
    private Hotel dominos;
    private Menu kfcMenu;
    private Menu dominosMenu;
    private List<Hotel> hotels;

    public HotelList(){
        kfcMenu = new Menu();
        kfcMenu.getItalian().put("Pizza",350);
        kfcMenu.getItalian().put("Pasta",180);
        kfcMenu.getItalian().put("Burger",110);
        kfcMenu.getNorthIndian().put("Chapati",12);
        kfcMenu.getNorthIndian().put("Butter Paneer",310);
        kfcMenu.getNorthIndian().put("Dal",100);
        kfcMenu.getNorthIndian().put("Mushroom",290);
        kfcMenu.getChinese().put("Noodles",150);
        kfcMenu.getChinese().put("Veg Crispy",170);

        dominosMenu = new Menu();
        dominosMenu.getItalian().put("Pizza", 400);
        dominosMenu.getItalian().put("Pasta", 220);
        dominosMenu.getItalian().put("Burger", 150);
        dominosMenu.getNorthIndian().put("Dal", 120);
        dominosMenu.getNorthIndian().put("Butter Paneer", 350);
        dominosMenu.getNorthIndian().put("Mushroom", 310);
        dominosMenu.getChinese().put("Noodles", 190);
        dominosMenu.getChinese().put("Veg Crispy", 175);

        kfc = new Hotel("KFC", kfcMenu);
        dominos = new Hotel("Dominos", dominosMenu);

        hotels = new ArrayList<>();
        hotels.add(kfc);
        hotels.add(dominos);
    }



}

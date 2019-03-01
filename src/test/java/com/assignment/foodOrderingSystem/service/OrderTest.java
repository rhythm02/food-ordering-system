package com.assignment.foodOrderingSystem.service;

import com.assignment.foodOrderingSystem.model.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class OrderTest {


     ManageHotels manageHotels;
     static Menu kfcMenu;
     static Menu dominosMenu;

    @BeforeClass
    public static void setup() {

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

    }

    @Before
    public void init(){
        manageHotels = new ManageHotels();
        Hotel kfc = new Hotel("KFC", kfcMenu);
        Hotel dominos = new Hotel("Dominos", dominosMenu);

        manageHotels.addHotel(kfc);
        manageHotels.addHotel(dominos);
    }

    @Test
    public void foodpandaTest(){
        Customer customer = new Customer(1, "John");
        Foodpanda foodpanda = new Foodpanda(manageHotels);

        foodpanda.addOrder(new Request("Dominos", Cuisine.CHINESE, "Noodles", 2), customer);
        foodpanda.addOrder(new Request("Dominos", Cuisine.NORTH_INDIAN, "Butter Paneer", 1), customer);
        foodpanda.addOrder(new Request("KFC", Cuisine.ITALIAN, "Pizza", 3), customer);

        foodpanda.removeOrder("Pizza", customer);

        foodpanda.updateQuantity(new Request("Dominos", Cuisine.NORTH_INDIAN, "Butter Paneer", 4), customer);

        Assert.assertEquals(1780, foodpanda.checkout(customer));
    }

    @Before
    public void init2(){
        manageHotels = new ManageHotels();
        Hotel kfc = new Hotel("KFC", kfcMenu);
        Hotel dominos = new Hotel("Dominos", dominosMenu);

        manageHotels.addHotel(kfc);
        manageHotels.addHotel(dominos);
    }

    @Test
    public void foodpandaTest2(){
        Customer customer = new Customer(2, "John");
        Foodpanda foodpanda = new Foodpanda(manageHotels);

        foodpanda.addOrder(new Request("Dominos", Cuisine.CHINESE, "Veg Crispy", 2), customer);
        foodpanda.addOrder(new Request("KFC", Cuisine.NORTH_INDIAN, "Butter Paneer", 2), customer);
        foodpanda.addOrder(new Request("KFC", Cuisine.ITALIAN, "Pizza", 5), customer);

        foodpanda.removeOrder("Butter Paneer", customer);

        foodpanda.updateQuantity(new Request("KFC", Cuisine.ITALIAN, "Pizza", 3), customer);

        Assert.assertEquals(1400, foodpanda.checkout(customer));
    }


}
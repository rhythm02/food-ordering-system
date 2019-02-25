package com.assignment.foodOrderingSystem.service;

import com.assignment.foodOrderingSystem.model.Cart;
import com.assignment.foodOrderingSystem.model.Cuisine;
import com.assignment.foodOrderingSystem.model.Customer;
import com.assignment.foodOrderingSystem.model.Request;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderTest {

    Customer customer;
    Cart cart;
    @Before
    public void init(){
        cart = new Cart();
    }

    @Test
    public void foodpandaTest(){
        customer =new Customer(1, "John", cart);
        Foodpanda foodpanda = new Foodpanda(customer);
        foodpanda.addOrder(new Request("Dominos", Cuisine.CHINESE, "Noodles", 2));
        foodpanda.addOrder(new Request("Dominos", Cuisine.NORTH_INDIAN, "Butter Paneer", 1));
        foodpanda.addOrder(new Request("KFC", Cuisine.ITALIAN, "Pizza", 3));

        Assert.assertEquals(1780, foodpanda.checkout(customer));

    }
}
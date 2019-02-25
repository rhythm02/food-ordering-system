package com.assignment.foodOrderingSystem.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@EqualsAndHashCode
public class Menu {
    private Map<Cuisine, Map<String, Integer>> rateCard = new HashMap<>();
    private Map<String, Integer> italian = new HashMap<>();
    private Map<String, Integer> northIndian = new HashMap<>();
    private Map<String, Integer> chinese = new HashMap<>();
    public Menu() {
        rateCard.put(Cuisine.ITALIAN, italian);
        rateCard.put(Cuisine.CHINESE, chinese);
        rateCard.put(Cuisine.NORTH_INDIAN, northIndian);
    }

    public void displayMenu(Hotel hotel) {
        System.out.println("----Menu----");

       /* for (HashMap.Entry<String, Integer> entry : rateCard.entrySet()
        ) {
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }*/
    }

}

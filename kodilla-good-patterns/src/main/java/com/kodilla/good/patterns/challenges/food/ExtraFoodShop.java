package com.kodilla.good.patterns.challenges.food;


import com.kodilla.good.patterns.challenges.food.FoodProducers;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements FoodProducers {
    @Override
    public Map<String,Integer> products() {
        Map<String, Integer> productList = new HashMap<>();
        productList.put("Burger black", 25);

        return productList;
    }

    @Override
    public void inform() {
        System.out.println("I am a ExtraFoodShop");
    }


    @Override
    public void process() {
        System.out.println("Trwa proces dodawania produktu");
    }

    @Override
    public boolean contractExecuted() {
        return true;
    }
}
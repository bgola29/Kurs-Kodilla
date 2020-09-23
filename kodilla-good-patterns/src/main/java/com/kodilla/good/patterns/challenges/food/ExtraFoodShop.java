package com.kodilla.good.patterns.challenges.food;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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
    public void process(String enterProduct) {
        System.out.println("the purchase is in progress :"+ enterProduct);
    }

    @Override
    public boolean contractExecuted() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
package com.kodilla.good.patterns.challenges.food;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HealthyShop implements FoodProducers{

    @Override
    public void inform() {
        System.out.println("I am a Healthy Shop");
    }

    @Override
    public Map<String, Integer> products() {
       Map<String , Integer> productList = new HashMap<>();
       productList.put("vegetable salad" , 20);
       productList.put("egg cutlet", 15);
       return productList;
    }

    @Override
    public void process(String enterProduct) {
        System.out.println("Trwa proces zakupu :" + enterProduct);
    }

    @Override
    public boolean contractExecuted() {
        Random random = new Random();
        return random.nextBoolean();
    }
}

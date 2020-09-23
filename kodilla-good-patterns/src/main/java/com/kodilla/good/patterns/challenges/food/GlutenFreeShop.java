package com.kodilla.good.patterns.challenges.food;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GlutenFreeShop implements FoodProducers {

    @Override
    public void inform() {
        System.out.println("I am a Gluten free shop");
    }

    @Override
    public Map<String, Integer> products() {
        Map<String, Integer> productList = new HashMap<>();
        productList.put("cream soup with white vegetables", 54);

        return productList;
    }

    @Override
    public void process(String enterProduct) {
        System.out.println("trwa proces zakupu :" + enterProduct);
    }

    @Override
    public boolean contractExecuted() {
        Random random = new Random();
        return random.nextBoolean();
    }
}

package com.kodilla.good.patterns.challenges.food;

import java.util.Map;

public interface FoodProducers {
    void inform();

    Map<String,Integer> products();

    void process();

    boolean contractExecuted();

}

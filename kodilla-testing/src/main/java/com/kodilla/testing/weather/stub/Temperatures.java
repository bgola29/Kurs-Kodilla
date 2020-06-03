package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public interface Temperatures {
    //pierwszy element Mapy jest identyfikatorem danej stacji
    //drugi element mapy jest temperatura w stopcniach celcjusza


    HashMap<Integer, Double> getTemperatures();

}

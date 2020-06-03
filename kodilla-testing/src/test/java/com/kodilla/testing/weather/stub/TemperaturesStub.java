package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public class TemperaturesStub implements Temperatures{

    @Override
    public HashMap<Integer, Double> getTemperatures() {
        HashMap<Integer , Double>stubResult = new HashMap<>();

        //dummy
        stubResult.put(0 ,23.1);
        stubResult.put(1 ,24.5);
        stubResult.put(2 ,25.3);
        stubResult.put(3 ,22.7);
        stubResult.put(4 ,24.4);

        return stubResult;
    }
}

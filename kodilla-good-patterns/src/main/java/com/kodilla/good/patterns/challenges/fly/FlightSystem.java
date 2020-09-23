package com.kodilla.good.patterns.challenges.fly;

import java.util.List;

public interface FlightSystem {

    List<String> lotyZPodanegoMiasta(String miastoZ);
    List<String> lotyDoPodanegoMiasta(String miastoDo);
    List<String> lotyPrzez(String miastoZ , String miastoDo);
}

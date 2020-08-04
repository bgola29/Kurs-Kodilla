package com.kodilla.exception.test;

import java.util.HashMap;

public class Search {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> searchFlight = new HashMap<>();
        searchFlight.put("Spain", true);
        searchFlight.put("Poland", false);
        boolean result = searchFlight.getOrDefault(flight.arrivalAirport , false);
        if(!result){
            throw new RouteNotFoundException();
        }
        return result;

    }
}
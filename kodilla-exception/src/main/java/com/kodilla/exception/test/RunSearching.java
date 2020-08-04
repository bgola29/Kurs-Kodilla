package com.kodilla.exception.test;

public class RunSearching {
    public static void main (String args[]){
        Flight flight1 = new Flight("Warsaw" , "Spain");
        Search search = new Search();
        try {
            search.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("trasa nie istnieje");
        }
    }
}

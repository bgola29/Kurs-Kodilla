package com.kodilla.stream.word;


import java.util.ArrayList;
import java.util.List;

public class Continent {
    // tworze liste krajow w liscie country ma byc jako parametr utworzyc getter
    List<Country> countryList = new ArrayList<>();

    public List<Country> getCountryList() {
        return countryList;
    }

    public boolean addingCountry(Country country) {
        return countryList.add(country);
    }
}

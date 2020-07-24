package com.kodilla.stream.word;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Word {
    List<Continent> continentList = new ArrayList<>();

    public List<Continent> getContinentList(Continent continent) {
        return continentList;
    }

    public BigDecimal getPeopleQuantity() {
        return continentList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(country -> country.getNumberOfPeople())
                .reduce(BigDecimal.ZERO, (sum, i) -> sum = sum.add(i));
    }

    public boolean addingContinents(Continent continent) {
        return continentList.add(continent);
    }
}


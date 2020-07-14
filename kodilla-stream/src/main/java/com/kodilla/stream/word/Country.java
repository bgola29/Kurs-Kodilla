package com.kodilla.stream.word;

import java.math.BigDecimal;

public class Country {
    BigDecimal numberOfPeople;

    public Country(BigDecimal numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public BigDecimal getNumberOfPeople() {
        return numberOfPeople;
    }
}

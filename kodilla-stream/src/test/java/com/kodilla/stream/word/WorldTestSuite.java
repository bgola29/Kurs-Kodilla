package com.kodilla.stream.word;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;


public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        // Given
        Word word = new Word();
        Continent europe = new Continent();
        word.addingContinents(europe);
        Country poland = new Country(new BigDecimal("123"));
        Country england = new Country(new BigDecimal("52"));
        Country spain = new Country(new BigDecimal("12"));
        europe.addingCountry(poland);
        europe.addingCountry(england);
        europe.addingCountry(spain);
        Continent americaPn = new Continent();
        word.addingContinents(americaPn);
        Country usa = new Country(new BigDecimal(1));
        Country canada = new Country(new BigDecimal(1));
        Country alaska = new Country(new BigDecimal(1));
        americaPn.addingCountry(usa);
        americaPn.addingCountry(canada);
        americaPn.addingCountry(alaska);
        // When
        BigDecimal result = word.getPeopleQuantity();

        // Then
        Assert.assertEquals(new BigDecimal("190") , result);
    }
}

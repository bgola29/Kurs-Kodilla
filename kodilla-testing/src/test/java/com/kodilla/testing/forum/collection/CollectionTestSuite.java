package com.kodilla.testing.forum.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test begin : ");
    }

    @After
    public void after() {
        System.out.println("Test end : ");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbers = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();

        //When
        ArrayList<Integer> result = oddNumbers.exterminate(emptyList);

        //Then
        assertEquals(0, result.size());
    }

    @Test
    public void testOddNumbersExterminatorList() {
        //Given
        OddNumbersExterminator oddNumbers = new OddNumbersExterminator();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(10);
        list.add(13);

        //When
        ArrayList<Integer> result = oddNumbers.exterminate(list);

        //Then
        ArrayList<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(4);
        expectedList.add(10);
        assertEquals(expectedList, result);
    }


}

package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {


    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> oddNumberExxterminator = new ArrayList<Integer>();
        for (
                Integer n : numbers) {

            if (n % 2 == 0) oddNumberExxterminator.add(n);
        }
        return oddNumberExxterminator;
    }
}

package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int testingAdd = calculator.add(23, 25);
        int testingSubtract = calculator.subtract(45, 15);
        if (testingAdd == 48) {
            System.out.println("Test calculator is ok");
        } else {
            System.out.println("Calculator tes has error");
        }
        if (testingSubtract == 30) {
            System.out.println("Test two calculator is ok");
        } else {
            System.out.println("Calculator test two has error");
        }
    }
}

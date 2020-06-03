package com.kodilla.testing.shape;

public class Circle implements Shape {
    int c;

    public Circle(int c) {
        this.c = c;
    }

    @Override
    public void getShapeName() {
        System.out.println();
    }

    @Override
    public void getField() {
        double pI = 3.1415;
        double result = pI * (c * 2);
        System.out.println(result);
    }
}

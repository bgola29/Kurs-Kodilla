package com.kodilla.testing.shape;

public class Triangle implements Shape{
    int b;
    int h;

    public Triangle(int b, int h) {
        this.b = b;
        this.h = h;
    }

    @Override
    public void getShapeName() {
        System.out.println();
    }

    @Override
    public void getField() {
        double result = (b * h) % 2;
        System.out.println(result);
    }
}
package com.kodilla.testing.shape;

public class Square implements Shape{

    int a;

    public Square(int a) {
        this.a = a;
    }
    @Override
    public void getShapeName(){
        System.out.println("Square");
    }
    @Override
    public void getField(){
        int result = a * 2;
        System.out.println(result);
    }
}

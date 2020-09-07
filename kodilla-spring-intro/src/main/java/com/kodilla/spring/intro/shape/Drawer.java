package com.kodilla.spring.intro.shape;

public class Drawer {
    Shape shape;

    public Drawer(final Shape shape) {
        this.shape = shape;
    }

    public String doDrawer(){
        return shape.draw();
    }
}

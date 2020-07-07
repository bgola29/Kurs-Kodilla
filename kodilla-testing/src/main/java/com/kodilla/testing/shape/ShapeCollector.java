package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> geometricFigures = new ArrayList<>();

    public boolean addFigure(Shape shape) {
        return geometricFigures.add(shape);
    }

    public boolean removeFigure(Shape shape) {return geometricFigures.remove(shape); }

    public Shape getFigure(int n) {return geometricFigures.get(n);}
}


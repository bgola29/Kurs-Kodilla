package com.kodilla.testing.shape;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ShapeCollectorTestSuite {


    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2);
        //When
        boolean addFigureResult = shapeCollector.addFigure(circle);
        //Then
        assertTrue(addFigureResult);
    }
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(2 , 21);
        //When
        boolean removeFigureResult = shapeCollector.removeFigure( triangle);
        //Then
        assertTrue(removeFigureResult);
    }
    @Test
    public void testGetFigure(){
        //Given trzba pozmieniac pod getFigure
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(4);
        //When
        boolean addFigureResult = shapeCollector.addFigure(circle);
        //Then
        assertTrue(addFigureResult);

    }
}

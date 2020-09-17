package com.kodilla.spring;

import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import org.apache.catalina.core.ApplicationContext;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTestSuite {
    @Test
    public void testCircleLoadedIntoContainer() {
        //Given
        // ApplicationContext context =
        //       new AnnotationConfigApplicationContext("com.kodilla.spring");
        //  Shape shape = context.getBean(Circle.class);
        //When
        //  String name = shape.getShapeName();
        //Then
        // Assert.assertEquals("This is a circle.", name);
    }
}

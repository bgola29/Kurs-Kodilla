package com.kodilla.spring.shape;

import org.springframework.stereotype.Controller;

@Controller
public class Triangle implements Shape{
    @Override
    public String getShapeName() {
        return "this is a triangle";
    }
}

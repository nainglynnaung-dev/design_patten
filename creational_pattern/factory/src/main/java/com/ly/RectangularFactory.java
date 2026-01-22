package com.ly;

public class RectangularFactory extends ShapeFactory{
    @Override
    Shape draw() {
        return new RectangularShape();
    }
}

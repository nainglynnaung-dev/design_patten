package com.ly;

public class CircularFactory extends ShapeFactory{
    @Override
    Shape draw() {
        return new CircleShape();
    }


}

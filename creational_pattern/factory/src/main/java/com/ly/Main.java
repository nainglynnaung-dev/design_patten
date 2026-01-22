package com.ly;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new CircularFactory();
        CircleShape circleShape= (CircleShape) shapeFactory.draw();
        RectangularShape rectangularShape=new RectangularShape();
        System.out.println(circleShape.draw());
        System.out.println(rectangularShape.draw());

        System.out.println("How are you!!!!!");
        }
}
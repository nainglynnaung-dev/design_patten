package com.ly;

public class SimpleCoffee implements Coffee{
    @Override
    public String description() {
        return "simple coffee";
    }

    @Override
    public double cost() {
        return 0;
    }
}

package com.ly;

public class SugarDecorator extends CoffeeDecorator{


    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost()+200;
    }


    @Override
    public String description() {
        return super.description()+", sugar";
    }
}

package com.ly;

// Component interface
interface Coffee {
    String getDescription();
    double getCost();
}

// Concrete component
class SimpleCoffee implements Coffee {
    public String getDescription() { return "Simple coffee"; }
    public double getCost() { return 5.0; }
}

// Decorator
abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }
    public String getDescription() { return decoratedCoffee.getDescription(); }
    public double getCost() { return decoratedCoffee.getCost(); }
}

// Concrete decorators
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) { super(coffee); }
    public String getDescription() { return super.getDescription() + ", milk"; }
    public double getCost() { return super.getCost() + 1.5; }
}

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) { super(coffee); }
    public String getDescription() { return super.getDescription() + ", sugar"; }
    public double getCost() { return super.getCost() + 0.5; }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription()); // Simple coffee, milk, sugar
        System.out.println(coffee.getCost());        // 7.0
    }
}

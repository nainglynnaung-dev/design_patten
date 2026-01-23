package com.ly;

class Main2{
    public static void main(String[] args){
        System.out.println("How are you? Good morning");
        Coffee2 coffee2=new SimpleCoffee2();
        coffee2=new MilkDecorator2(coffee2);
        coffee2=new SugerDecorator2(coffee2);
        System.out.println(coffee2.cost());
        System.out.println(coffee2.description());
    }
}

interface Coffee2{
    String description();
    double cost();
}

class SimpleCoffee2 implements Coffee2{
    @Override
    public String description() {
        return "Simple Coffee2";
    }

    @Override
    public double cost() {
        return 2.5;
    }
}

abstract class CoffeeDecorator2 implements Coffee2{
   protected Coffee2 decorated;

   public CoffeeDecorator2(Coffee2 coffee2){
       this.decorated=coffee2;
   }

    @Override
    public String description() {
        return decorated.description();
    }

    @Override
    public double cost() {
        return decorated.cost();
    }
}


class SugerDecorator2 extends CoffeeDecorator2{

    public SugerDecorator2(Coffee2 coffee2) {
        super(coffee2);
    }

    @Override
    public String description() {
        return super.description()+" ,suger";
    }

    @Override
    public double cost() {
        return super.cost()+ 0.5;
    }
}

class MilkDecorator2 extends CoffeeDecorator2{
    public MilkDecorator2(Coffee2 coffee2){
        super(coffee2);
    }

    @Override
    public String description() {
        return super.description() + " ,milk";
    }

    @Override
    public double cost() {
        return super.cost() +0.5;
    }
}
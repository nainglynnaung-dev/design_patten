package com.ly;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Coffee coffee=new SimpleCoffee();
       coffee=new MilkDecorator(coffee);
       coffee=new SugarDecorator(coffee);
       System.out.println(coffee.description());
       System.out.println(coffee.cost());
    }
}
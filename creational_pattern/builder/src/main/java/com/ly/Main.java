package com.ly;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product=new ProductBuilder().create().addName("Food").addDescription("I wanna to eat").addInstant(new Date().toInstant()).addPrice(200).addQuantity(20).build();
        System.out.println(product.toString());
    }
}
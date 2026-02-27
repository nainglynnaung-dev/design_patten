package com.ly;

public class CreditCardPayement implements Payment{
    @Override
    public void process(double amount) {
        System.out.println("Credit Card Payement "+amount);
    }
}

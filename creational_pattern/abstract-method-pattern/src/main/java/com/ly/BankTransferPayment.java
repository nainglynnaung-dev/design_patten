package com.ly;

public class BankTransferPayment implements Payment{
    @Override
    public void process(double amount) {
        System.out.println("Bank Transfer Payment "+amount);
    }
}

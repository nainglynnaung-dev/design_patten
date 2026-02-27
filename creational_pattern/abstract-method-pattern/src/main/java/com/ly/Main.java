package com.ly;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor;;
        String userChoice="Credit";
        if (userChoice.equals("Credit")){
            paymentProcessor = new CreditCardProcessor();
        }else{
            paymentProcessor = new BankTransferProcessor();
        }
        paymentProcessor.executePayment(100);
    }
}
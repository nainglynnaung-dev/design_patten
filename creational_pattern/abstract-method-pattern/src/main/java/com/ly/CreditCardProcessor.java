package com.ly;

public class CreditCardProcessor extends PaymentProcessor{
    @Override
    public Payment createPayment() {
        return new CreditCardPayement();
    }
}

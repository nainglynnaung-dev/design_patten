package com.ly;

public abstract class PaymentProcessor {

    public abstract Payment createPayment();


    public void executePayment(double amount){
        Payment payment = createPayment();
        payment.process(amount);
    }
}

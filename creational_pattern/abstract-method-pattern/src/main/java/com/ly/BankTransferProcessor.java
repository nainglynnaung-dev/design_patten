package com.ly;

public class BankTransferProcessor extends PaymentProcessor{
    @Override
    public Payment createPayment() {
        return new BankTransferPayment();
    }
}

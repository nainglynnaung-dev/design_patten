package com.nk.ly;

public class CreditCardPayment implements PaymentStrategy{

	@Override
	public void collectinDetails() {
		System.out.println("Data collection is sucessfully");
		
	}

	@Override
	public void pay() {
		System.out.println("Payment is successfully");
		
	}

}

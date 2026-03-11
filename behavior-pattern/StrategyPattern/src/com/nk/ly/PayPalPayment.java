package com.nk.ly;

public class PayPalPayment implements PaymentStrategy{

	@Override
	public void collectinDetails() {
		System.out.println("Login PayPal Account.......============>");
		
	}

	@Override
	public void pay() {
		System.out.println("PayPal amount paid sussfully");
		
	}

}

package com.nk.ly;

public class ShoppingCart {
	
	private PaymentStrategy paymentStrategy;
	
	public void setPaymentStrategy(PaymentStrategy payment) {
		this.paymentStrategy=payment;
	}

	public void checkout(int amount) {
		paymentStrategy.collectinDetails();
		paymentStrategy.pay();
	}
}

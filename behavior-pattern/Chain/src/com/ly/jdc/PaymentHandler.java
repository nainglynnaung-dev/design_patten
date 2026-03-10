package com.ly.jdc;

public abstract class PaymentHandler {
	
	protected PaymentHandler next;
	
	public void setNext(PaymentHandler handler) {
		this.next=handler;
	}
	
	public abstract void authorize(double amount);

}

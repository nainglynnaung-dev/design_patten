package com.ly.jdc;

public class BasicAuth extends PaymentHandler{
	

	@Override
	public void authorize(double amount) {
		// TODO Auto-generated method stub
		if(amount<=1000) {
			System.out.println("Basic Authorization....");
		}
		else {
			next.authorize(amount);
		}
	}
	
	

}

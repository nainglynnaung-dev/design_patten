package com.ly.jdc;

public class ManagerAuth extends PaymentHandler{
	

	@Override
	public void authorize(double amount) {
		if(amount<=5000) {
			System.out.println("Manager Authorization....");
		}else {
			next.authorize(amount);
		}
		
	}

}

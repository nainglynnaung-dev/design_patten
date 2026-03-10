package com.ly.jdc;

public class Main {
	
	public static void main(String[] args) {
		PaymentHandler h1=new BasicAuth();
		PaymentHandler manager=new ManagerAuth();
		
		h1.setNext(manager);
		h1.authorize(500);
		h1.authorize(3000);
	}

}

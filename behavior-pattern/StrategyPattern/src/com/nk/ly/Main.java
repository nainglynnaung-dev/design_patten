package com.nk.ly;

public class Main {

	public static void main(String[] args) {
		ShoppingCart shoppingCard=new ShoppingCart();
		shoppingCard.setPaymentStrategy(new CreditCardPayment());
		shoppingCard.checkout(200);
		
		shoppingCard.setPaymentStrategy(new PayPalPayment());
		shoppingCard.checkout(300);
		
	}
}

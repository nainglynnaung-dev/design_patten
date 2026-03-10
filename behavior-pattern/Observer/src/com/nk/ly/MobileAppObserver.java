package com.nk.ly;

public class MobileAppObserver implements Observer{
	
	private String name;
	
	public MobileAppObserver(String name) {
		this.name=name;
	}

	@Override
	public void update(String stock, double price) {
		System.out.println("this is "+stock +" and "+price);
	}

}

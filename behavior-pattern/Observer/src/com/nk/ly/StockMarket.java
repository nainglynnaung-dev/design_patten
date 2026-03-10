package com.nk.ly;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Subject{
	
	private List<Observer> observers=new ArrayList<>();
	private double price;
	private String symbol;
	
	public void setPrice(String symbol,double price) {
		this.symbol=symbol;
		this.price=price;
		notifyObservers();
		
	}
	

	@Override
	public void notifyObservers() {
		for(var o:observers) {
			o.update(symbol, price);
		}
		
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
		
	}

}

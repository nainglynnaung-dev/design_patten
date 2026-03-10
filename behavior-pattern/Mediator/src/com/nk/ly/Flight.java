package com.nk.ly;

public abstract class Flight {
	
	protected ATCMediator atc;
	protected String flightNumber;
	
	public Flight(ATCMediator me,String lfightNumber) {
		this.atc=me;
		this.flightNumber=lfightNumber;
	}
	
	public abstract void send(String message);
	public abstract void receive(String emssage);

}

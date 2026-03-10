package com.nk.ly;

public class CommercialFlight extends Flight{

	public CommercialFlight(ATCMediator me, String lfightNumber) {
		super(me, lfightNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send(String message) {
		System.out.println(flightNumber + "Sends "+message);
         atc.sendMessage(message, this);
		
	}

	@Override
	public void receive(String emssage) {
		System.out.println(flightNumber +"Receives " + emssage);
		
	}

}

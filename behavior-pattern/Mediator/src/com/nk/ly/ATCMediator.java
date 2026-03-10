package com.nk.ly;

public interface ATCMediator {
	
	public void registerFlight(Flight flight);
	public void sendMessage(String Message,Flight ori);

}

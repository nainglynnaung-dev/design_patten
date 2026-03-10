package com.nk.ly;

public class Main {

	public static void main(String[] args) {
		System.out.println("How are you....");
		ATCTower tower=new ATCTower();
		
		Flight flight1=new CommercialFlight(tower, "123");
		Flight flight2=new CommercialFlight(tower, "125");
		tower.registerFlight(flight2);
		tower.registerFlight(flight1);
		
		flight1.send("Requesting landing clearance on Runway 1.");

	}
}

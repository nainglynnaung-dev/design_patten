package com.ly.command;

public class Main {
	
	public static void main(String[] args) {
		WareHouseSystem whs=new WareHouseSystem();
		AutomationController ac=new AutomationController();
		
		Command pi=new PickItem(whs);
		
		
		System.out.println("Action---");
		ac.executeCommand(pi);
		
		
		System.out.println("Undo----");
		ac.pressUndo();
	}

}

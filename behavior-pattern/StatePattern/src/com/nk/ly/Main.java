package com.nk.ly;

public class Main {
	public static void main(String[] args) {
		Context context=new Context();
		YellowState yS=new YellowState();
		yS.doAction(context);
		System.out.println("Current State: "+context.getState());
		
		RedState rS=new RedState();
		rS.doAction(context);
		
		System.out.println("Current State: "+context.getState());

		
		GreenState gS=new GreenState();
		gS.doAction(context);
		System.out.println("Current State: "+context.getState());

	}

}

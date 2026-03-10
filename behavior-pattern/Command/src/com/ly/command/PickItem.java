package com.ly.command;

public class PickItem implements Command{
	
	private WareHouseSystem wareHouseSystem;
	
	public PickItem(WareHouseSystem ware) {
		this.wareHouseSystem=ware;
	}

	@Override
	public void execute() {
		wareHouseSystem.pickItem();
	}

	@Override
	public void undo() {
		wareHouseSystem.restockItem();
		
	}

}

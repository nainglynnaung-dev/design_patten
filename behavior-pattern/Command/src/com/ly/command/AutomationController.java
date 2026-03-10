package com.ly.command;

import java.util.Stack;

public class AutomationController {
	
	private Stack<Command> history=new Stack<>();
	
	
	public void executeCommand(Command command) {
		command.execute();
		history.push(command);
	}

	
	public void pressUndo() {
		Command e=history.pop();
		e.undo();
	}
}

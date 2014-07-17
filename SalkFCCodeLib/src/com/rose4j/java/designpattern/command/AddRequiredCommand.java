package com.rose4j.java.designpattern.command;

public class AddRequiredCommand extends Command {
	private Group required = new RequirementGroup();
	@Override
	public void execute() {  
		required.find();
		required.add();
	}
	@Override
	public void undo() {
		required.delete();
	}

}

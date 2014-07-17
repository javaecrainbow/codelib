package com.rose4j.java.designpattern.command;

public class PageCommand extends Command {
	private Group page = new PageGroup();

	@Override
	public void execute() {
		page.find();
		page.add();
	}

	@Override
	public void undo() {
		page.delete();

	}

}

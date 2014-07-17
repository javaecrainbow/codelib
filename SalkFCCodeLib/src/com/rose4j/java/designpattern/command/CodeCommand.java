package com.rose4j.java.designpattern.command;

public class CodeCommand extends Command {
	private Group code = new CodeGroup();

	@Override
	public void execute() {
		code.find();
		code.add();

	}

	@Override
	public void undo() {
		code.delete();

	}

}

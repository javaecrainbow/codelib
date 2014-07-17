package com.rose4j.java.designpattern.command;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
    Invoker xx = new Invoker();
    Command requiredCommand = new AddRequiredCommand();
    Command pageCommand = new PageCommand();
    Command codeCommand = new CodeCommand();
    Command[] commands = {requiredCommand,pageCommand,codeCommand};
    MacroCommand marceoCommand = new MacroCommand(commands);
    xx.setCommand(marceoCommand);
    xx.action();
    System.out.println("===================");
    xx.cancelAction();
	}

}

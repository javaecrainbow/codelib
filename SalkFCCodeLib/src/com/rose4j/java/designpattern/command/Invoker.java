package com.rose4j.java.designpattern.command;
/**
 * �������
 * @author lijingjing
 *
 */
public class Invoker {
private Command command;

public Command getCommand() {
	return command;
}
//�ͻ���������
public void setCommand(Command command) {
	this.command = command;
}
//ִ������
public void action(){
	this.command.execute();
}
public void  cancelAction(){
	this.command.undo();
}

}

package com.rose4j.java.designpattern.command;
/**
 * 请求对象
 * @author lijingjing
 *
 */
public class Invoker {
private Command command;

public Command getCommand() {
	return command;
}
//客户发出命令
public void setCommand(Command command) {
	this.command = command;
}
//执行命令
public void action(){
	this.command.execute();
}
public void  cancelAction(){
	this.command.undo();
}

}

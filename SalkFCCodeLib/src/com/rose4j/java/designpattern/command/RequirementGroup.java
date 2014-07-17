package com.rose4j.java.designpattern.command;

public class RequirementGroup extends Group {

	@Override
	public void find() {
		System.out.println("找需求组");
	}

	@Override
	public void add() {
		System.out.println("客户要求增加一项需求");

	}

	@Override
	public void delete() {
		System.out.println("停止需求任务");

		
	}

}

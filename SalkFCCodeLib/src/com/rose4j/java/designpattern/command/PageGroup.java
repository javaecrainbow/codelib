package com.rose4j.java.designpattern.command;

public class PageGroup extends Group {

	@Override
	public void find() {
		System.out.println("找美工组");

	}

	@Override
	public void add() {
		System.out.println("安排美观计划");

	}

	@Override
	public void delete() {
		System.out.println("停止美工任务");

		
	}

}

package com.rose4j.java.designpattern.command;

public class CodeGroup extends Group {

	@Override
	public void find() {
		System.out.println("找开发组");

	}

	@Override
	public void add() {
		System.out.println("安排开发计划");

	}

	@Override
	public void delete() {
		System.out.println("停止开发任务");

		
	}

}

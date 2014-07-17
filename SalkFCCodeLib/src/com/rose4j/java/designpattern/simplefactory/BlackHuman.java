package com.rose4j.java.designpattern.simplefactory;

public class BlackHuman implements Human {

	@Override
	public void laugh() {
		System.out.println("黑人灿烂的笑容");

	}

	@Override
	public void cry() {
		System.out.println("黑人凄惨的哭泣");

	}

	@Override
	public void talk() {
		System.out.println("黑人听不懂的谈话");

	}

}

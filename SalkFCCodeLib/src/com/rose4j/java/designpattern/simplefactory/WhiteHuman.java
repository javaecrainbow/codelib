package com.rose4j.java.designpattern.simplefactory;

public class WhiteHuman implements Human {

	@Override
	public void laugh() {
		System.out.println("白人灿烂的笑容");
	}

	@Override
	public void cry() {
		System.out.println("白人凄惨的哭泣");
	}

	@Override
	public void talk() {
		System.out.println("白人健谈的谈话");

	}

}

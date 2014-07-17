package com.rose4j.java.designpattern.simplefactory;

public class YellowHuman implements Human {

	@Override
	public void laugh() {
		System.out.println("黄人灿烂的笑容");

	}

	@Override
	public void cry() {
		System.out.println("黄人凄惨的哭泣");

	}

	@Override
	public void talk() {
		System.out.println("黄人的谈话");

	}

}

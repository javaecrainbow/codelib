package com.rose4j.java.designpattern.decorator;

public class SortDecorator extends Decorator {

	public SortDecorator(SchoolReport schoolReport) {
		super(schoolReport);
		// TODO Auto-generated constructor stub
	}
	private void reportSort(){
		System.out.println("我是排名第38名...");
	}
	public void report(){
		super.report();
		reportSort();
	}
}

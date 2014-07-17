package com.rose4j.java.designpattern.template;

public class BMWCar extends CarModel {
	
	@Override
	public void start() {
		System.out.println("宝马车启动");

	}

	@Override
	public void stop() {
		System.out.println("宝马车制动");


	}

	@Override
	public void alarm() {
		System.out.println("宝马车已经启动");


	}

	@Override
	public void engineBoom() {
		System.out.println("宝马车引擎开始轰鸣");


	}


	@Override
	protected boolean isAlarm() {
		return false;
	}

}

package com.rose4j.java.designpattern.template;

public class BenzCar extends CarModel {

	@Override
	public void start() {
		System.out.println("奔驰车启动");

	}

	@Override
	public void stop() {
		System.out.println("奔驰车制动");


	}

	@Override
	public void alarm() {
		System.out.println("奔驰车已经启动");


	}

	@Override
	public void engineBoom() {
		System.out.println("奔驰车引擎开始轰鸣");

	}

	@Override
	protected boolean isAlarm() {
		return true;
	}

}

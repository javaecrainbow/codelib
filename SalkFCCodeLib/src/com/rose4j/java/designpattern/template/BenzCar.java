package com.rose4j.java.designpattern.template;

public class BenzCar extends CarModel {

	@Override
	public void start() {
		System.out.println("���۳�����");

	}

	@Override
	public void stop() {
		System.out.println("���۳��ƶ�");


	}

	@Override
	public void alarm() {
		System.out.println("���۳��Ѿ�����");


	}

	@Override
	public void engineBoom() {
		System.out.println("���۳����濪ʼ����");

	}

	@Override
	protected boolean isAlarm() {
		return true;
	}

}

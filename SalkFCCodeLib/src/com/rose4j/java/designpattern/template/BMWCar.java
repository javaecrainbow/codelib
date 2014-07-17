package com.rose4j.java.designpattern.template;

public class BMWCar extends CarModel {
	
	@Override
	public void start() {
		System.out.println("��������");

	}

	@Override
	public void stop() {
		System.out.println("�����ƶ�");


	}

	@Override
	public void alarm() {
		System.out.println("�����Ѿ�����");


	}

	@Override
	public void engineBoom() {
		System.out.println("�������濪ʼ����");


	}


	@Override
	protected boolean isAlarm() {
		return false;
	}

}

package com.rose4j.java.designpattern.simplefactory;

public class WhiteHuman implements Human {

	@Override
	public void laugh() {
		System.out.println("���˲��õ�Ц��");
	}

	@Override
	public void cry() {
		System.out.println("������ҵĿ���");
	}

	@Override
	public void talk() {
		System.out.println("���˽�̸��̸��");

	}

}

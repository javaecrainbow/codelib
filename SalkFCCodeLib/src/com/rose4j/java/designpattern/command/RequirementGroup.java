package com.rose4j.java.designpattern.command;

public class RequirementGroup extends Group {

	@Override
	public void find() {
		System.out.println("��������");
	}

	@Override
	public void add() {
		System.out.println("�ͻ�Ҫ������һ������");

	}

	@Override
	public void delete() {
		System.out.println("ֹͣ��������");

		
	}

}

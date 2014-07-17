package com.rose4j.java.designpattern.facade;

public class LetterProcessImpl implements LetterProcess {

	@Override
	public void writeContext() {
		System.out.println("��д�ż�����");

	}

	@Override
	public void fillEnvelope() {
		System.out.println("��д�ռ���");
	}

	@Override
	public void letterIntoEnvelope() {
		System.out.println("�ż�װ���ŷ�");
	}

	@Override
	public void sendLetter() {
		System.out.println("�ʵ��ż�");
	}

}

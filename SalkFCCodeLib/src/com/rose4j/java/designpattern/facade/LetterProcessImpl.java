package com.rose4j.java.designpattern.facade;

public class LetterProcessImpl implements LetterProcess {

	@Override
	public void writeContext() {
		System.out.println("填写信件内容");

	}

	@Override
	public void fillEnvelope() {
		System.out.println("填写收件人");
	}

	@Override
	public void letterIntoEnvelope() {
		System.out.println("信件装入信封");
	}

	@Override
	public void sendLetter() {
		System.out.println("邮递信件");
	}

}

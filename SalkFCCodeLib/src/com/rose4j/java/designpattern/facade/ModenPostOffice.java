package com.rose4j.java.designpattern.facade;

public class ModenPostOffice {
	private LetterProcess letterProcess= new LetterProcessImpl();
public void sendLetter(){
	letterProcess.writeContext();
	letterProcess.fillEnvelope();
	letterProcess.letterIntoEnvelope();
	letterProcess.sendLetter();
}
}

package com.rose4j.java.designpattern.facade;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ModenPostOffice office = new ModenPostOffice();
		office.sendLetter();
	}

}

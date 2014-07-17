package com.rose4j.java.designpattern.template;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CarModel benzCar = new BenzCar();
		benzCar.run();
		CarModel bmwCar = new BMWCar();
		bmwCar.run();
		
	}

}

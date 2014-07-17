package com.rose4j.java.designpattern.decorator;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SchoolReport sr = new FouthGradSchoolReport();
		sr=new HighScoreSchoolReportDecorator(sr);
		sr=new SortDecorator(sr);
		sr.report();
		sr.sign("уехЩ");
	}

}

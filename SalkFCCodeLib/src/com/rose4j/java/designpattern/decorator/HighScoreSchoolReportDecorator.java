package com.rose4j.java.designpattern.decorator;

public class HighScoreSchoolReportDecorator extends Decorator {

	public HighScoreSchoolReportDecorator(SchoolReport schoolReport) {
		super(schoolReport);
		// TODO Auto-generated constructor stub
	}
	private void reportHighScore(){
		System.out.println("这次考试语文最高是75，数学是78，自然是80"); 
	}
	@Override
	public void report(){
		this.reportHighScore();
		super.report();
	}
}

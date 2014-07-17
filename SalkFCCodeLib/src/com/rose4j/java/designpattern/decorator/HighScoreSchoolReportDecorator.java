package com.rose4j.java.designpattern.decorator;

public class HighScoreSchoolReportDecorator extends Decorator {

	public HighScoreSchoolReportDecorator(SchoolReport schoolReport) {
		super(schoolReport);
		// TODO Auto-generated constructor stub
	}
	private void reportHighScore(){
		System.out.println("��ο������������75����ѧ��78����Ȼ��80"); 
	}
	@Override
	public void report(){
		this.reportHighScore();
		super.report();
	}
}

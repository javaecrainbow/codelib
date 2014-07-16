package com.rose4j.java.effectivejava;

public enum PayrollDay {
MONDAY(PayType.WEEKDAY),
TUESDAY(PayType.WEEKDAY),
SUNDAY(PayType.WEEKEND);
private final PayType payType;
PayrollDay(PayType payType){
	this.payType=payType;
}
double pay(double hoursWorked,double payRate){
	return payType.pay(hoursWorked, payRate);
}
private enum PayType{
	WEEKDAY{

		@Override
		double overtimepay(double hrs, double payRate) {
			return hrs<=HOURS_PER_SHIFT?0:(hrs-HOURS_PER_SHIFT)*payRate/2;
		}
		
	},
	WEEKEND{

		@Override
		double overtimepay(double hrs, double payRate) {
			return hrs*payRate/2;

		}
		
	};
	private static final int HOURS_PER_SHIFT=8;
	abstract double overtimepay(double hrs,double payRate);
	double pay(double hoursWorked,double payRate){
		double basePay=hoursWorked*payRate;
		return basePay+overtimepay(hoursWorked,payRate);
	}
}
}

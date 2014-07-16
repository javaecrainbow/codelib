package com.rose4j.java.effectivejava;

import java.util.EnumSet;
import java.util.Set;

public class Client {

	public static void main(String[] args) {
		test1();
	}
	private static void test1(){
		for(PayrollDay day:PayrollDay.values()){
			day.pay(3, 1);
		}
	}
	private void test2(){
		Client.applyStyles(EnumSet.of(Style.BOLD,Style.SKRIKETHROUGH));
	}
	public static void applyStyles(Set<Style> style){
		System.out.println(11);
	}
}

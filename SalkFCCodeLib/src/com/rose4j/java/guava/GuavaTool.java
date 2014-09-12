package com.rose4j.java.guava;

import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;

public class GuavaTool {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Stopwatch stopwatch = new Stopwatch();
		stopwatch.start();
		for(int i=0;i<100;i++){
			Thread.sleep(50);
		}
		stopwatch.stop();
		printElapsedTime(stopwatch);
	}
	private static void printElapsedTime(final Stopwatch stopwatch){
		if(stopwatch.isRunning()){
			System.out.println("WARNING! Your stopwatch is still running!");
		}else{
			System.out.println(+stopwatch.elapsed(TimeUnit.NANOSECONDS)+"nanoseconds");
			System.out.println("\r\n"+stopwatch.elapsed(TimeUnit.MILLISECONDS)+"milliseconds");
		}
	}

}

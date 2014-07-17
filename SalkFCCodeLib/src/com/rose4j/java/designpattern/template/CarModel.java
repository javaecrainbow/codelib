package com.rose4j.java.designpattern.template;

public abstract class CarModel {
protected abstract void start();
protected abstract void stop();
protected abstract void alarm();
protected abstract void engineBoom();
protected abstract boolean isAlarm();
public final void run(){
	start();
	engineBoom();
	if(this.isAlarm()){
	alarm();
	}
	stop();
};
}

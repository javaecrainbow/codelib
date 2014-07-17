package com.rose4j.java.designpattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class MICLeader extends Observable {
	private String ip="125.12.15.14";
	
public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
public void assignTask(){
	setChanged();
	notifyObservers();
}

}

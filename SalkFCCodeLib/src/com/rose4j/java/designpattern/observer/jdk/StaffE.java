package com.rose4j.java.designpattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

import com.rose4j.java.designpattern.observer.pullcase.BIZLeader;
import com.rose4j.java.designpattern.observer.pullcase.Leader;

public class StaffE implements Observer {
	private Observable observer;
	public StaffE(Observable observer){
		this.observer = observer;
		observer.addObserver(this);
	}
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof MICLeader){

			System.out.println(this.getClass().getSimpleName() +":�°�"+((MICLeader)o).getIp()+"�������������ȥ������˵");

		}

	}

}

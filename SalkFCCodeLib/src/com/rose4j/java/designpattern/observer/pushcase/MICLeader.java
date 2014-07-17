package com.rose4j.java.designpattern.observer.pushcase;

import java.util.Vector;

public class MICLeader implements Leader {
	private Vector<Staff> staffList = new Vector<Staff>();
	boolean hasLeaved = false;
	@Override
	public synchronized void inviteStaffs(Staff staff) {
		 if (staff == null){
	            throw new NullPointerException();
		 }
		if(!staffList.contains(staff)){
		this.staffList.add(staff);
		}
	}

	@Override
	public void FireStaffs(Staff staff) {
		this.staffList.remove(staff);

	}

	@Override
	public void notifyStaffs() {
		synchronized (this) {
			if(!hasLeaved){
				return;
			}
		}
		clearChanged();
		for(Staff staff:this.staffList){
			staff.update();

		}
	
	}

	@Override
	public void leave() {
		System.out.println("大家好，我出去一会，你们好好工作啊");
		setChange();
		notifyStaffs();
	}

	private void setChange(){
		hasLeaved = true;	
	}
	private void  clearChanged(){
		hasLeaved = false;
	}

	@Override
	public void assignTask() {
	}
}

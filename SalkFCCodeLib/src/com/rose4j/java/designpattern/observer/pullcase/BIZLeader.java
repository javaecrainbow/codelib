package com.rose4j.java.designpattern.observer.pullcase;

import java.util.Vector;

public class BIZLeader implements Leader {
	private Vector<Staff> staffList = new Vector<Staff>();
	boolean hasLeaved = false;
	private String ip="192.168.1.1";
	
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

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
			staff.update(this);

		}
	}

	@Override
	public void leave() {
	}

	private void setChange(){
		hasLeaved = true;	
	}
	private void  clearChanged(){
		hasLeaved = false;
	}

	@Override
	public void assignTask() {
		System.out.println("大家好，请到我机器的共享文件夹查找自己的任务");
		setChange();
		notifyStaffs();
	}

}

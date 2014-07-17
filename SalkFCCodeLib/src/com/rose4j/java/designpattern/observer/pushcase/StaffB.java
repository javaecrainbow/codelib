package com.rose4j.java.designpattern.observer.pushcase;

public class StaffB implements Staff {
	private Leader leader;
	public StaffB(Leader leader){
		this.leader = leader;
		leader.inviteStaffs(this);
	}
	@Override
	public void update() {
		System.out.println(this.getClass().getSimpleName() +":¿ªÊ¼ÉÏÌÔ±¦");
	}

}

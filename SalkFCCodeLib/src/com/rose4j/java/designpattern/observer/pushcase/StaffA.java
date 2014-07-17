package com.rose4j.java.designpattern.observer.pushcase;

public class StaffA implements Staff {
	private Leader leader;
	public StaffA(Leader leader){
		this.leader = leader;
		leader.inviteStaffs(this);
	}
	@Override
	public void update() {
		System.out.println(this.getClass().getSimpleName() +":开始玩手机上微博");
	}

}

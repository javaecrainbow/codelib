package com.rose4j.java.designpattern.observer.pullcase;

public class StaffD implements Staff {
	private Leader leader;
	public StaffD(Leader leader){
		this.leader = leader;
		leader.inviteStaffs(this);
	}
	@Override
	public void update(Leader leader) {
		System.out.println(this.getClass().getSimpleName() +":��"+((BIZLeader)leader).getIp()+"�������������ȥ������˵");

	}

}

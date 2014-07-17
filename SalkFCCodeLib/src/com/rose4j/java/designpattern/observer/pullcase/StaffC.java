package com.rose4j.java.designpattern.observer.pullcase;
public class StaffC implements Staff {
	private Leader leader;
	public StaffC(Leader leader){
		this.leader = leader;
		leader.inviteStaffs(this);
	}
	@Override
	public void update(Leader leader) {
		System.out.println(this.getClass().getSimpleName() +":到"+((BIZLeader)leader).getIp()+"下载任务");

	}

}

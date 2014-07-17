package com.rose4j.java.designpattern.adapter;

public class OutUserInfoAdapter implements IUserInfo {
	private OutUserInfo outUser = new OutUserInfo();
	@Override
	public void getUserName() {
		System.out.println(outUser.getUserBaseInfo().get("userName"));
	}

	@Override
	public void getHomeAddress() {
		System.out.println(outUser.getUserHomeInfo().get("homeAddress"));
	}

	@Override
	public void getJobPosition() {
		System.out.println(outUser.getUserOfficeInfo().get("jobPoisition"));
	}

}

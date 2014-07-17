package com.rose4j.java.designpattern.adapter;

public class UserInfo implements IUserInfo {

	@Override
	public void getUserName() {
		System.out.println("获得用户姓名信息");
	}

	@Override
	public void getHomeAddress() {
		System.out.println("获得家庭住址信息");
	}

	@Override
	public void getJobPosition() {
		System.out.println("获得工作岗位信息");
	}

}

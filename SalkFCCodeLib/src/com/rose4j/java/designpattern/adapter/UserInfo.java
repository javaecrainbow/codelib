package com.rose4j.java.designpattern.adapter;

public class UserInfo implements IUserInfo {

	@Override
	public void getUserName() {
		System.out.println("����û�������Ϣ");
	}

	@Override
	public void getHomeAddress() {
		System.out.println("��ü�ͥסַ��Ϣ");
	}

	@Override
	public void getJobPosition() {
		System.out.println("��ù�����λ��Ϣ");
	}

}

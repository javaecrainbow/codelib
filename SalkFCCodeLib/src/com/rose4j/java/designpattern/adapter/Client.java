package com.rose4j.java.designpattern.adapter;


public class Client {
public static void main(String[] args){
	//IUserInfo userinfo = new UserInfo();
	IUserInfo userinfo = new OutUserInfoAdapter();
userinfo.getUserName();
userinfo.getHomeAddress();
userinfo.getJobPosition();

}
}

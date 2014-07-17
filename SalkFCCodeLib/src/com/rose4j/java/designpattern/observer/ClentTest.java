package com.rose4j.java.designpattern.observer;

import org.testng.annotations.Test;

import com.rose4j.java.designpattern.observer.jdk.StaffE;
import com.rose4j.java.designpattern.observer.jdk.StaffF;
import com.rose4j.java.designpattern.observer.pullcase.BIZLeader;
import com.rose4j.java.designpattern.observer.pullcase.StaffC;
import com.rose4j.java.designpattern.observer.pullcase.StaffD;
import com.rose4j.java.designpattern.observer.pushcase.Leader;
import com.rose4j.java.designpattern.observer.pushcase.MICLeader;
import com.rose4j.java.designpattern.observer.pushcase.StaffA;
import com.rose4j.java.designpattern.observer.pushcase.StaffB;

public class ClentTest {
  @Test
  public void testCase1() {
	  System.out.println("Test push model");
		Leader micLeader = new MICLeader();
		new StaffA(micLeader);
		new StaffB(micLeader);
		micLeader.leave();
  }
  @Test
  public void testCase2() {
	  System.out.println("============================");
		System.out.println("Test pull model");
		com.rose4j.java.designpattern.observer.pullcase.Leader bizLeader = new BIZLeader();
		new StaffC(bizLeader);
		new StaffD(bizLeader);
		bizLeader.assignTask();
  }
  @Test
  public void testCase3() {
	  System.out.println("=================================");
		com.rose4j.java.designpattern.observer.jdk.MICLeader miccLeader = new com.rose4j.java.designpattern.observer.jdk.MICLeader();
		new StaffE(miccLeader);
		new StaffF(miccLeader);
		miccLeader.assignTask();
  }
}

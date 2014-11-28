package com.rose4j.java.jvm;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
	public static final int _1MB=1024*1024;
	/**
	 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
	 */
	public static void testAllocation(){
		byte[] allocation1=new byte[2*_1MB];
		byte[] allocation2=new byte[2*_1MB];
		byte[] allocation3=new byte[2*_1MB];
		byte[] allocation4=new byte[5*_1MB];

	}
	
	/**
	 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
	 *-XX:PretenureSizeThreshold=3145728
	 */
	public static void testPretenureSizeThreshold(){
		byte[] allocation1=new byte[4*_1MB];
	}
	/**ƒÍ¡‰∑ß÷µ≤‚ ‘
	 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
	 *-XX:MaxTenuringThreshold
	 */
	public static void testTenuringThreshold(){
		byte[] allocation1,allocation2,allocation3;
		 allocation1=new byte[_1MB/4];
		 allocation2=new byte[4*_1MB];

		allocation3=new byte[4*_1MB];
		allocation3=null;
		allocation3=new byte[4*_1MB];

	}
	public static void main(String[] args) {
		testTenuringThreshold();
	}
	static class OOMObject {
		/**
		 * -Xms100M -Xmx100M -Xmn10M -XX:+UseSerialGC
		 * @param num
		 * @throws InterruptedException
		 */
		public static void fillHeap(int num)throws InterruptedException{
			List<OOMObject> list = new ArrayList<OOMObject>();
			for(int i=0;i<num;i++){
				Thread.sleep(50);
				list.add(new OOMObject());
			}
			System.gc();
		}
		public static void main(String[] args)throws Exception{
			fillHeap(1000);
		}
		
	}
}

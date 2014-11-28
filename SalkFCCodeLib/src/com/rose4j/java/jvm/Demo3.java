package com.rose4j.java.jvm;

import java.util.ArrayList;
import java.util.List;

import com.rose4j.java.jvm.Demo2.OOMObject;
/**
 * -Xms100M -Xmx100M -XX:+UseSerialGC
 * @param num
 * @throws InterruptedException
 */
public class Demo3 {
	
	static class OOMObject {
	
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

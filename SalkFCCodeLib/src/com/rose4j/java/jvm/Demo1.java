package com.rose4j.java.jvm;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	/**
	 * arg
	 * -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		while(true){
			list.add("123");
		}
	}

}

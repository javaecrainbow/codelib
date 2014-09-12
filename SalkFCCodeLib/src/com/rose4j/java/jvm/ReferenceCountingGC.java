package com.rose4j.java.jvm;

public class ReferenceCountingGC {
	public static final int _1MB=1024*1024;
	private byte[] bigSize=new byte[2*_1MB];
	public Object instance=null;
	public static void main(String[] args) {
		ReferenceCountingGC gc1 = new ReferenceCountingGC();
		ReferenceCountingGC gc2 = new ReferenceCountingGC();
		gc1.instance=gc2;
		gc2.instance=gc1;
		gc1=null;
		gc2=null;
		System.gc();
		System.out.println("123");
	}

}

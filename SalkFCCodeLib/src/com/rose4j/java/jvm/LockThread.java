package com.rose4j.java.jvm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * -Xms100M -Xmx100M -XX:+UseSerialGC
 * @param num
 * @throws InterruptedException
 */
public class LockThread {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		reader.readLine();
		createBusyThread();
		reader.readLine();
		Object obj = new Object();
		createLockThread(obj);
	}

	private static void createBusyThread() {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true){
					System.out.println("busy thread run>>>>>>");
				}
			}
		},"testBusyThread");
		thread.start();
	}
	/**
	 * 线程锁定演示
	 * @param object
	 */
	public static void createLockThread(final Object lock){
	Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized(lock){
					try{
						lock.wait();
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		},"testLockThread");
		thread.start();
	}

}

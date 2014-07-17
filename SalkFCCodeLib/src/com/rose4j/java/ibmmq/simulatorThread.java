package com.rose4j.java.ibmmq;
import com.ibm.mq.MQException;
import com.ibm.mq.MQMessage;
import com.ibm.mq.MQPutMessageOptions;
import com.ibm.mq.MQQueue;

public class simulatorThread extends Thread {
	private MQMgr mgmgr = null;
	private int interval = 2000;
	public void init(){
		try {
			mgmgr = (MQMgr) Class.forName("com.honestspring.mq.mgr.MQMgr").newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mgmgr.init();
	}
	public void run(){
		init();
		try{
		while(true){
			process();
			setSleep();
		}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
	}
	public void setSleep(){
		try {
			Thread.sleep(interval);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void process()throws Exception{
		MQQueue queueReciver = mgmgr.getQueue("q_test_send");
		MQMessage mqm = new MQMessage();
		boolean hasMessage = true;
		try{
		queueReciver.get(mqm);
		}catch(MQException e){
			if(e.reasonCode==2033){
				hasMessage = false;
				//e.printStackTrace();
				System.out.println("there is no message");
			}
		}finally{
			mgmgr.dispose();
		}
		if(hasMessage){
			System.out.println("there is one message");
		MQQueue queueSend = mgmgr.getQueue(mqm.replyToQueueName);
		mqm.correlationId=mqm.messageId;
		mgmgr.init();
		queueSend.put(mqm, new MQPutMessageOptions());
		mgmgr.dispose();
		System.out.println("translate sucessfully");
		}
		
	}
	public static void main(String[] args){
		Thread t=new Thread(new simulatorThread());
		t.start();
	}
}

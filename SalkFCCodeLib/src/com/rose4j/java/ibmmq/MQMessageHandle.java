package com.rose4j.java.ibmmq;

import com.ibm.mq.MQC;
import com.ibm.mq.MQEnvironment;
import com.ibm.mq.MQGetMessageOptions;
import com.ibm.mq.MQMessage;
import com.ibm.mq.MQPutMessageOptions;
import com.ibm.mq.MQQueue;
import com.ibm.mq.MQQueueManager;

public class MQMessageHandle {
	private MQMgr mgmgr = null;
	
	private void initMgr() {
			try {
				mgmgr = (MQMgr) Class.forName("com.honestspring.mq.mgr.MQMgr").newInstance();
				mgmgr.init();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	public MQMessageHandle(){
		initMgr();
	}
	public String sendMessage(String message, String msgType) {
		
		try{
			MQQueue queueSender = mgmgr.getQueue("q_test_send");
			MQMessage mqm = mgmgr.creatMessage();
			if (msgType.equals("Text") || msgType.equals("Byte") || msgType.equals("MQIMS")) {
				if ("Text".equals(msgType)) {
					mqm.format = MQC.MQFMT_STRING;
					byte[] sendBytes = message.getBytes("UTF-8");
					mqm.write(sendBytes);
				} else
					mqm.writeBytes(message);
					
			} else {
				mqm.format = MQC.MQFMT_NONE;
				mqm.writeObject(message);
			}
			queueSender.put(mqm, new MQPutMessageOptions());
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			mgmgr.dispose();
		}
		return null;

	}
	public String receiveMsg(){
		String strmsgCont="";
		try{
			int waittingTime=2;
		MQQueue queueReceiver = mgmgr.getQueue("q_test_receive");
		
		MQGetMessageOptions getOp = new MQGetMessageOptions();
		getOp.options |= MQC.MQGMO_WAIT;
		//if(waittingTime>0)
		//	getOp.waitInterval = waittingTime * 1000;
		//else{
			getOp.waitInterval = -1;
		//}
		getOp.matchOptions = MQC.MQMO_MATCH_CORREL_ID;
		MQMessage mqm = new MQMessage();
		mqm.correlationId = mgmgr.getMessageId().getBytes();
		queueReceiver.get(mqm,getOp);
		int len = mqm.getDataLength();
		byte[] buf = new byte[len];
		mqm.readFully(buf, 0, len);
		 strmsgCont = new String(buf);
		
		}catch(Exception e){
			
		}finally{
			mgmgr.dispose();
		}
		return strmsgCont;
	}
	public static void main(String[] args){
		MQMessageHandle mgHandle = new MQMessageHandle();
		mgHandle.sendMessage("Test Hello Word", "Text");
		System.out.println(mgHandle.receiveMsg());
	}
}

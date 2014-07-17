package com.rose4j.java.ibmmq;

import com.ibm.mq.MQC;
import com.ibm.mq.MQEnvironment;
import com.ibm.mq.MQMessage;
import com.ibm.mq.MQQueue;
import com.ibm.mq.MQQueueManager;

public class MQMgr implements MQMgrIntf {
	private MQQueueManager queueManager = null;
	private MQQueue queue = null;

	public MQQueue getQueue(String queueName)throws Exception{
		this.queue= queueManager.accessQueue(queueName, MQC.MQOO_INPUT_AS_Q_DEF | MQC.MQOO_OUTPUT);
		return this.queue;

	}
	private int ccsid = 1381;
	private String messageId = "";
	
	public int getCcsid() {
		return ccsid;
	}

	public void setCcsid(int ccsid) {
		this.ccsid = ccsid;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public MQQueueManager getQueueManager()throws Exception{
		return this.queueManager;
	}

	public void setQueueManager(MQQueueManager queueManager) {
		this.queueManager = queueManager;
	}
	@Override
	public void init() {
		MQEnvironment.properties.put(MQC.TRANSPORT_PROPERTY, MQC.TRANSPORT_MQSERIES);
		String sendQueue = "q_test_send";
		String queueMgr = "queue_mgr";
		MQEnvironment.hostname = "192.168.26.141";
		MQEnvironment.channel = "c_channel";
		MQEnvironment.port = 1414;
		MQEnvironment.CCSID = 1381;
		try {
			queueManager = new MQQueueManager(queueMgr);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Override
	public void process() {

	}

	@Override
	public void dispose() {
		try {
			if (queue != null) {
				queue.close();
			}
			if (queueManager != null) {
				queueManager.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public MQMessage creatMessage() {
		MQMessage mqm = new MQMessage();
		String msgId = generateMsgId();
		mqm.messageId = msgId.getBytes();
		messageId=msgId;
		System.out.println(msgId);
		mqm.characterSet = this.ccsid;
		// mqm.encoding
		// mqm.persistence
		mqm.replyToQueueManagerName = "queue_mgr";
		mqm.replyToQueueName = "q_test_receive";
		return mqm;
	}
	private String generateMsgId() {
		return UUIDGenerator.getInstance().generate24UUID();
	}
}

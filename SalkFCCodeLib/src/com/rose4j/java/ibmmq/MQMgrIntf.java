package com.rose4j.java.ibmmq;

import com.ibm.mq.MQMessage;

public interface MQMgrIntf {
public void init();
public void process();
public void dispose();
public MQMessage creatMessage();
}

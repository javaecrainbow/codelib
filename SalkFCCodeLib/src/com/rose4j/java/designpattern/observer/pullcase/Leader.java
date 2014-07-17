package com.rose4j.java.designpattern.observer.pullcase;


public interface Leader {
public void inviteStaffs(Staff staff);
public void FireStaffs(Staff staff);
public void notifyStaffs();
/**
 * 推模式,我只是行为告诉你，你如果需要更多的冻西自己去到我身上挖掘
 */
public void leave();

public void assignTask();
}

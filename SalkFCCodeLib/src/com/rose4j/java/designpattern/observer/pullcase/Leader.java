package com.rose4j.java.designpattern.observer.pullcase;


public interface Leader {
public void inviteStaffs(Staff staff);
public void FireStaffs(Staff staff);
public void notifyStaffs();
/**
 * ��ģʽ,��ֻ����Ϊ�����㣬�������Ҫ����Ķ����Լ�ȥ���������ھ�
 */
public void leave();

public void assignTask();
}

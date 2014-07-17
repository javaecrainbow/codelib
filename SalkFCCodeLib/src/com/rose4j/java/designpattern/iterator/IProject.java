package com.rose4j.java.designpattern.iterator;

public interface IProject {
public String getProjectInfo();
public void add(String projectName,int cost);
public IProjectIterator getProjectIterator();
}

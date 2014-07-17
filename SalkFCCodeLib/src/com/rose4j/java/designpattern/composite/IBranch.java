package com.rose4j.java.designpattern.composite;

import java.util.List;

public interface IBranch {
public void addChild(ICompany company);
public List<ICompany> getChilds();
}

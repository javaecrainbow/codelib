package com.rose4j.java.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Branch implements ICompany, IBranch {
	private String name;
	private String position;
	private int salary;
	private List<ICompany> childs = new ArrayList<ICompany>();
	
	public Branch(String name, String position, int salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	@Override
	public void addChild(ICompany company) {
		this.childs.add(company);
	}

	@Override
	public List<ICompany> getChilds() {
		return this.childs;
	}

	@Override
	public String getInfo() {
		StringBuffer sb = new StringBuffer();
		sb.append("������").append(name).append("\r\n")
		.append("ְλ:").append(position).append("\r\n")
		.append("���ʣ�").append(salary);
		return sb.toString();
	}

}

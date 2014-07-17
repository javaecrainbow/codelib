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
		sb.append("姓名：").append(name).append("\r\n")
		.append("职位:").append(position).append("\r\n")
		.append("工资：").append(salary);
		return sb.toString();
	}

}

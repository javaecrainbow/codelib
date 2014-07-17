package com.rose4j.java.designpattern.composite;

public class Leaf implements ICompany{
	private String name;
	private String position;
	private int salary;
	public Leaf(){
		
	}

	public Leaf(String name, String position, int salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
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

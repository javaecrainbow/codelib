package com.rose4j.java.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class Project implements IProject {
	private String name;
	private int cost;
	private List<IProject> projects = new ArrayList<IProject>();
	public Project(){
		
	}
	
	public Project(String name,int cost){
		this.name=name;
		this.cost=cost;
	}
	@Override
	public String getProjectInfo() {
		StringBuffer sb = new StringBuffer();
		sb.append("项目名称：").append(name).append("\r\n")
		.append("项目成本:").append(cost);
		return sb.toString();
	}

	@Override
	public IProjectIterator getProjectIterator() {
		return new ProjectIterator(projects);
	}

	@Override
	public void add(String projectName, int cost) {
		projects.add(new Project(projectName,cost));
	}

}

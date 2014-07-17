package com.rose4j.java.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProjectIterator implements IProjectIterator {
	private List<IProject> projectList = new ArrayList<IProject>();
	private int currentItem=0;
	public ProjectIterator(List<IProject> projectList){
		this.projectList=projectList;
	}
	@Override
	public boolean hasNext() {
		return (this.currentItem>=projectList.size() || this.projectList.get(this.currentItem)==null)?false:true;
	}

	@Override
	public Object next() {
		return (IProject)this.projectList.get(this.currentItem++);
	}

	@Override
	public void remove() {

	}

}

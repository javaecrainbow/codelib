package com.rose4j.java.designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String[] x = new String[]{"11","22","33"};
		//List arrayList = new ArrayList();
		//arrayList.iterator();
		IProject project = new Project();
		project.add("��Ŀһ", 200);
		project.add("��Ŀ��", 500);
		Iterator<IProject> it=project.getProjectIterator();
		while(it.hasNext()){
			System.out.println(it.next().getProjectInfo());
		}
	}

}

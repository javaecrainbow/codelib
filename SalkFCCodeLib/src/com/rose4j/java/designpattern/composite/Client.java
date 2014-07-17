package com.rose4j.java.designpattern.composite;

import java.util.Iterator;
import java.util.List;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Branch root = getTreeComposit();
		System.out.println(getTreeInfo(root));
	}
	public static Branch getTreeComposit(){
		Branch root = new Branch("王青","CEO",2000000);
		Branch devep = new Branch("xxx","研发部经理",100000);
		Branch sale=new Branch("xxx","销售部部经理",1000000);
		Branch fistdevep = new Branch("xxx","研发一部经理",50000);
		Branch secdevep = new Branch("xxx","研发二部经理",50000);
		Branch fistsal = new Branch("xxx","销售一部经理",50000);
		Branch secsal = new Branch("xxx","销售二部经理",50000);
		Leaf l1=new Leaf("xxx","程序员1",2000);
		Leaf l2=new Leaf("xxx","程序员2",2000);
		
		Leaf s1=new Leaf("xxx","销售1",2000);
		Leaf s2=new Leaf("xxx","销售2",2000);
		
		root.addChild(devep);
		root.addChild(sale);
		devep.addChild(fistdevep);
		devep.addChild(secdevep);
		sale.addChild(fistsal);
		sale.addChild(secsal);
		fistdevep.addChild(l1);
		secdevep.addChild(l2);
		fistsal.addChild(s1);
		secsal.addChild(s2);
		return root;
	}
	
	public static String getTreeInfo(Branch root){
		StringBuffer sb = new StringBuffer();
		sb.append(root.getInfo()).append("\r\n");
		List<ICompany> child = root.getChilds(); 
		Iterator<ICompany> i = child.iterator();
		while(i.hasNext()){
			ICompany company=i.next();
			if(company instanceof Leaf){
				sb.append(company.getInfo()).append("\r\n");
			}else{
				sb.append(company.getInfo()).append("\r\n").append(getTreeInfo((Branch)company));
			}
		}
		return sb.toString();
	}
}

package com.rose4j.java.designpattern.simplefactory;

import java.util.HashMap;

public class HumanFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Human human = createHuman(WhiteHuman.class);
		human.laugh();
		human.cry();
		human.talk();
	}
	public static Human createHuman(Class c){
		HashMap<String,Human> humans= new HashMap<String,Human>();
		Human human=null;

			try {
				if(humans.containsKey(c.getSimpleName())){
					human = humans.get(c.getSimpleName());
				}else{
				human =(Human) Class.forName(c.getName()).newInstance();
				}
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return human;
	}

}

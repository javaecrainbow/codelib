package com.rose4j.java.effectivejava;

import java.util.EnumMap;
import java.util.Map;

/**
 * 使用EnumMap代替序数索引
 * @author rose4j
 *
 */
public enum Phase {
SOLID,LIQUID,GAS;
public enum Transition{
	MELT(SOLID,LIQUID),
	FREEZE(LIQUID,GAS);
	private final Phase src;
	private final Phase dst;
	Transition(Phase src,Phase dst){
		this.src=src;
		this.dst=dst;
	}
	private static final Map<Phase,Map<Phase,Transition>> m=new EnumMap<Phase,Map<Phase,Transition>>(Phase.class);
	static{
		for(Phase p:Phase.values()){
			m.put(p, new EnumMap<Phase,Transition>(Phase.class));
			for(Transition tran:Transition.values()){
				m.get(tran.src).put(tran.dst, tran);
			}
		}
		
	}
}
}

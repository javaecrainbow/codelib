package com.rose4j.java.effectivejava;

import java.util.Collection;

/**
 * 泛型 PECS原则（producer-extends/consumer-super）
 * 如果参数化类型比奥斯一个T生产者，用？ extends T
 * 如果他表示一个T的消费者，用？ super T
 * @author rose4j
 *
 */
public class FanXingDemo<E> {
	public E pop(){
		return null;
		
	}
	public void push(E e){
		
	}
	public void popAll(Collection<? super E> dst){
		dst.add(pop());
	}
	public void pushAll(Iterable<? extends E> src){
		for(E e:src){
			push(e);
		}
	}
	public static void main(String[] args) {

	}

}

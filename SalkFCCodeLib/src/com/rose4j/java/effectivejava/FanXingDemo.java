package com.rose4j.java.effectivejava;

import java.util.Collection;

/**
 * ���� PECSԭ��producer-extends/consumer-super��
 * ������������ͱȰ�˹һ��T�����ߣ��ã� extends T
 * �������ʾһ��T�������ߣ��ã� super T
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

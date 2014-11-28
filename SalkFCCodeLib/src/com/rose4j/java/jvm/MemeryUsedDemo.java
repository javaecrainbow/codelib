package com.rose4j.java.jvm;

import net.sourceforge.sizeof.SizeOf;

import org.omg.SendingContext.RunTime;
/**
 * �ڽ���֮ǰ���򵥻ع��£�Java������ڴ沼�֣�����ͷ��Header����ʵ�����ݣ�Instance Data���Ͷ�����䣨Padding��
 * �����ڵĻ�����HotSpot�������64λWindwos��
 * @author rose4j
 *2014��9��22��
 */
public class MemeryUsedDemo {
	private static Runtime runTime = Runtime.getRuntime();
	public static void main(String[] args) {
		//long heap1 = getUsedMemory();
		
		//String s = new String("123");
		//System.out.println(SizeOf.deepSizeOf(new Object()));
		MemeryUsedDemo s = new MemeryUsedDemo();
		s.test5();
		//long heap2=getUsedMemory();
		//System.out.println("spent memory:"+(float)(heap2-heap1)+"bytes");

	}
	private static long getUsedMemory(){
		System.out.println(runTime.totalMemory());
		return runTime.totalMemory()-runTime.freeMemory();
	}
	/**
	 *����ͷ��32λϵͳ��ռ��8bytes��64λϵͳ��ռ��16bytes��
	 */
	public void test1(){
		System.out.println(SizeOf.sizeOf(new Object()));
	}
	/**
	 * reference������32λϵͳ��ÿ��ռ��4bytes, ��64λϵͳ��ÿ��ռ��8bytes��
	 * ������ռ�ڴ�ļ���=������ͷ + ʵ������ + padding�� % 8����0��0 <= padding < 8
	 * ����ռ�õ��ڴ��С�յ�VM����UseCompressedOops��Ӱ�졣
	 * ������-XX:+UseCompressedOops������ͷ��СΪ12bytes��64λ��������
	 * ����ʱ16bytes
	 * �ر�ָ��ѹ���� 16+4=20����8�ı���������+padding/4=24
	 */
	public void test2(){
		System.out.println(SizeOf.sizeOf(new A()));
	}
	static class A {
        int a;//4
    }
	static class B2 {
        int b2a;//4
        Integer b2b;//8
}
	/**
	 * 64λ������reference����ռ��8���ֽڣ�����ָ��ѹ����ռ��4���ֽڡ�
	 */
	public void test3(){
		System.out.println(SizeOf.sizeOf(new B2()));

	}
	/**
	 * 64λ�����ϣ��������Ķ���ͷռ��24���ֽڣ�����ѹ��֮��ռ��16���ֽڡ�
	 * ֮���Ա���ͨ����ռ���ڴ������Ϊ��Ҫ����Ŀռ�洢����ĳ��ȡ�
	 */
	public void test4(){
		System.out.println(SizeOf.sizeOf(new Integer[0]));

	}
	/**
	 * δ����ѹ����16������ͷ��+4��ba��+8��as���õĴ�С��+padding/4=32

		����ѹ����12+4+4+padding/4=24
	 */
	public void test5(){
		System.out.println(SizeOf.sizeOf(new C()));
	}  
	
	static class B {
        int a;
        int b;
    }
	static class C {
        int ba;
        B[] as = new B[3];

        C() {
            for (int i = 0; i < as.length; i++) {
                as[i] = new B();
            }
        }
    }
}

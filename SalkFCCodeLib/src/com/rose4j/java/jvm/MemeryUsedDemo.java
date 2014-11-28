package com.rose4j.java.jvm;

import net.sourceforge.sizeof.SizeOf;

import org.omg.SendingContext.RunTime;
/**
 * 在介绍之前，简单回顾下，Java对象的内存布局：对象头（Header），实例数据（Instance Data）和对齐填充（Padding）
 * 我所在的环境是HotSpot虚拟机，64位Windwos。
 * @author rose4j
 *2014年9月22日
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
	 *对象头在32位系统上占用8bytes，64位系统上占用16bytes。
	 */
	public void test1(){
		System.out.println(SizeOf.sizeOf(new Object()));
	}
	/**
	 * reference类型在32位系统上每个占用4bytes, 在64位系统上每个占用8bytes。
	 * 对象所占内存的计算=（对象头 + 实例数据 + padding） % 8等于0且0 <= padding < 8
	 * 对象占用的内存大小收到VM参数UseCompressedOops的影响。
	 * 开启（-XX:+UseCompressedOops）对象头大小为12bytes（64位机器）。
	 * 正常时16bytes
	 * 关闭指针压缩： 16+4=20不是8的倍数，所以+padding/4=24
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
	 * 64位机器上reference类型占用8个字节，开启指针压缩后占用4个字节。
	 */
	public void test3(){
		System.out.println(SizeOf.sizeOf(new B2()));

	}
	/**
	 * 64位机器上，数组对象的对象头占用24个字节，启用压缩之后占用16个字节。
	 * 之所以比普通对象占用内存多是因为需要额外的空间存储数组的长度。
	 */
	public void test4(){
		System.out.println(SizeOf.sizeOf(new Integer[0]));

	}
	/**
	 * 未开启压缩：16（对象头）+4（ba）+8（as引用的大小）+padding/4=32

		开启压缩：12+4+4+padding/4=24
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

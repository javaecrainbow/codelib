package com.rose4j.java.jvm;
/**
 * 即使可达性算法不可达的对象，也并非非死不可，这时只是处于“死刑”阶段，真正宣告死亡，还要经过两次标记过程
 * 
 * 此段代码演示两点
 * 1）对象可以在被GC时自我拯救
 * 2）这种自救的机会只有一次，因为一个对象的finalize()方法最多只会被系统自动调用一次
 * @author lijingjing
 *2014年9月10日
 */
public class FinalizeEscapeGC {

	public static FinalizeEscapeGC SAVE_HOOK=null;
	public void isAlive(){
		System.out.println("yes,i am still alive");
	}
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize method executed!");
		FinalizeEscapeGC.SAVE_HOOK=this;
		
	}
	
	
	public static void main(String[] args) throws Exception{
		SAVE_HOOK=new FinalizeEscapeGC();
		//对象第一次成功拯救自己
		SAVE_HOOK=null;
		System.gc();
		//因为finalize方法优先级比较低，所以暂停0.5s
		Thread.sleep(500);
		if(SAVE_HOOK!=null){
			SAVE_HOOK.isAlive();
		}else{
			System.out.println("no,i am dead");
		}
		//重复自救失败
		SAVE_HOOK=null;
		System.gc();
		//因为finalize方法优先级比较低，所以暂停0.5s
		Thread.sleep(500);
		if(SAVE_HOOK!=null){
			SAVE_HOOK.isAlive();
		}else{
			System.out.println("no,i am dead");
		}
	}

}

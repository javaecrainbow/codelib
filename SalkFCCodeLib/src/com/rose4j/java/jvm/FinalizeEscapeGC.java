package com.rose4j.java.jvm;
/**
 * ��ʹ�ɴ����㷨���ɴ�Ķ���Ҳ���Ƿ������ɣ���ʱֻ�Ǵ��ڡ����̡��׶Σ�����������������Ҫ�������α�ǹ���
 * 
 * �˶δ�����ʾ����
 * 1����������ڱ�GCʱ��������
 * 2�������ԾȵĻ���ֻ��һ�Σ���Ϊһ�������finalize()�������ֻ�ᱻϵͳ�Զ�����һ��
 * @author lijingjing
 *2014��9��10��
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
		//�����һ�γɹ������Լ�
		SAVE_HOOK=null;
		System.gc();
		//��Ϊfinalize�������ȼ��Ƚϵͣ�������ͣ0.5s
		Thread.sleep(500);
		if(SAVE_HOOK!=null){
			SAVE_HOOK.isAlive();
		}else{
			System.out.println("no,i am dead");
		}
		//�ظ��Ծ�ʧ��
		SAVE_HOOK=null;
		System.gc();
		//��Ϊfinalize�������ȼ��Ƚϵͣ�������ͣ0.5s
		Thread.sleep(500);
		if(SAVE_HOOK!=null){
			SAVE_HOOK.isAlive();
		}else{
			System.out.println("no,i am dead");
		}
	}

}

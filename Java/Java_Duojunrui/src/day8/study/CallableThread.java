package day8.study;

import java.util.concurrent.Callable;

/**
 * ʵ��Callable�ӿ�ʵ���̴߳���
 * @author �࿡�
 * @date 2018��7��26�� ����10:12:35 
 *
 */
public class CallableThread implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		
		for(int i=0; i<50; i++) {
			System.out.println(Thread.currentThread().getName()+"ʵ��Callable�ӿ�ʵ���̴߳���"+i);
		}
		
		return null;
	}
	
}

	


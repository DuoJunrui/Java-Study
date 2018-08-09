package day8.study;

import java.util.concurrent.Callable;

/**
 * 实现Callable接口实现线程创建
 * @author 多俊睿
 * @date 2018年7月26日 上午10:12:35 
 *
 */
public class CallableThread implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		
		for(int i=0; i<50; i++) {
			System.out.println(Thread.currentThread().getName()+"实现Callable接口实现线程创建"+i);
		}
		
		return null;
	}
	
}

	


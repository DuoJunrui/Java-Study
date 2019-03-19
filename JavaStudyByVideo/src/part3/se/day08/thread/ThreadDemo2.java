package part3.se.day08.thread;
/**
 * @author: 多俊睿
 * @data: 2019年3月19日 上午10:27:17
 * @Description: 第二种创建线程的方式：单独定义线程任务
 * 实现Runnable接口并重写run方法
 */
public class ThreadDemo2 {

	public static void main(String[] args) {
		
		//实例化线程任务
		MyRunnable1 mr1 = new MyRunnable1();
		MyRunnable2 mr2 = new MyRunnable2();
		
		//创建线程
		Thread t1 = new Thread(mr1);
		Thread t2 = new Thread(mr2);
		
		t1.start();
		t2.start();
		
	}

}

//实现接口
class MyRunnable1 implements Runnable{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("你是谁啊？");
		}
	}
}

class MyRunnable2 implements Runnable{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("我是查水表的！");
		}
	}
}

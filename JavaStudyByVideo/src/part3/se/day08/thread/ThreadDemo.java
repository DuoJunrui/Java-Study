package part3.se.day08.thread;
/**
 * @author: 多俊睿
 * @data: 2019年3月18日 下午7:23:35
 * @Description: 线程能允许我们“同时执行”多段代码。
 * 线程有两种创建方式
 * 1、继承Thread并重写run方法
 */
public class ThreadDemo {

	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		t1.start();
		t2.start();

	}
}

class MyThread1 extends Thread{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("你是谁啊？");
		}
	}
}

class MyThread2 extends Thread{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("我是查水表的。");
		}
	}
}

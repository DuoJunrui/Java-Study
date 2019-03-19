package part3.se.day08.thread;
/**
 * @author: 多俊睿
 * @data: 2019年3月19日 上午11:33:46
 * @Description: 线程提供了一个静态方法
 * static Thread currentThread()
 * 该方法可以获取运行该方法的线程。
 */
public class CurrentThreadDemo {

	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		System.out.println("运行main方法的线程是：" + main);
		//运行main方法的线程是：Thread[main,5,main]
		dosome();
		
		Thread t = new Thread() {
			public void run() {
				Thread t = Thread.currentThread();
				System.out.println("自定义线程："+t);
				dosome();
			}
		};
		t.start();
	}
	
	public static void dosome() {
		Thread t = Thread.currentThread();
		System.out.println("运行dosome方法的线程是："+ t);
	}

}

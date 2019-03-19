package part3.se.day09.thread;
/**
 * @author: 多俊睿
 * @data: 2019年3月19日 下午7:55:53
 * @Description: 互斥锁
 * 当使用synchronized锁住多段不同的代码片段，但是
 * 这些同步块使用的同步监视器对象是用一个时，那么这些
 * 代码片段之间就是互斥的。多个线程不能同时执行他们。
 */
public class SyncDemo4 {

	public static void main(String[] args) {
		Boo boo = new Boo();
		Thread t1 = new Thread() {
			public void run() {
				//boo.methodA();  //类型Boo中的静态方法methodA()应该以静态方式访问
				Boo.methodA();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				Boo.methodB();
			}
		};
		t1.start();
		t2.start();

	}

}

class Boo{
	public synchronized static void methodA() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+":正在执行methodA");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println(t.getName()+":methodA运行结束！");
	}
	
	public synchronized static void methodB() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+":正在执行methodB");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println(t.getName()+":methodB运行结束！");
	}
}

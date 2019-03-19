package part3.se.day09.thread;
/**
 * @author: 多俊睿
 * @data: 2019年3月19日 下午7:05:26
 * @Description: 有效的缩小同步范围可以在保证并发安全的前提下
 * 尽可能提高并发效率。
 * 
 * 同步块可以更准确的控制需要同步运行的代码片段。
 * synchronize(同步监视器) {
 * 		需要同步运行的代码片段
 * }
 * 
 * 同步监视器是Java中任意的一个对象，
 * 只要保证多个线程看到的该对象是“同一个”，
 * 即可保证同步块中的代码是并发安全的。
 */
public class SyncDemo2 {
	public static void main(String args[]) {
		Shop shop = new Shop();
		Thread t1 = new Thread() {
			public void run() {
				shop.buy();
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				shop.buy();
			}
		};
		
		t1.start();
		t2.start();
	}
}

class Shop{
	//public synchronized void buy() {
	public void buy() {
		Thread t = Thread.currentThread();
		try {
			System.out.println(t.getName()+"：正在挑衣服···");
			Thread.sleep(500);
			
			synchronized (this) { //注意：多个线程看到的是对一个对象
				System.out.println(t.getName()+"：正在试衣服···");
				Thread.sleep(5000);
				System.out.println(t.getName()+"：结账离开。");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

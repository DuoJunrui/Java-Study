package part3.se.day09.thread;
/**
 * @author: 多俊睿
 * @data: 2019年3月19日 下午12:30:27
 * @Description: sleep阻塞
 * 线程提供的方法：
 * static void sleep(long ms)
 * 该方法可以让运行该方法的线程处于阻塞状态指定毫秒
 * 超时后线程会重新回到runnable状态，等待分配CPU时间片再次运行。
 */
public class SleepDemo {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("t1程序开始了！");
				try {
					/**
					 * 通常会引起线程阻塞现象的方法都要求处理中断异常。
					 * 线程有一个方法interrupt()
					 * 该方法可以中断一个正在运行的线程。
					 * 但是若该线程正处于某种阻塞时被调用中断方法中断，
					 * 那么并不是将该线程直接中断，而是中断其阻塞状态。
					 * 这时通常会抛出中断异常，通知程序该线程的阻塞状态被打断。
					 */
					Thread.sleep(10000000);
				} catch (InterruptedException e) {
					e.printStackTrace();
					System.out.println("干嘛呢。干嘛呢！");
				}
				System.out.println("程序结束了！");
			
			}
		};

		
		Thread t2 = new Thread() {
			public void run() {
				System.out.println("t2也在运行。");
				for (int i = 0; i < 5; i++) {
					System.out.println("咣当！");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("搞定！");	
				t1.interrupt();//打断t1线程
			}
		};
		
		t1.start();
		t2.start();
	}
}

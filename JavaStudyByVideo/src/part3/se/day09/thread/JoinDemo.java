package part3.se.day09.thread;

import javax.management.RuntimeErrorException;

/**
 * @author: 多俊睿
 * @data: 2019年3月19日 下午3:52:08
 * @Description: join方法可以协调线程之间的同步运行
 * join方法会让运行该方法的线程处于阻塞状态，
 * 直到该方法所属线程运行完毕才会解除阻塞。
 */
public class JoinDemo {

	//模拟图片是否下载完毕
	private static boolean isFinish = false;
	public static void main(String[] args) {
		
		Thread down = new Thread() {
			public void run() {
				System.out.println("Down:开始下载图片····");
				for (int i = 1; i <= 100; i+=5) {
					System.out.println("已下载："+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Down:下载完毕！");
				isFinish = true;
			}
		};
		
		Thread show = new Thread() {
			public void run() {
				System.out.println("show:开始显示图片····");
				
				//先等待下载线程将图片加载完再加载
				try {
					//
					down.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				if (!isFinish) {
					throw new RuntimeException("图片加载中···");
				}
				System.out.println("图片显示完毕！");
			}
		};
		
		down.start();
		show.start();
		
		
	}

}

package part3.se.day09.thread;
/**
 * @author: 多俊睿
 * @data: 2019年3月19日 下午2:12:21
 * @Description: 守护线程
 * 守护线程又称为后台线程，一个线程创建出来默认都是普通（前台线程），
 * 守护线程需要在线程启动前单独进行设置。
 * 使用上守护线程与普通线程无差别。但是在结束时机上有一点不同，
 * 即：当进程结束时，所有正在运行的守护线程都会被强制中断。
 * 进程结束：当一个进程中所有前台线程都结束时，进程即结束。
 */
public class DaemonThreadDemo {

	public static void main(String[] args) {
		
		Thread rose = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("rose: Let me go!");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println("rose:啊啊啊啊啊AAAAAaaaaaa");
				System.out.println("噗通····");
			}
		};
		
		Thread jack = new Thread() {
			public void run() {
				while (true) {
					System.out.println("jack: You jump! I jump!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		rose.start();
		
		//设置为守护线程，必须在start之前调用
		jack.setDaemon(true);
		jack.start();
		
		System.out.println("其实main线程已经结束了，其他线程还在运行。");
		System.out.println("一个进程里面的所有线程才结束了，进程才算结束");
	}

}

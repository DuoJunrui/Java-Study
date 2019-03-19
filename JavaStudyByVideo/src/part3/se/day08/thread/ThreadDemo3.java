package part3.se.day08.thread;
/**
 * @author: 多俊睿
 * @data: 2019年3月19日 上午10:25:55
 * @Description: 使用匿名内部类完成两种线程创建方式
 */
public class ThreadDemo3 {

	public static void main(String[] args) {

		//方式一
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("你是谁啊？");
				}
			}
		};
		
		//方式二
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("我是查水表的。");
				}
				
			}
		};
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
}

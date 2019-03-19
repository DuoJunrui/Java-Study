package part3.se.day08.thread;
/**
 * @author: 多俊睿
 * @data: 2019年3月19日 上午11:57:21
 * @Description: 获取线程相关信息的一组方法
 */
public class ThreadDemo4 {

	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		
		//获取线程的名字
		String name = main.getName();
		System.out.println("name:" + name);

		//获取唯一标识
		long id = main.getId();
		System.out.println("id:" + id);
		
		int priority = main.getPriority();
		System.out.println("该线程的优先级："+priority);
		
		boolean isAlive = main.isAlive();
		System.out.println("是否存活：" + isAlive);
		
		boolean isDaemon = main.isDaemon();
		System.out.println("是否为守护线程：" + isDaemon);
		
		boolean isInterrupted = main.isInterrupted();
		System.out.println("是否被中断：" + isInterrupted);
	}

}

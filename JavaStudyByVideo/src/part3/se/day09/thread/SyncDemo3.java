package part3.se.day09.thread;
/**
 * @author: 多俊睿
 * @data: 2019年3月19日 下午7:40:08
 * @Description: 静态方法同样支持同步效果
 */
public class SyncDemo3 {
	public static void main(String args[]) {
		Thread t1 = new Thread() {
			public void run() {
				Foo.dosome();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				Foo.dosome();
			}
		};
		t1.start();
		t2.start();
	}

}

class Foo{
	public synchronized static void dosome() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+":正在执行···");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println(t.getName()+":运行结束！");
	}
}

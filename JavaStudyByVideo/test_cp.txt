package practice.march.eleventh;
/**
 * @author: 多俊睿
 * @data: 2019年3月12日 下午9:45:21
 * @Description: 实现两个线程交替打印0~100的奇偶数
 * 来源：微信公众号文章--收藏
 */
public class AlternateOutput {

	public static void main(String[] args) throws InterruptedException {
		
		Method2 m2 = new Method2();
		m2.turning();

		//Method3 m3 = new Method3();
		//m3.turning();
	}
}

/**
 * 整理一下方法二的代码，让其简洁一些
 */
class Method3{
	public void turning() throws InterruptedException {
		new Thread(new TurningRunner(),"偶数").start();
		//确保偶数线程先获取到锁
		Thread.sleep(1);
		new Thread(new TurningRunner(),"奇数").start();
	}
}

class TurningRunner implements Runnable {
	private int count = 0;
	private final Object lock = new Object();

	@Override
	public void run() {
		while (count <=100 ) {
			//获取锁
			synchronized (lock) {
				//拿到锁就打印
				System.out.println(Thread.currentThread().getName() + ":" + count++);
				//唤醒其他线程
				lock.notifyAll();
				try {
					if (count <= 100) {
						//如果还没有结束，则让出当前的锁并休眠
						lock.wait();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

/**
 * @author: 多俊睿
 * @data: 2019年3月12日 下午10:20:27
 * @Description: 方法二
 * 线程1打印之后唤醒其他线程，然后让出锁，自己进入休眠状态。
 * 因为进入了休眠状态就不会与其他线程抢锁，此时只有线程2在获取锁，所以线程2必然会拿到锁。
 * 线程2以同样的逻辑执行，唤醒线程1并让出自己持有的锁，自己进入休眠状态。
 * 这样来来回回，持续执行直到任务完成。就达到了两个线程交替获取锁的效果了。
 */
class Method2{
	private int count = 0;
	private final Object lock = new Object();
	
	public void turning() throws InterruptedException {
		Thread even = new Thread( () -> {
			while (count<=100) {
				synchronized (lock) {
					System.out.println("偶数：" + count++);
					lock.notifyAll();
					try {
						//如果还没有结束，则让出当前的锁并休眠
						if (count <= 100) {
							lock.wait();
						}
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		Thread odd = new Thread( () -> {
			while (count<=100) {
				synchronized (lock) {
					System.out.println("奇数：" + count++);
					lock.notifyAll();
					try {
						//如果还没有结束，则让出当前的锁并休眠
						if (count <= 100) {
							lock.wait();
						}
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}
		});
		
		even.start();
		//确保偶数线程先获取到锁
		Thread.sleep(1);
		odd.start();

	}
	
}

/**
 * @author: 多俊睿
 * @data: 2019年3月12日 下午10:06:53
 * @Description: 方法一
 * 要输出的时候排断一下当前需要输出的数是不是自己负责的奇数或者偶数，
 * 如果是则输出，如果不是就直接释放锁
 */
class Method1{
	private int count = 0;
	private final Object lock = new Object();
	
	public void turning() {
		Thread even = new Thread( () -> {
			while (count<100) {
				synchronized (lock) {
					//只处理偶数
					if ((count & 1) == 0) {
						System.out.println(Thread.currentThread().getName() + ":" + count++);
					}
				}
			}
		}, "偶数");
		
		Thread odd = new Thread( () -> {
			while (count<100) {
				synchronized (lock) {
					//只处理奇数
					if ((count & 1 ) == 1) {
						System.out.println(Thread.currentThread().getName() + ":" + count++);
						
					}
				}
			}
		}, "奇数");
		
		even.start();
		odd.start();

	}
}

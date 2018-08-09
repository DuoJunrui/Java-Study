package day8.exercise;

/**
 *  用Runnable接口实现线程创建
 * @author 多俊睿
 * @date 2018年7月26日 下午3:53:41 
 *
 */
public class SellTickets implements Runnable{
	
	private int tickets = 103; //定义总票数

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (tickets > 0 ) {
			
			synchronized (this) {
				
				if(tickets == 0) {
					break;
				}
				System.out.println(Thread.currentThread().getName()+"正在出售第"+ tickets + "张票。");
				tickets--;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
	


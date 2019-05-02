package day8.study;

public class SellTickets implements Runnable{
	
	private int tickets = 100;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (tickets > 0 ) {
			
			synchronized (this) {
				
				if(tickets == 0) {
					break;
				}
				System.out.println(Thread.currentThread().getName()+"���ڳ��۵�"+ tickets + "��Ʊ��");
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
	


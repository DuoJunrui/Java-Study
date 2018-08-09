package day8.exercise;

/**
 * 售票Main
 * @author 多俊睿
 * @date 2018年7月26日 下午3:56:03 
 *
 */
public class TicketsMain {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			SellTickets st=new SellTickets();
			
			Thread t1 = new Thread(st);
			Thread t2 = new Thread(st);
			Thread t3 = new Thread(st);
			Thread t4 = new Thread(st);
			Thread t5 = new Thread(st);
			
			t1.setName("一号窗口");
			t2.setName("二号窗口");
			t3.setName("三号窗口");
			t4.setName("四号窗口");
			t5.setName("五号窗口");
			
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();
		}

	}

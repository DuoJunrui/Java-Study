package day8.study;

public class Lock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SellTickets st=new SellTickets();
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);
		Thread t3 = new Thread(st);
		
		t1.setName("����һ");
		t2.setName("���ڶ�");
		t3.setName("������");
		
		t1.start();
		t2.start();
		t3.start();
	}

}

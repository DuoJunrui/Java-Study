package day8.exercise;

/**
 * ��ƱMain
 * @author �࿡�
 * @date 2018��7��26�� ����3:56:03 
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
			
			t1.setName("һ�Ŵ���");
			t2.setName("���Ŵ���");
			t3.setName("���Ŵ���");
			t4.setName("�ĺŴ���");
			t5.setName("��Ŵ���");
			
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();
		}

	}

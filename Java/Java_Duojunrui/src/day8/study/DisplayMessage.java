package day8.study;

/**
 * ʵ��Runnable�ӿ�ʵ���̴߳���
 * @author �࿡�
 * @date 2018��7��26�� ����9:54:51 
 *
 */
public class DisplayMessage implements Runnable {
	
	private String message;
	
	public DisplayMessage(String message) {
		
		this.message = message;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			System.out.println("ʵ��Runnable�ӿ�ʵ���̴߳���");
		}
		
	}
}

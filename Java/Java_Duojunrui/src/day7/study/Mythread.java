package day7.study;

public class Mythread extends Thread {
	
	public void run() {
		
		for(int i=0; i<50; i++) {
			
			System.out.println("i="+i);
			
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
	
	public void start() {
		
		for(int i=0; i<300; i++) {
			
			System.out.println(i);
			
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}


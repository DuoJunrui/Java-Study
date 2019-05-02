package day8.study;

public class CreatThread extends Thread {

	public void run() {
		
		//System.out.println(getName());
		
		for(int i=0; i<50; i++) {
			
			System.out.println("```````````````"+getName()+i+"``````````````");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
	

package day8.study;

public class ThreadExercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CreatThread ct1 = new CreatThread();
		CreatThread ct2 = new CreatThread();
		ct1.setName("�࿡�");
		ct2.setName("Eric");
		
		/**
		 * start()��������ֱ�ӵ���run()����
		 */
		//ct1.start(); 
		//ct2.run();
		
		
		/**
		 * �����ഴ���߳�
		 */
		CreatThread my = new CreatThread() {
			
			public void run() {
				for(int i=1;i<100;i++) {
					System.out.println("�����ഴ���̡߳�");
				}
				
			}
		};
		//my.run();
		
		CallableThread ct = new CallableThread();
		
		

	}

}

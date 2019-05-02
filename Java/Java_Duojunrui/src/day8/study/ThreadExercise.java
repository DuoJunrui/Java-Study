package day8.study;

public class ThreadExercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CreatThread ct1 = new CreatThread();
		CreatThread ct2 = new CreatThread();
		ct1.setName("多俊睿");
		ct2.setName("Eric");
		
		/**
		 * start()方法可以直接调用run()方法
		 */
		//ct1.start(); 
		//ct2.run();
		
		
		/**
		 * 匿名类创建线程
		 */
		CreatThread my = new CreatThread() {
			
			public void run() {
				for(int i=1;i<100;i++) {
					System.out.println("匿名类创建线程。");
				}
				
			}
		};
		//my.run();
		
		CallableThread ct = new CallableThread();
		
		

	}

}

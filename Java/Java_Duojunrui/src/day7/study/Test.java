package day7.study;

public class Test {

	public static void main(String[] args) {
		
		Mythread mythread= new Mythread();
		Mythread mythread2= new Mythread();

		mythread.start();
		mythread2.start();
		
	}

}

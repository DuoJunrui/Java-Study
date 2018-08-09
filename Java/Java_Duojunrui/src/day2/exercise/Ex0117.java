package day2.exercise;


class MyTime{
	private int hour;
	private int minute;
	private int second;
	
	public void MyTime() {
		
	}
	
	MyTime(int hour,int minute,int second) {
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	
	void display() {
		
		System.out.println("时间为："+hour+ "时" + minute+ "分" + second+"秒");
			
	}
	
}


public class Ex0117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTime time= new MyTime(5,20,50);
//		time.addHour(5);
//		time.addMinute(20);
//		time.addSencond(50);
		time.display();
	}

}

package day7.study;

public class Lambda {
	
	public static void main(String[] args) {
		Lambda lamda = new Lambda();
		lamda.display();		
	}
		
	//匿名内部类
	Teacher tea = new Teacher() {

		@Override
		public void show() {
			// TODO Auto-generated method stub
			int a=10;
			int b=20;
			System.out.println("a+b="+(a+b));
			System.out.println("这是教师的匿名内部类。");
		}	
		
//		public void add() {
//			
//			
//		}
	};
	
	//Lambda表达式  
	/**
	 * The target type of this expression must be a functional interface
	 * */
	Teacher tea2 = () ->System.out.println("这是lamda表达式！");  
	
	
	public void display() {
		tea.show();
		//tea.add();
		tea2.show();
		//tea2.add();//lambda表达式只能调用有一个方法的接口
		
	}
	
}

interface Teacher{
	
	void show();
	//void add();
}
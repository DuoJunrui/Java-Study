package day7.study;

public class Lambda {
	
	public static void main(String[] args) {
		Lambda lamda = new Lambda();
		lamda.display();		
	}
		
	//�����ڲ���
	Teacher tea = new Teacher() {

		@Override
		public void show() {
			// TODO Auto-generated method stub
			int a=10;
			int b=20;
			System.out.println("a+b="+(a+b));
			System.out.println("���ǽ�ʦ�������ڲ��ࡣ");
		}	
		
//		public void add() {
//			
//			
//		}
	};
	
	//Lambda���ʽ  
	/**
	 * The target type of this expression must be a functional interface
	 * */
	Teacher tea2 = () ->System.out.println("����lamda���ʽ��");  
	
	
	public void display() {
		tea.show();
		//tea.add();
		tea2.show();
		//tea2.add();//lambda���ʽֻ�ܵ�����һ�������Ľӿ�
		
	}
	
}

interface Teacher{
	
	void show();
	//void add();
}
package day1.exercise;

import org.omg.CORBA.PUBLIC_MEMBER;

//ģ������дһ���ֻ��ࡣ
public class Ex0112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p = new Phone("XiaoMi", "Mi5", "��ɫ", 1000);
		p.show();
	}
}
	
	//�ֻ���
	class Phone{
		String brand; //Ʒ��
		String model; //�ͺ�
		String color; //��ɫ
		double price; //�۸�
	
		public Phone (String b, String m, String c, double p) {
			this.brand=b;
			this.model=m;
			this.color=c;
			this.price=p;
			
			
		}
		public void show() {
			System.out.println("�ֻ�Ʒ���ǣ�" +this.brand+ "\n�ͺ�Ϊ:" + this.model+ "\n��ɫ��:" + this.color+ "\n�۸�:"+ this.price );
			
		}
	}



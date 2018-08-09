package day1.exercise;

import org.omg.CORBA.PUBLIC_MEMBER;

//模仿人类写一个手机类。
public class Ex0112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p = new Phone("XiaoMi", "Mi5", "金色", 1000);
		p.show();
	}
}
	
	//手机类
	class Phone{
		String brand; //品牌
		String model; //型号
		String color; //颜色
		double price; //价格
	
		public Phone (String b, String m, String c, double p) {
			this.brand=b;
			this.model=m;
			this.color=c;
			this.price=p;
			
			
		}
		public void show() {
			System.out.println("手机品牌是：" +this.brand+ "\n型号为:" + this.model+ "\n颜色是:" + this.color+ "\n价格:"+ this.price );
			
		}
	}



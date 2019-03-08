package part2.oop.day07;
/**
 * @author: 多俊睿
 * @data: 2019年3月8日 上午10:25:18
 * @Description: 匿名内部类演示
 */
public class NstInnerClassDemo {

	public static void main(String[] args) {
		
		//Coo o1 = new Coo(); //无法实例化类型Coo 抽象类不能被实例化
		
		/*
		 1)创建了一个Coo的派生类，但是没有名字
		 2)为该派生类创建了一个对象，名为o2
		 3)大括号里面的是派生类的类体，而非Coo的类体
		 */
		Coo o1 = new Coo() {
			
		};
		
		//1、创建了Doo的一个派生类，但是没有名字
		//2、为该派生类创建了一个对象，名为o3
		//3、大括号里面的是Doo的派生类的类体，而非Doo的类体
		Doo o3 = new Doo() {  //new Doo(){}类型必须实现继承的抽象方法Doo.show()
			@Override //重写
			void show() {
				System.out.println("showshow");
			}
		};
		o3.show(); //访问匿名内部类的对象，直接用o3 点就可以了
		//匿名内部类是一个派生类
	}
}

abstract class Doo{
	abstract void show();
}

abstract class Coo{
	
}
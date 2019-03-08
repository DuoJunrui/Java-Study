package part2.oop.day04;

/**
 * @author: 多俊睿
 * @data: 2019年3月6日 下午5:22:15
 * @Description: 向上造型演示
 */
public class UploadDemo {

	public static void main(String[] args) {
		Aoo a1 = new Aoo();
		a1.show();
		
		Boo b1 = new Boo();
		b1.show();
		b1.test();
		b1.a= 5;//派生类可以访问超类的变量
		
		Aoo a2 = new Boo(); //向上造型
		a2.a = 2;
		a2.show();
//		a2.test();
//		a2.b = 5; //编译错误，能点出来什么，看引用类型
		
//		Boo b2 = new Aoo(); // 编译错误，派生类不能新建超类
		

	}

}

class Aoo{
	int a ;
	void show() {
		System.out.println("Aoo");
	}
}

class Boo extends Aoo{
	int b;
	void test() {
		System.out.println("Boo");
	}
}
package part2.oop.day04;
/**
 * @author: 多俊睿
 * @data: 2019年3月6日 下午8:57:22
 * @Description: 重写和重载的区别
 */
public class OverrideOverloadDemo {
	public static void main(String[] args) {
		Goo goo = new Goo();
		Eoo o = new Foo(); //向上造型
		goo.test(o); //重载看参数类型Eoo，重写看对象参数
	}
}

//test是重载
class Goo{
	void test(Eoo o) {
		System.out.println("超类型参数");
		o.show();  //重写看对象Foo的参数 
	}
	void test(Foo o) {
		System.out.println("派生类型参数");
		o.show();
	}
}

//show是重写
class Eoo{
	void show() {
		System.out.println("超类show()");
	}
}

class Foo extends Eoo{
	void show() {
		System.out.println("派生类show()");
	}
}

package part2.oop.day05;
//final的演示
public class FinalDemo {
	public static void main(String[] args) {
	}
}

//演示final修饰类
final class Hoo{}
//class Ioo extends Hoo{} //编译错误，final修饰的类不能被继承
class Joo{}
final class Koo extends Joo{}


//演示final修饰方法
class Foo{
	final void show(){}
	void test(){}
}
class Goo extends Foo{
	//void show(){} //编译错误，final的方法不能被重写
	void test(){}
}



/*
 * final修饰成员变量，只有如下两种初始化方式:
 *   1)声明的同时初始化
 *   2)在构造方法中初始化
 * final修饰局部变量，在使用之前赋值即可
 */
class Eoo{ //演示final修饰变量
	final int a = 5;
	final int b;
	Eoo(){
		b = 6;
	}
	void test(){
		final int c;
		//a = 55; //编译错误，final的变量不能被改变
	}
}


















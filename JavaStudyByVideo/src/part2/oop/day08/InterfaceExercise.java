package part2.oop.day08;

public class InterfaceExercise {
	public static void main(String[] args) {
		//Inter4 o1 = new Inter4(); //接口不能被实例化
		Inter4 o2 = new Eoo(); //向上造型
		o2.c();
		o2.e();
		Inter3 o3 = new Eoo(); //向上造型
		o3.c();
	}
}

//接口和class类是并列关系

interface Inter1{
	public static final double PI = 3.14;
	void show();
}

interface Inter2{
	void a();
	void b();
}

class Aoo implements Inter2{
	public void a() {}
	public void b() {}
}

interface Inter3{
	void c();
}

class Boo implements Inter2,Inter3{
	public void a() {};
	public void b() {};
	public void c() {};
}

abstract class Coo{
	public abstract void d();
}

abstract class Doo extends Coo implements Inter2,Inter3{
	
}

interface Inter4 extends Inter3{
	void e();
}

class Eoo implements Inter4{
	public void e() {
		System.out.println("e()");
	}
	public void c() {
		System.out.println("c()");
	}
}

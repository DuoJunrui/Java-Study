package part2.oop.day05;
//static的演示
public class StaticDemo {
	public static void main(String[] args) {
		Loo o1 = new Loo();
		o1.show(); //1,1
		Loo o2 = new Loo();
		o2.show(); //1,2
		System.out.println(Loo.b); //2
		//System.out.println(o1.b); //不建议通过对象名来访问
		
		Moo.test();
		
		Noo o3 = new Noo();
		Noo o4 = new Noo();
		
	}
}

class Noo{ //演示静态块
	static{
		System.out.println("静态块");
	}
	Noo(){
		System.out.println("构造方法");
	}
}

class Moo{ //演示静态方法
	int a;
	static int b;
	void show(){ //有this
		System.out.println(this.a);
		System.out.println(Moo.b);
	}
	static void test(){ //没有this
		//静态方法没有隐式的this传递
		//没有this就意味着没有对象
		//而实例成员a必须通过对象点来访问
		//System.out.println(a); //编译错误
		System.out.println(Moo.b);
	}
}

class Loo{ //演示静态变量
	int a;
	static int b;
	Loo(){
		a++;
		b++;
	}
	void show(){
		System.out.println("a="+a+",b="+b);
	}
}



















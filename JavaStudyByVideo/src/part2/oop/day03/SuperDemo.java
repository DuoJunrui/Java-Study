package part2.oop.day03;
/**
 * @author: 多俊睿
 * @data: 2019年3月6日 下午3:16:11
 * @Description: super演示
 */
public class SuperDemo {
	public static void main(String[] args) {
		Aoo aoo = new Aoo();
		Boo boo = new Boo();
		Coo coo = new Coo("这需要传入Coo构造方法的参数str");
		Doo doo = new Doo();
	}
}

class Coo{
	Coo(String str){
			System.out.println(str);
	}
}
class Doo extends Coo{
	public Doo() {
		super("Coo");
		System.out.println("Doo");
	}
}


class Aoo{
	public Aoo() {
		System.out.println("超类的构造方法。");
	}
}
class Boo extends Aoo{
	public Boo() {
		super();//默认有一个超类的无参构造
		System.out.println("派生类的构造方法。");
	}
}

package part2.oop.day08;
/**
 * @author: 多俊睿
 * @data: 2019年3月9日 下午1:23:46
 * @Description: 接口的演示
 */
public class InterfaceDemo {

	public static void main(String[] args) {
		People people = new People();
		people.say();
	}
}

interface Inter5{
	void show(); //接口中的所有方法都是抽象方法 省略了public abstract
}

interface Inter6{
	public abstract void say(); //接口中的所有方法都是抽象方法
}

interface Inter7 extends Inter5,Inter6{ //接口可以继承多个接口
	void sing();
	//void song() {} //接口中的方法都是抽象方法，抽象方法没有方法体。
}

class People implements Inter6{ //类去实现接口，用implement
	public void say() { //实现接口要实现接口所有的抽象方法
		System.out.println("接口的实现。\n实现接口要实现接口所有的抽象方法");
	}
}
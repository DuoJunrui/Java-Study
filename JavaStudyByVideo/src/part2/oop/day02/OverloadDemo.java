package part2.oop.day02;
/**
 * @author: 多俊睿
 * @data: 2019年3月5日 下午5:13:54
 * @Description: 方法的重载
 */
public class OverloadDemo {
	public static void main(String[] args) {
		
		Aoo aoo = new Aoo();
		aoo.say();
		aoo.say(23);
		aoo.say("多俊睿");
		aoo.say(11, "皮卡丘");
		aoo.say("奥特曼", 99);
	}
}

class Aoo{
	
	void say() {}
	
	void say(String name) {}
	void say(int age) {}
	
	void say(String name, int age) {}
	void say(int age, String name) {}
	
	//int say() {return 0;} //编译错误， 方法的重载与返回值类型无关
	//void say(String address) {}  //编译错误。方法的重载与参数名称也无关
}

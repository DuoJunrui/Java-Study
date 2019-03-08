package part2.oop.day04;
/**
 * @author: 多俊睿
 * @data: 2019年3月6日 下午8:36:37
 * @Description: 重写的演示
 */
public class OverrideDemo {

	public static void main(String[] args) {
		

	}

}

//超类大，派生类小
class Coo{
	void show() {}
	double test() {return 0.0;}
	Coo say() {return null;}
	Doo sayHi() {return null;}
}

class Doo extends Coo{
	//int show() {return 1;} //重写时 void 类型要一致
	//int test() {return 0;} //重写时基本数据类型得一致
	Doo say() {return null;} //小于
}

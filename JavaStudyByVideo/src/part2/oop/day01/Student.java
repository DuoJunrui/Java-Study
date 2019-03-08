package part2.oop.day01;
/**
 * 
 * @author: 多俊睿
 * @data: 2019年3月5日 下午1:36:30
 * @Description: 对象、类、属性、方法、
 */

//学生类
public class Student {
	
	//成员变量
	String name;
	int age;
	String address;
	
	//创建一个学习的方法
	void study() {
		System.out.println(name+"正在学习。");
	}
	//创建一个报道的方法
	void report() {
		System.out.println("大家好，我是"+name+",今年"+age+"岁，家住"+address);
	}

}

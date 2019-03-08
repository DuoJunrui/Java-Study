package part2.oop.day01;
/**
 * 
 * @author: 多俊睿
 * @data: 2019年3月5日 下午1:36:40
 * @Description: 对象、类、属性、方法、
 */

public class StudentTest {

	public static void main(String[] args) {
		
		Student stu1 = new Student();
		stu1.name="多俊睿";
		stu1.age=23;
		stu1.address="甘肃省武威市";
		stu1.study();
		stu1.report();
		
		Student stu2 = new Student();
		stu2.name="黄虎林";
		stu2.age=22;
		stu2.address="河北冀州";
		stu2.study();
		stu2.report();

		// Student stu3 = new Student(); 完成了两件事
		// 1).创建一个学生对象
		// 2).给所有成员变量都赋默认值
		Student stu3 = new Student();
		
		stu3.study(); //null正在学习。
		stu3.report(); //大家好，我是null,今年0岁，家住null
	}

}

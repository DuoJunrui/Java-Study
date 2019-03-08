package part2.oop.day02;
/**
 * 
 * @author: 多俊睿
 * @data: 2019年3月5日 下午10:27:20
 * @Description: 构造方法  this
 */
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//调用构造方法
		Student djr = new Student();
		
		Student zhangsan = new Student("张三", "广西桂林");
		System.out.println(zhangsan.address);
		
		Student lisi = new Student("李四",15,"广东惠州");
	}

}

class Student{
	String name;
	int age;
	String address;
	
	public Student() {
		System.out.println("这是一个无参的构造方法,什么信息也没有");
	}
	
	public Student(String name, String address){
		this.name = name;
		this.address = address;
		System.out.println("这是一个有参的构造方法，有参数 姓名："+name+"地址:"+address);
	}
	
	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
		System.out.println("这是一个有参的构造方法，有参数 姓名："+name+"，年龄："+age+",地址:"+address);
	}
	
}

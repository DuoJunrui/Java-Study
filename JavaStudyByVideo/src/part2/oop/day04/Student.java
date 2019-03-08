package part2.oop.day04;

public class Student extends Person{
	int stuId;
	public Student(String name, int age, String address, int stuId) {
		super(name, age, address);
		this.stuId = stuId;
	}
	
	//重写
	void sayHai(){
		System.out.println("姓名："+name+"，年龄："+age+"，地址："+address + "，学号："+stuId);
	}

}

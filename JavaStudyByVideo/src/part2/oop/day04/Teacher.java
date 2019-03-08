package part2.oop.day04;

public class Teacher extends Person{
	int salary;
	public Teacher(String name, int age, String address, int salary) {
		super(name, age, address);
		this.salary = salary;
	}

	void sayHai(){
		System.out.println("姓名："+name+"，年龄："+age+"，地址："+address+"，薪资："+salary);
	}
}

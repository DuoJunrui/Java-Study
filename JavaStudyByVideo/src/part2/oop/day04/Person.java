package part2.oop.day04;

public class Person {
	String name;
	int age;
	String address;
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address =address;
	}
	
	void sayHai(){
		System.out.println("姓名："+name+"，年龄："+age+"，地址："+address);
	}
}

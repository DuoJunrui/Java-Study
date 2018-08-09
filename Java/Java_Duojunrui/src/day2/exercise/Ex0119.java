package day2.exercise;

class Person{
	private String Name;
	private String Age;
	
	
	Person(String Name, String Age) {
		this.Name=Name;
		this.Age=Age;	
	}
	
	void show() {
		System.out.println("姓名："+Name);
		System.out.println("年龄："+Age);
	
	}
}

public class Ex0119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("多俊睿", "20");
//		p.get("多俊睿", "22");
		p.show();
	}

}


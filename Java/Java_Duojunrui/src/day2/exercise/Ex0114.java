package day2.exercise;

import java.util.Scanner;

class Employee{
	String name;
	String province;
	String city;
	String street;
	String postcode;
	
	public void changename(String name1,String province1,String city1,String street1,String postcode1) {
		this.name=name1;
		this.province=province1;
		this.city=city1;
		this.street=street1;
		this.postcode=postcode1;
		
	}
	
	public void display() {
		System.out.println("������"+name);
		System.out.println("ʡ�ݣ�"+province);
		System.out.println("���У�"+city);
		System.out.println("�ֵ���"+street);
		System.out.println("�ʱࣺ"+postcode);
	}
}

public class Ex0114 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Emp = new Employee();
		Emp.changename("�࿡�", "����ʡ", "������", "������·", "541000");
		Emp.display();
	}

}

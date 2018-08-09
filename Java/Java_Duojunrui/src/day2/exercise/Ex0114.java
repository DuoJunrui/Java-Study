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
		System.out.println("姓名："+name);
		System.out.println("省份："+province);
		System.out.println("城市："+city);
		System.out.println("街道："+street);
		System.out.println("邮编："+postcode);
	}
}

public class Ex0114 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Emp = new Employee();
		Emp.changename("多俊睿", "广西省", "南宁市", "九曲湾路", "541000");
		Emp.display();
	}

}

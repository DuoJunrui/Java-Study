package com.syh.ex117;

public class MyTimeDemo {
	public static void main(String[] args) {
		MyTime m = new MyTime(1, 60, 60);
		System.out.println(m.display());
		
		m.addMinute(10);
		System.out.println(m.display());
		m.addMinute(70);
		System.out.println(m.display());
		
		m.addSecond(10);
		System.out.println(m.display());
		m.addSecond(70);
		System.out.println(m.display());
	}
}

package com.syh.ex130;

import java.io.IOException;
import java.util.Scanner;

public class StudentAnswer {
	public static void main(String[] args) throws IOException {
		Student s = new Student("Lili", "大三");
		
		//开始答题
		s.startzAnswer();
		while(s.hasNextAsk()) {
			System.out.println(s.nextAsk());
			System.out.print("答案为：");
			s.writeSolve(new Scanner(System.in).nextLine());
		}
		
		System.out.println("分数为：" + s.showGraden());
	}
}

package com.syh.ex130;

import java.io.IOException;
import java.util.Scanner;

public class StudentAnswer {
	public static void main(String[] args) throws IOException {
		Student s = new Student("Lili", "����");
		
		//��ʼ����
		s.startzAnswer();
		while(s.hasNextAsk()) {
			System.out.println(s.nextAsk());
			System.out.print("��Ϊ��");
			s.writeSolve(new Scanner(System.in).nextLine());
		}
		
		System.out.println("����Ϊ��" + s.showGraden());
	}
}

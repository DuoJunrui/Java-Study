package day4.exercise.stream;

import java.io.IOException;
import java.util.Scanner;

public class Ex0130 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Teacher tea;
		Student stu;
		System.out.println("1. ��ʦ��¼  2. ѧ����¼");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if(i==1) {
			System.out.println("�������ʦ������");
			String name = sc.nextLine();
			name = sc.nextLine();
			
			System.out.println("�������ʦ���䣺");
			int age = sc.nextInt();
			
			System.out.println("�������ʦְ�ƣ�");
			String title = sc.nextLine();
			title = sc.nextLine();
			
			System.out.println("������༶��Ϣ��");
			String grade = sc.nextLine();
			
			tea = new Teacher(name, age, title, grade);
			
			Teacher.writeTest(tea);
			
			//System.out.println(tea.getAge());
		}
		
		if(i==2) {
			System.out.println("������ѧ��������");
			String name = sc.nextLine();
			name = sc.nextLine();
			
			System.out.println("������ѧ���༶���ԣ�");
			String grade = sc.nextLine();
			
			//System.out.println("������ѧ��������");
			//String score = sc.nextLine();
			
			//stu = new Student(name, grade, score);
			System.out.println("���ο��������£��������д�������������еĴ�");
			Student.answer();
			String key = sc.nextLine();
		}
		//stu.answer();
 
	}
	

}




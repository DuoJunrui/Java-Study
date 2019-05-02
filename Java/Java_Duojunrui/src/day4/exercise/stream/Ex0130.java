package day4.exercise.stream;

import java.io.IOException;
import java.util.Scanner;

public class Ex0130 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Teacher tea;
		Student stu;
		System.out.println("1. 教师登录  2. 学生登录");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if(i==1) {
			System.out.println("请输入教师姓名：");
			String name = sc.nextLine();
			name = sc.nextLine();
			
			System.out.println("请输入教师年龄：");
			int age = sc.nextInt();
			
			System.out.println("请输入教师职称：");
			String title = sc.nextLine();
			title = sc.nextLine();
			
			System.out.println("请输入班级信息：");
			String grade = sc.nextLine();
			
			tea = new Teacher(name, age, title, grade);
			
			Teacher.writeTest(tea);
			
			//System.out.println(tea.getAge());
		}
		
		if(i==2) {
			System.out.println("请输入学生姓名：");
			String name = sc.nextLine();
			name = sc.nextLine();
			
			System.out.println("请输入学生班级属性：");
			String grade = sc.nextLine();
			
			//System.out.println("请输入学生姓名：");
			//String score = sc.nextLine();
			
			//stu = new Student(name, grade, score);
			System.out.println("本次考试题如下，请在最后写出本次试题所有的答案");
			Student.answer();
			String key = sc.nextLine();
		}
		//stu.answer();
 
	}
	

}




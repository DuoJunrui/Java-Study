package day2.exercise;

import java.util.Random;

public class Ex0123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ran = new Random();
		
		
		Student1[] stu = new Student1[] {
				
			new Student1("马云",ran.nextInt(100)),
			new Student1("马化腾",ran.nextInt(100)),
			new Student1("雷军",ran.nextInt(100)),
			new Student1("董明珠",ran.nextInt(100)),
			new Student1("王健林",ran.nextInt(100))
		};

		System.out.println("五位同学的成绩如下：");
		for (int i = 0; i < stu.length; i++) {
			System.out.println("姓名："+ stu[i].getGName()+ "  成绩："+ stu[i].getGrade());
		}
		
		for (int i = 0; i < stu.length-1; i++) {
			
			for (int j = 0; j < stu.length-1-i; j++) {
				
				if(stu[j].getGrade() < stu[j+1].getGrade()) {
					Student1 temp ;
					temp = stu[j];
					stu[j] = stu[j+1];
					stu[j+1] = temp;
				}
				
			}
			
		}
		
		System.out.println("\n排序后的成绩如下");
		for (int i = 0; i < stu.length; i++) {
			
			System.out.println("姓名："+ stu[i].getGName()+  "  成绩："+ stu[i].getGrade()+ "  名次："+ (i+1));
		}
	}
}
	
	class Student1{
		String name ;
		int grade;
		
		public Student1(String name, int grade) {
			// TODO Auto-generated constructor stub
			this.name=name;
			this.grade=grade;
		
		}

		public int getGrade() {
			
			return grade;
			
		}
		
		public void setGrade(int grade) {
			this.grade=grade;
		}
		
		public String getGName() {
			
			return name;
			
		}
		
		public void setName(String name) {
			this.name=name;
		}
}



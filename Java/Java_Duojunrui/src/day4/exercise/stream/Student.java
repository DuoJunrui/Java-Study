package day4.exercise.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//创建学生类
class Student {
	
	private String name; //姓名
	private String grade; //班级属性
	private int score;  //分数
	
	public Student(String  name, String grade , int score) {
		
		this.name = name;
		this.grade = grade;
		this.score = score; 
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	private String key=""; //获取答案
	//读取试题信息
	static void answer() throws IOException {
		File file = new File("Test.txt");//指定要读取的文件名
		
		//获取试题文件的输入了
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		
		String line ="";  //用来保存每次读取一行的内容
		while((line = bufferedReader.readLine()) != null) {
			
			System.out.println(line); 
		}
		
		bufferedReader.close();//关闭输入流
	}
}
	

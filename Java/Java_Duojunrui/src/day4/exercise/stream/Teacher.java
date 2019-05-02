package day4.exercise.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


//创建教师类
class Teacher {
	
	String name; // 教师姓名
	int age; // 教师年龄
	String title; // 教师职称
	String grade; // 班级属性
	
	public Teacher (String name,int age, String title,String grade) {
		this.name = name;
		this.age = age;
		this.title = title;
		this.grade = grade;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}

public static void writeTest(Teacher tea) throws IOException {
	
	File file = new File("Test.txt");// 指定要写入的文件
	if (!file.exists()) { // 如果文件不存在，则进行创建
		file.createNewFile();
	}

	// 获取文件的缓冲流
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

	// 写入试题
	String str ="Y";
	while (str.equals("Y")) {
		System.out.println("请输入您要写入的试题（一行写入，请不要换行）:");
		String str1 = bufferedReader.readLine();
		bufferedWriter.write(str1);
		bufferedWriter.newLine();
		System.out.println("请输入该试题的各个选项（一行写入所有选项，请不要换行）:");
		String str2 = bufferedReader.readLine();
		bufferedWriter.write(str2);
		bufferedWriter.newLine();
		System.out.println("请输入该试题的答案（一行写入，请不要换行）:");
		String str3 = bufferedReader.readLine();
		bufferedWriter.write(str3);
		bufferedWriter.newLine();
		System.out.println("输入Y(大写)继续写入试题，按其他字符完成写入并退出！:");
		str = bufferedReader.readLine();
	}

	bufferedWriter.flush();// 清空缓冲区
	bufferedWriter.close();// 关闭输出流
	System.out.println("提示：试题信息写入完成。");
}
}
	
	
	

/*	// 写入教师信息
	void writeTeacher() throws IOException {
		File file = new File("teacher.txt");
		if (!file.exists()) { // 如果文件不存在，则进行创建
			file.createNewFile();
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));

		System.out.println("请输入教师姓名：");
		name = br.readLine();
		System.out.println("请输入教师年龄：");
		age = br.read();
		System.out.println("请输入教师职称：");
		title = br.readLine();
		System.out.println("请输入班级属性：");
		grade = br.readLine();
		
		bw.flush();
		bw.close();
		br.close();
		
	}*/

	
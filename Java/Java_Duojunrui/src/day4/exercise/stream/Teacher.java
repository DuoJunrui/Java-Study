package day4.exercise.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


//������ʦ��
class Teacher {
	
	String name; // ��ʦ����
	int age; // ��ʦ����
	String title; // ��ʦְ��
	String grade; // �༶����
	
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
	
	File file = new File("Test.txt");// ָ��Ҫд����ļ�
	if (!file.exists()) { // ����ļ������ڣ�����д���
		file.createNewFile();
	}

	// ��ȡ�ļ��Ļ�����
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

	// д������
	String str ="Y";
	while (str.equals("Y")) {
		System.out.println("��������Ҫд������⣨һ��д�룬�벻Ҫ���У�:");
		String str1 = bufferedReader.readLine();
		bufferedWriter.write(str1);
		bufferedWriter.newLine();
		System.out.println("�����������ĸ���ѡ�һ��д������ѡ��벻Ҫ���У�:");
		String str2 = bufferedReader.readLine();
		bufferedWriter.write(str2);
		bufferedWriter.newLine();
		System.out.println("�����������Ĵ𰸣�һ��д�룬�벻Ҫ���У�:");
		String str3 = bufferedReader.readLine();
		bufferedWriter.write(str3);
		bufferedWriter.newLine();
		System.out.println("����Y(��д)����д�����⣬�������ַ����д�벢�˳���:");
		str = bufferedReader.readLine();
	}

	bufferedWriter.flush();// ��ջ�����
	bufferedWriter.close();// �ر������
	System.out.println("��ʾ��������Ϣд����ɡ�");
}
}
	
	
	

/*	// д���ʦ��Ϣ
	void writeTeacher() throws IOException {
		File file = new File("teacher.txt");
		if (!file.exists()) { // ����ļ������ڣ�����д���
			file.createNewFile();
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));

		System.out.println("�������ʦ������");
		name = br.readLine();
		System.out.println("�������ʦ���䣺");
		age = br.read();
		System.out.println("�������ʦְ�ƣ�");
		title = br.readLine();
		System.out.println("������༶���ԣ�");
		grade = br.readLine();
		
		bw.flush();
		bw.close();
		br.close();
		
	}*/

	
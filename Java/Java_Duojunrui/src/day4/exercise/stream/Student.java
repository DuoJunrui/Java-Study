package day4.exercise.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//����ѧ����
class Student {
	
	private String name; //����
	private String grade; //�༶����
	private int score;  //����
	
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

	private String key=""; //��ȡ��
	//��ȡ������Ϣ
	static void answer() throws IOException {
		File file = new File("Test.txt");//ָ��Ҫ��ȡ���ļ���
		
		//��ȡ�����ļ���������
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		
		String line ="";  //��������ÿ�ζ�ȡһ�е�����
		while((line = bufferedReader.readLine()) != null) {
			
			System.out.println(line); 
		}
		
		bufferedReader.close();//�ر�������
	}
}
	

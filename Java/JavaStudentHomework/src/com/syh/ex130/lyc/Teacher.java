package test01;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Teacher {
	
	private String name;
	private int age;
	private String professional;
	private String className;
	
	public Teacher() {
		
	}
	public Teacher(String name,int age,String professional,String className) {
		this.name = name;
		this.age = age;
		this.professional = professional;
		this.className = className;
	}
	
	public void writeHomeWork(String writeWord) {
		File file = new File("test.txt");
		try {
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file,true));
			//写数据
			bos.write(writeWord.getBytes());
			//释放资源
			bos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Student[] sortgrate(List<Student> stuList) {
			Student[] stus = {};
			Student temp = null;
			if(stuList.size() != 0) {
				stus = new Student[stuList.size()];
				for (int i=0;i<stuList.size();i++) {
					stus[i] = stuList.get(i);
				}
				for(int i = 0;i<stus.length;i++) {
					for(int j = i+1;i<stus.length;i++) {
						if(stus[i].getGrate()<stus[j].getGrate()) {
							temp =stus[i];
							stus[i] = stus[j];
							stus[j] = temp;
						}
					}
				}
			}
			return stus;
	}
	
	public void writeAnswer(String putAnswer) {
		File file = new File("answer.txt");
		try {
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file,true));
			//写数据
			bos.write(putAnswer.getBytes());
			//释放资源
			bos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public  List<Student> getStudentInfo() {
		    List<Student> stuList = new ArrayList<>();
			try {
				 BufferedReader br = new BufferedReader(new FileReader("student.txt")); 
				 String line = "";
				 while((line = br.readLine())!= null){
					 Student stu = new Student();
					 stu.setName(line.substring(0,line.indexOf('：')));
					 stu.setGrate(Integer.parseInt(line.substring(line.indexOf('：')+1, line.length())));
					 stuList.add(stu);
			        }
			} catch (IOException e) {
				e.printStackTrace();
			} 
			return stuList;
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
	public String getProfessional() {
		return professional;
	}
	public void setProfessional(String professional) {
		this.professional = professional;
	}
	
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
}

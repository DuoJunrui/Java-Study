package test01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Student {
	
	private String name;
	private String className;
	private int grate;
	
	public Student() {
		
	}
	public Student(String name,String className) {
		this.name = name;
		this.className = className;
	}
	 
	
	public Map<String,Object> getAnswer(Map<String,Object> rightAnswer,Map<String,Object> putAnswer) {
		if(rightAnswer.size()== 0) {
			System.out.println("请传入正确答案！");
			return null;
		}
		if(putAnswer.size() == 0) {
			System.out.println("请传入您的答案！");
			return null;
		}
		int count = 0;//正确答案数
		int grate = 0;//分数
		Map<String,Object> map = new HashMap<>();
		for(String key:rightAnswer.keySet()) {
			if(rightAnswer.get(key).equals(putAnswer.get(key))) {
				count++;
				grate += 10;
			}
		}
		map.put("count", count);
		map.put("grate", grate);
		return map;
		
	}
	
	  public String getHomeWork() {
			StringBuilder strBuild= new StringBuilder();
			try {
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream("test.txt"),2*1024);
				int tmp=0;
				byte[] byteArray=new byte[1024];
				 while((tmp=bis.read(byteArray))!=-1){
					 strBuild.append(new String(byteArray,0,tmp));
			        }
			} catch (IOException e) {
				e.printStackTrace();
			} 
			return strBuild.toString();
		}
	  
	  public  Map<String,Object> getRightAnswer() {
		    Map<String,Object> map = new HashMap<>();
			try {
				 BufferedReader br = new BufferedReader(new FileReader("answer.txt")); 
				 String line = "";
				 while((line = br.readLine())!= null){
					 map.put(line.substring(0,line.indexOf('.')), line.substring(line.indexOf('.')+1, line.length()));
			        }
			} catch (IOException e) {
				e.printStackTrace();
			} 
			return map;
		}
	  
	  public void saveStudentInfo(String studentInfo) {
			File file = new File("student.txt");
			try {
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file,true));
				//写数据
				bos.write(studentInfo.getBytes());
				//释放资源
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	  
	  @Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+"："+this.grate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getGrate() {
		return grate;
	}
	public void setGrate(int grate) {
		this.grate = grate;
	}
	
}

package day5.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
 
public class StudentList {
 
	private List<Student>stuList;
	private int size;
	
	public StudentList() {
		size=0;
		stuList=null;
	}
	
     public void createStudent() {
    	 Random ran = new Random();
    	 String names[]= {"�ĺ�","����","����","���","����","����","Ů��","����","����","����"};
    	 int grades[]= {ran.nextInt(100),ran.nextInt(100),ran.nextInt(100),ran.nextInt(100),ran.nextInt(100),
    			 		ran.nextInt(100),ran.nextInt(100),ran.nextInt(100),ran.nextInt(100),ran.nextInt(100)};
    	 size=names.length;
    	 stuList=new ArrayList<Student>();
    	 Student temp;
    	 
    	 for(int i=0;i<size;i++) {
    		 temp=new Student(names[i],grades[i]);
    		 stuList.add(temp);
    	 }
     }
     
     public void sort() {
    	 Student temp;
    	 for(int i=0;i<size;i++) {
    		 for(int j=1;j<size-i;j++) {
    			 if(stuList.get(j-1).getGrade()>stuList.get(j).getGrade()) {
    				 temp=stuList.get(j-1);
    				 stuList.set(j-1,stuList.get(j));
    				 stuList.set(j, temp);
    			 }
    		 }
    	 }
     }
     
     public String output() {
    	 StringBuilder studentInfo=new StringBuilder();
    	 for(Student stu:stuList) {
    		 studentInfo.append("������"+stu.getName()+"\t�ɼ���"+stu.getGrade()+"\r\n");
    	 }
    	 return studentInfo.toString();
     }
}
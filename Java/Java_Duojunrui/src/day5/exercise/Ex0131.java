package day5.exercise;

public class Ex0131 {
 
	public static void main(String[] args) {
		
	StudentList sl=new StudentList();
	sl.createStudent();
	System.out.println("原始数据序列：");
	System.out.println(sl.output());
	sl.sort();
	System.out.println("冒泡排序结果：");
	System.out.println(sl.output());
	}
}

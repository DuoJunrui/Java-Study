package day5.exercise;

public class Ex0131 {
 
	public static void main(String[] args) {
		
	StudentList sl=new StudentList();
	sl.createStudent();
	System.out.println("ԭʼ�������У�");
	System.out.println(sl.output());
	sl.sort();
	System.out.println("ð����������");
	System.out.println(sl.output());
	}
}

package day4.exercise.streamexample;

import java.io.IOException;

public class TeacherSortStudent {
	public static void main(String[] args) throws IOException {
		Teacher t = new Teacher("˾��Ǩ", 10, "����");
		String[][] sss = t.showSort();
		
		int i = 0;
		for ( String[] ss : sss ) {
			System.out.println("��" + ++i + "����"  + ss[0] + "(" + ss[1] + ")" + "��" + ss[2] + "��");
		}
	}
}

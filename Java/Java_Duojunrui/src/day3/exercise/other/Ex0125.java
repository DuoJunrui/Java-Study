package day3.exercise.other;

import java.util.Calendar;

public class Ex0125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] week = {"������","����һ","���ڶ�","������","������","������","������"};
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DATE);
		
		System.out.println("�����ǣ�"+year+"��"+month+"��"+day+"��  " + week[c.get(Calendar.DAY_OF_WEEK)-1]); 
		
	}

}

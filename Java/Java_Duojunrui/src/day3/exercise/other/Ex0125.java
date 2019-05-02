package day3.exercise.other;

import java.util.Calendar;

public class Ex0125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] week = {"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DATE);
		
		System.out.println("今天是："+year+"年"+month+"月"+day+"日  " + week[c.get(Calendar.DAY_OF_WEEK)-1]); 
		
	}

}

package day3.exercise.other;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

//使用Calendar分别获取当前日期的年，月，日，并获取本月的月初和月末
public class Ex0124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DATE);
		
		int firstday = c.getActualMinimum(Calendar.DAY_OF_MONTH);
		
		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		 
		System.out.println("今天是："+year+"年"+month+"月"+day+"日"); 
		System.out.println("本月月初时间为："+month+"月"+firstday+"日"); 
		System.out.println("本月月末时间为："+month+"月"+lastday+"日"); 
		
//		 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//		 
//		 String today = format.format(Calendar.getInstance().getTime());
//		 
//		 System.out.println("今天的年月日是：" + today);
//		         
//		 String firstday= format.format(Calendar.getInstance().DAY_OF_MONTH);
//		 System.out.println(firstday);        
	}

}

package day3.exercise.other;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

//ʹ��Calendar�ֱ��ȡ��ǰ���ڵ��꣬�£��գ�����ȡ���µ��³�����ĩ
public class Ex0124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DATE);
		
		int firstday = c.getActualMinimum(Calendar.DAY_OF_MONTH);
		
		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		 
		System.out.println("�����ǣ�"+year+"��"+month+"��"+day+"��"); 
		System.out.println("�����³�ʱ��Ϊ��"+month+"��"+firstday+"��"); 
		System.out.println("������ĩʱ��Ϊ��"+month+"��"+lastday+"��"); 
		
//		 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//		 
//		 String today = format.format(Calendar.getInstance().getTime());
//		 
//		 System.out.println("������������ǣ�" + today);
//		         
//		 String firstday= format.format(Calendar.getInstance().DAY_OF_MONTH);
//		 System.out.println(firstday);        
	}

}

package day3.exercise.other;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex0127 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("YY-MM-dd \nHH-mm-ss");
		String nowtime = sdf.format(date);

	System.out.println(nowtime);
	}

}

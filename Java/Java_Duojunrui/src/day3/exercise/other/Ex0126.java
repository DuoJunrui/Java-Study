package day3.exercise.other;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Ex0126 {

	public static void main(String[] args) throws ParseException {

		// 将字符串转为日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dstr = "2018-08-15 00:00:00 ";
		java.util.Date date = sdf.parse(dstr);
		long s1 = date.getTime();// 将时间转为毫秒
		long s2 = System.currentTimeMillis();// 得到当前的毫秒
		int day = (int) ((s1 - s2) / 1000 / 60 / 60 / 24);
		System.out.println("现在离八月十五日还有" + day + "天，现在算日子，想放假？");

	}

}

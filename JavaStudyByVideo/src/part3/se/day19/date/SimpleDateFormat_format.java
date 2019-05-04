package part3.se.day19.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: 多俊睿
 * @data: 2019年5月4日 下午7:07:10
 * @Description: java.text.SimpleDateFormat
 * SDF可以根据给定的日期格式将字符串与Date之间相互转换
 */
public class SimpleDateFormat_format {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
		/**
		 * String format(Date date)
		 * 将给定的Date按照当前sdf指定的日期格式转换为对应内容的字符创
		 */
		String str = sdf.format(date);
		System.out.println(str);

	}

}

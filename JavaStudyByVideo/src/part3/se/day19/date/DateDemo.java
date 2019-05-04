package part3.se.day19.date;

import java.util.Date;

/**
 * @author: 多俊睿
 * @data: 2019年5月4日 下午6:54:00
 * @Description: java.util.Date
 * Date的每一个实例用户表示一个切的时间。
 *   内部维护一个long值，该值为1970年1月1日00:00:00:到当前
 * Date所表示的时间之间所经历的毫秒。
 * 由于Date设计时存在时区问题，所以大部分操作时间的方法都被声明为过时的，不建议使用
 */
public class DateDemo {

	public static void main(String[] args) {
		// 默认实例化表示当前系统时间
		Date date = new Date();
		System.out.println(date);
		// 获取Date内部维护的long值
		long time = date.getTime();
		
		// 一天的毫秒值
		time += 1000*60*60*24;
		
		// 可以设置一个long值 使Date表示该日期
		date.setTime(time);
		System.out.println(date);

	}

}

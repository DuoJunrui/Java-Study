package part1.basic.day03;

import java.util.Scanner;

/**
 * 
 * @author: 多俊睿
 * @data: 2019年2月28日 下午11:11:34
 * @Description: Day2的作业
 */
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.print("请输入年份：");
		int year = userInput.nextInt();
		System.out.println("year="+year);
		
		/**
		 * 排断该年份是否是闰年
		 */
		boolean flag = (year%4==0 && year%100!=0) || (year%400==0); //逻辑与
		String str = flag ? year+"是闰年。" : year+"是平年。";  //三目运算
		System.out.println(str);
		
		userInput.close();
	}

}

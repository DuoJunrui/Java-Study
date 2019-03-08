package part1.basic.day05;

import java.util.Scanner;
/**
 * 
 * @author: 多俊睿
 * @data: 2019年3月2日 下午10:51:15
 * @Description: 作业！！！ 反复看一下！！！
 */
public class Homework {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//数列求和（一）9+99+999+9999....+9999999999
		long sum1=0;
		long num=0;
		for (int i = 1; i <= 10; i++) {
			num = num*10+9;
			sum1 = sum1+num;
		}
		System.out.println("sum="+sum1);
		
		
		//数列求和（二）
		double sum2=0;
		System.out.println("请输入一个整数（例如10）：");
		double  i = scan.nextInt();
		for (; i >=1; i--) {
			sum2= sum2 + (1.0/i);
		}
		System.out.println("sum2="+sum2);

		scan.close();

	}

}

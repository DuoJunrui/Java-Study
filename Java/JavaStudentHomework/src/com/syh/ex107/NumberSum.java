package com.syh.ex107;

import java.util.Scanner;

/** 
 *  写一条for语句，要求从键盘录入两个整形数字m和n，之后求出n~m的和。（例如，输入1和4，那么其和为1+2+3+4=10）
 */
public class NumberSum {
	public static void main(String[] args) {
		//用于允许用户在控制台进行输入
		Scanner sc = new Scanner(System.in);
				
		//用于存储用户输入的范围
		int m = 0;
		int n = 0;
		
		//用于求和
		int sum = 0;
		
		//请求输入
		while (true) {
			System.out.println("请输入m的值");
			m = sc.nextInt();
			System.out.println("请输入n的值");
			n = sc.nextInt();
			
			//判断m是否小于n，注意，题目要求先输入m，再输入n，求的是n~m的和
			//如果输入有误，则提示重新输入
			if ( m < n ) {
				System.out.println("您的输入有误，请重新输入");
				continue;
			}
			
			break;
		}
		
		System.out.print(n + "~" + m + "的各个数字相加的和为：");
		//循环，将所有数字相加
		while ( n <= m ) {
			sum += n++;
		}
		System.out.println(sum);
	}
}

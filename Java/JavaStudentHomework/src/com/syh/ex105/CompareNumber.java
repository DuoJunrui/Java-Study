package com.syh.ex105;

import java.util.Scanner;

/**
 * 键盘数据三个数，判断并获取三个数中较大的值，在后台打印出结果
 */
public class CompareNumber {
	public static void main(String[] args) {
		//用于允许用户在控制台进行输入
		Scanner sc = new Scanner(System.in);
		//收集最大值
		int max = 0;
		//存储用户输入
		int tem = 0;
		
		//提示输入
		System.out.print("请输入第一个整数：");
		max = sc.nextInt();
		System.out.print("请输入第二个整数：");
		tem = sc.nextInt();
		max = ( tem > max ? tem : max );
		System.out.print("请输入第三个整数：");
		tem = sc.nextInt();
		max = ( tem > max ? tem : max );
		
		//输出最大值
		System.out.println(max);
	}
}

package com.syh.ex122;

import java.util.Scanner;

/**
 * 求s = a + aa + aaa + aaaa + aa...a的值，其中a是一个数字。例如2 + 22 + 222 + 2222 + 22222
 * (此时共有5个数相加)，几个数相加有键盘控制
 */
public class IntegerSum {
	public static void main(String[] args) {
		//定义参与连加的数字
		int num = 0;
		//定义连加的数字
		int count = 0;
		//定义连加的结果，注意，当输入的数字过大时会超出int的范围，所以此处可以将其尽可能定为long类型
		long sum = 0;
		//允许用户键盘录入数据
		Scanner sc = new Scanner(System.in);
		
		//提示用户输入
		System.out.print("请输入参与连加的数字：");
		num = sc.nextInt();
		System.out.print("请输入连加的次数：");
		count = sc.nextInt();
		
		//用于放大一个数字的倍数
		long j = 1;
		long n = num;
		
		//循环，开始连加
		for ( int i = 0; i < count; i++ ) {
			sum += n;
			j *= 10;
			n = n + num * j;
		}
		
		System.out.println("整数连加的结果为：" + sum);
	}
}

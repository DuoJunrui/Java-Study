package com.syh.ex106;

import java.util.Scanner;

/**
 * 根据输入的值，判断是星期几。(分别用if语句和switch语句实现)，例如：<br/>
 * 输入：1<br/>
 * 输出：星期1
 */
public class PrintWeek {
	public static void main(String[] args) {
		System.out.print("请输入星期数字（1~12）：");
		
		switch (new Scanner(System.in).nextInt()) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
		default:
			System.out.println("您的输入有误！");
			break;
		}
	}
}

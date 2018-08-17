package com.syh.ex121;

import java.util.Scanner;

/**
 * 输入一行字符串，分别统计出其中英文字母、空格、数字和其它字符的个数
 */
public class StatisticsChar {
	public static void main(String[] args) {
		//用于存储用户输入的字符串
		String s = "";
		
		//提示用户进行输入
		System.out.println("请输入一串字符串：");
		s = new Scanner(System.in).nextLine();
		
		//用于统计的变量，此处我简单写为只统计字符以及数字，其他的做法都一致
		//统计字符
		int charCount = 0;
		//统计数字
		int numCount = 0;
		
		//循环，将字符串切分
		for (int i = 0; i < s.length(); i++) {
			if ( s.charAt(i) > '0' && s.charAt(i) < '9' ) {
				numCount++;
			} else {
				charCount++;
			}
		}
		
		System.out.println("数字有：" + numCount);
		System.out.println("其他字符有：" + charCount);
	}
}

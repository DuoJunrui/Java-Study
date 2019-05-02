package com.syh.ex103;

/**
 * 声明两个整型变量a,b,同时给a,b赋值，用三目运算比较a,b的大小，返回较大数，并在后台打印出来。
 */
public class PrintMaxNumber {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		System.out.println(a > b ? a : b);
	}
}

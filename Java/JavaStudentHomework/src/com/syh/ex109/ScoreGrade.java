package com.syh.ex109;

import java.util.Scanner;

/**
 * 编写一段程序，运行时向用户提问“你考了多少分？（0~100）”，接受输入后判断其等级并显示出来。
 * 判断依据：优 （90~100分）；良 （80~89分）；中 （60~79分）；差 （0~59分）；
 */
public class ScoreGrade {
	public static void main(String[] args) {
		System.out.print("你考了多少分？（0~100）：");
		//用于存储用户输入的分数
		int i = new Scanner(System.in).nextInt();
		
		if ( i <= 100 && i >= 90 ) {
			System.out.println("优");
		} else if ( i < 90 && i >= 80 ) {
			System.out.println("良");
		} else if ( i < 80 && i >= 60 ) {
			System.out.println("中");
		} else if ( i < 60 && i >= 0 )  {
			System.out.println("差");
		} else {
			System.out.println("你的成绩输入有误！");
		}
	} 
}

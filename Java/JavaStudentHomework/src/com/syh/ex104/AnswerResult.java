package com.syh.ex104;

import java.util.Scanner;

/**
 * 从键盘上输入两个整数，由用户回答它们的和，差，积，商和取余运算结果，并统计出正确答案的个数。
 */
public class AnswerResult {
	public static void main(String[] args) {
		//用于允许用户在控制台进行输入
		Scanner sc = new Scanner(System.in);
		//存储两个用于计算的变量
		int i = 0;
		int j = 0;
		
		//存储正确题目的个数
		int count = 0;
		
		//提示用户输入
		System.out.print("请输入一个整数：");
		i = sc.nextInt();
		System.out.print("请输入另一个整数：");
		j = sc.nextInt();
		
		System.out.print("请计算:" + i + " + " + j + " = ");
		//判断用户输入是否正确，若正确，则正确次数加1
		count += (sc.nextInt() == (i + j) ? 1 : 0);
		
		System.out.print("请计算:" + i + " - " + j + " = ");
		//判断用户输入是否正确，若正确，则正确次数加1
		count += (sc.nextInt() == (i - j) ? 1 : 0);
		
		System.out.print("请计算:" + i + " * " + j + " = ");
		//判断用户输入是否正确，若正确，则正确次数加1
		count += (sc.nextInt() == (i * j) ? 1 : 0);
		
		System.out.print("请计算:（保留整数）" + i + " / " + j + " = ");
		//判断用户输入是否正确，若正确，则正确次数加1
		count += (sc.nextInt() == (i / j) ? 1 : 0);
		
		System.out.print("请计算:" + i + " % " + j + " = ");
		//判断用户输入是否正确，若正确，则正确次数加1
		count += (sc.nextInt() == (i % j) ? 1 : 0);
		
		//输出结果
		System.out.println("您答对题目的个数为：" + count);
	}
}

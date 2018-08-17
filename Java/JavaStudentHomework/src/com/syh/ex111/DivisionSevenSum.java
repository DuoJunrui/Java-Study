package com.syh.ex111;
/**
 * 求出1~1000之间的所有能被7整除的数，计算并输出每5个的和。
 */
public class DivisionSevenSum {
	public static void main(String[] args) {
		int j = 1000;
		int num = 7;
		
		//用于连加
		int sum = 0;
		//用于判断五个数
		int count = 0;
		
		//循环，列出1~count所有的数字
		for ( int i = 1; i < j; i++ ) {
			//判断数字是否是能被7整除
			if ( i % num == 0 ) {
				System.out.print(i);
				//在sum中加上该数字
				sum += i;
				//其次数++
				count++;
				
				if( count == 5 ) {
					System.out.println(" = " + sum);
					sum = 0;
					i = i - ((count - 1) * 7);
					count = 0;
					continue;
				} else {
					System.out.print(" + ");
				}
			}
		}
	}
}

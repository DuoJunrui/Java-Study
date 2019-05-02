package com.syh.ex110;

public class PrimeNumber {
	public static void main(String[] args) {
		//判断该数字是否为质数
		boolean isPrime = false;
		
		//外层循环，输出所有的数字
		for ( int i = 2; i < 1001; i++ ) {
			for ( int j = 2; j <= i; j++  ) {
				//穷举当前数字与其之前的数字相除取余，若取余得0，且i与j不相同，此时说明当前数字不是质数，则结束当前循环
				if ( i % j == 0 && i != j ) {
					isPrime = false;
					break;
				}
				
				isPrime = true;
			}
			
			if ( isPrime ) {
				System.out.println(i);
			}
		}
	}
}

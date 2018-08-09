package day1.exercise;

import java.io.Console;

//求出1~1000之间的所有能被7整除的数，计算并输出每5个的和。
public class Ex0111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,count=0,sum=0;
		for( i=1;i<=1000;i++) {
			if(i%7==0) {
				sum=sum+i;
				count++;
				System.out.print(i+" ");
			}
			if(count==5) {
				System.out.println("这五个数的和是："+sum);
				sum=0;
				count=0;
			}
	
		}
	}

}

package day1.exercise;

import java.io.Console;

//���1~1000֮��������ܱ�7�������������㲢���ÿ5���ĺ͡�
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
				System.out.println("��������ĺ��ǣ�"+sum);
				sum=0;
				count=0;
			}
	
		}
	}

}

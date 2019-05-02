package day1.exercise;

import java.util.Scanner;

//写一条for语句，要求从键盘录入两个整形数字m和n，之后求出n~m的和。（例如，输入1和4，那么其和为1+2+3+4=10）
public class Ex0107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入两个整型数值m和n：");
		int m = in.nextInt();
		int n = in.nextInt();
		int sum=0,temp=0;
		
		if(m>n) {
			temp=m;
			m=n;
			n=temp;
		}
		
		for(int x=m;x<=n;x++) {
			sum=sum+x;
		}
		System.out.println("m是：" +m+ "\nn是：" +n+ "\n两数之间所有整数的和是：" +sum);
	}

}

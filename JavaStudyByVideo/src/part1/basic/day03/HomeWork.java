package part1.basic.day03;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("--------第1题------------");
		int a = 1, b = 10;
		int c1 = a++; 
		int c2 = ++b; 
		System.out.println("a=" + a + ", b=" + b + ", c1=" + c1 + ", c2=" + c2);
								//2         11               1              11

		System.out.println("--------第2题------------");
		int i = 100, j = 200;
		boolean b1 = (i > j) && (i++ > 100);
		System.out.println(b1); //false
		System.out.println(i); //100
		
		System.out.println("--------第3题------------");
		int a, b, c;
		a = b = c = 100;  
		System.out.println("a="+a+",b="+b+",c="+c); //都是100

		System.out.println("--------第4题------------");
		System.out.println(5+6+""+5+6); //"1156"
		*/
		
		/*
		System.out.println("--------第5题------------");
		System.out.println("");
		System.out.println("请输入两个整数：a,b (以空格隔开)");
		int a= scan.nextInt(), b= scan.nextInt();
		int max = a>b?a:b; //三目运算
		System.out.println("两个数的最大值为："+max);
		*/
		
		  //(注意没有按时做完)
		System.out.println("--------第6题------------");
		System.out.println("请输入三个整数：a,b,c (以空格隔开)");
		int a= scan.nextInt(), b= scan.nextInt(), c= scan.nextInt();
		System.out.println("您输入的是：a=" +a+ ",b=" +b+ ",c=" +c);
		
		if (a>b) {
			int temp = a;
			a=b;
			b=temp;
		}
		if (a>c) {
			int temp = a;
			a=c;
			c=temp;
		}
		if (b>c) {
			int temp = b;
			b=c;
			c=temp;
		}
		
		System.out.println("升序排列后：a=" +a+ ",b=" +b+ ",c=" +c);
		
		
		/*
		System.out.println("--------第7题------------");
		System.out.println("请输入一个年份：");
		int year = scan.nextInt();
		//System.out.println("您输入的是："+year+"年。");
		
		if ( (year%4==0 && year%100!=0) || year%400==0 ) {
			System.out.println(year+"是闰年");
		} else {
			System.out.println(year+"是平年");
		}
		*/
		
		/*
		System.out.println("--------第8题------------");
		System.out.println("请输入三个整数：a,b,c (以空格隔开)");
		int a= scan.nextInt(), b= scan.nextInt(), c= scan.nextInt();
		int max =a;
		if (max<b) {
			max=b;
		}
		if (max<c) {
			max=c;
		}
		System.out.println("最大值为："+max);
		*/
		
		scan.close();
	}

}

package part1.basic.day02;

import java.util.Scanner;

/**
 * 
 * @author: 多俊睿
 * @data: 2019年2月28日 下午7:16:42
 * @Description: TODO
 */

public class DataTypeDemo {

	public static void main(String[] args) {
		
		/**
		 * import java.util.Scanner;
		 * Scanner 的用法
		 * 获取用户输入的值
		 */
		System.out.println("------Scanner的用法---------");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入age的值：");
		int age = scan.nextInt();  //接收int型
		System.out.println("age="+age);
		
		System.out.print("请输入价格：");
		double price = scan.nextDouble();  //接收double型  等等······
		System.out.println("price="+price);
		
		
		/**
		 * 基本类型间的转换 练习
		 */
		System.out.println("------基本类型间的转换 练习--------");
		
		int aa = 5;
		long bb = aa; //自动类型换换 int -> long
		int cc = (int)bb; //强制类型转换 long -> int
		
		long dd = 10000000000L; 
		int ee = (int)dd; //强制类型转换
		System.out.println("ee="+ee); //溢出，强转可能会发生溢出
		
		double ff = 56.989;
		int gg = (int)ff; //强转，可能会损失精度
		System.out.println("gg="+gg);
		
		byte bb1 = 5;
		byte bb2 = 6;
		byte bb3 = (byte)(bb1+bb2);  //b1、b2参与运算，自动转为int，所以需要强转为byte
		
		System.out.println("-------比较不同的2+2--------");
		System.out.println(2+2);  //4
		System.out.println("2"+"2"); //22
		System.out.println('2'+'2'); //一旦参与运算，自动转为int型，'2'的ASCII码为50 50+50=100
		System.out.println('w'+'d');  //219    自动转为int型参与运算
		System.out.println('我'+'你');  //45425   自动转为int型参与运算

		/*
		 * boolean  char 练习
		 */
		System.out.println("----boolean  char 练习---------");
		
		boolean b1 = true;
		boolean b2 = false;
//		boolean b3 = 36; //只支持true和false,不支持其他
		
		char c1 = '男';
		char c2 = 'm';
		char c3 = 5;
		char c4 = ' ';
//		char c5 = ''; //必须要有字符，且只有一个
//	    char c6 = '男性'; //只能有一个字符
	    char c7 = 97;
	    System.out.println("c7="+ c7);
	    char c8 = '\'';  //进行转义
	    System.out.println("c8="+c8);

	 
	    /*
		 * int long double 练习
		 */

	    System.out.println("------------int long double 练习------------------");
	    
		int a = 25;
//		 int b = 10000000000; //编译错误，超出int范围
		 System.out.println(5/3); //结果为1
		 System.out.println(3/5); //结果为0
		 System.out.println(3.0/5); //结果为0.6
		 int c = 2147483647; 
		 c = c+1;
		 System.out.println("c="+c); //结果溢出，结果为-2147483648
		 
		 long d = 10000000000L;
		 long e = 1000000000*2*10L;
		 System.out.println("e="+e);//溢出 （排断错误，结果为：e=20000000000）
		 long f = 1000000000*3*10L;
		 System.out.println("f="+f);//溢出  f=-12949672960
		 long g = 1000000000L*3*10;
		 System.out.println("g="+g);//300亿
		 long test = 1000000000*3*10; //编译错误 （排断错误，溢出）  test=-64771072 (溢出)
		 System.out.println("test="+test);//
		 long h = System.currentTimeMillis();
		 System.out.println("h="+h); 
		 
		 double i = 3.14;
		 double j = 6.0, k = 4.9;
		 System.out.println("j-k="+ (j-k)); //1.0999999999999996
		 
		 
		 scan.close();
		 
	}

}

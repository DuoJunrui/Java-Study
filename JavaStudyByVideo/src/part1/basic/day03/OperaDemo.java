package part1.basic.day03;
/**
 * 
 * @author: 多俊睿
 * @data: 2019年3月1日 上午11:39:10
 * @Description: 运算符
 */
public class OperaDemo {

	public static void main(String[] args) {
		
		/**
		 * 逻辑运算符练习
		 */
		 
		
		/**
		 * 关系运算符练习
		 */
		System.out.println("---------关系运算符---------");
		
		int num1=5, num2=10, num3=5;
		boolean nn = num1 > num2;
		System.out.println(nn); //false
		System.out.println(num1<num2); //true
		System.out.println(num2>=num3); //true
		System.out.println(num1<=num3); //true
		System.out.println(num1==num3); //true
		System.out.println(num1!=num3); //false
		System.out.println(num1%2==0); //false
		System.out.println(num2%2==0); //true
		
		/*
		 * 算数运算符的练习
		 */
		System.out.println("-------算数运算符的练习--------");
		
		System.out.println(5%3); //2
		System.out.println(6%3); //0
		System.out.println(3%5); //3
		
		int a = 5;
		a++;
		System.out.println("a="+a); //6
		
		int b = 5;
		++b;
		System.out.println("b="+b); //6
		
		int c =5;
		int d = c++;
		System.out.println("c="+c); //6
		System.out.println("d="+d); //5
		
		int e = 5;
		int f = ++e;
		System.out.println("e="+e); //6
		System.out.println("f="+f); //6
		
		int g = 5, h = 5;
		System.out.println("g--="+(g--)); //5
		System.out.println("--h="+(--h)); //4
		
		/**
		 * 重点： ++i和i++的区别 辨析
		 */
		System.out.println("------++i和i++的区别 辨析-----------");
		//int a;
		int y=0;    
	    y=++y;
	    y=++y;
	    y=++y;
	    //a=++y;
	    y=++y;
	    y=++y;
	   // System.out.println("a="+a);
	    System.out.println("y="+y);  //5
	    
	    //int b=0;
		int i =0;
	    i=i++;
	    i=i++; 
	    i=i++;
	    i=i++;
	    i=i++;
	    //System.out.println("b="+b);
	    System.out.println("i="+i);  //0

	}

}

package part1.basic.day03;

import java.util.Scanner;

/**
 * 
 * @author: 多俊睿
 * @data: 2019年2月28日 下午11:07:39
 * @Description: day课后作业一
 */
public class AgeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 赋值、字符串连接、三目的练习
		 */
		System.out.println("------------赋值、字符串连接、三目的练习---------------");
		int a=5;
		a += 10;
		System.out.println("a1="+a); //15
		a *= 3;
		System.out.println("a2="+a); //45
		a /= 5;
		System.out.println("a3="+a); //9
		
		int age = 37;
		System.out.println("age="+age);
		System.out.println("我的年龄是："+age);
		System.out.println("我今年"+age+"岁了");
		
		System.out.println(10+20+""+30);//"3030"
		System.out.println(""+10+20+30);//"102030"
		
		int b=5, c=8;
		int max = b>c?b:c; //三目运算
		System.out.println("最大值max="+max);//max=8
		
		
		System.out.println("-------我是分割线-------------");
		Scanner userInput = new Scanner(System.in);
		System.out.print("请输入你的年龄：");
		int age2 = userInput.nextInt();
		System.out.println("age="+age2);
		
		System.out.println("排断你的年龄是否在18~50之间。");
		System.out.println(age2>=18 && age2<=50);
	
	
		/**
		 * 关系、逻辑运算综合练习
		 */
		System.out.println("--------关系、逻辑运算综合练习-----------");
		
		int q=5, w=10, e=5;
		System.out.println("------&&短路逻辑与运算--------");
		System.out.println(q<w && q==e); //true && true = true
		System.out.println(q>w && w!=e); //false && true = false  //&&发生短路
		System.out.println(q<=e && w<e); //true && false = false  
		System.out.println(q>=w && q>e); //false && false = false  //发生短路
		
		System.out.println("------||短路逻辑或运算--------");
		System.out.println(q==e || q!=e); //true || false = true //发生短路
		System.out.println(q!=w || w>e); //true || true = true //发生短路
		System.out.println(q<e || w<=e); //false || false = false 
		System.out.println(w>=q || e==q); //true || true =true //发生短路
		
		System.out.println("------！ 非运算--------");
		System.out.println(!(q<w)); //!true=false
		System.out.println(!(w<q)); //!false=true
		
		System.out.println("------&&短路--------");
		System.out.println(q<w && w<e++); //true && false = false 
		System.out.println("第一个e="+e); //e=6
		System.out.println((q+1)!=e && (e++)<w); //false && 短路 = false
		System.out.println("第二个e="+e); //6
		
		System.out.println("------||短路--------");
		System.out.println(q<w || w>e++); //true || 短路 = true
		System.out.println("第三个e="+e); //6
		
	
		userInput.close();
	
	}

}

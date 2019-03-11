package part3.se.day01.string;
/**
 * 
 * @author: 多俊睿
 * @data: 2019年3月11日 下午7:36:28
 * @Description: String 的介绍
 */
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "123abc";
		String s2 = "123abc";
		String s3 = "123abc";
		
		//s2,s3重用s1创建的字符串对象
		//表明s1、s2和s3共用同一个内存（对象）
		System.out.println(s1==s2);  //true
		System.out.println(s1==s3);  //true
		
		//修改内容会创建新的对象
		s1 = "888888asasa"; 
		System.out.println(s1); //888888asasa
		System.out.println(s2); //123abc
		System.out.println(s3); //123abc
		System.out.println(s1==s2);  //false
		System.out.println(s2==s3); //true
		
		//虽然内容一样，但是new了 会创建一个新对象
		String s4 = new String("123abc");
		System.out.println(s2==s4); //false
		
		/**
		 * 编译器有一个优化措施：
		 * 当一个计算表达式计算符号两边都是字面量（直接量）时，
		 * 编译器会直接将结果计算出来并替代原来的表达式，
		 * 所以JVM在运行class文件时，看到下面的代码被编译器改为了：
		 * String s5 = "123abc"
		 * 所以会重用上面s2的对象
		 */
		
		String s5 = "123" + "abc";
		System.out.println(s2==s5); //true
		
		//改变内容会创建新的对象
		String s = "123";
		String s6 = s+ "abc";
		System.out.println(s2==s6); //false
	}

}

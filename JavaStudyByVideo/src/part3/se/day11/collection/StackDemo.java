package part3.se.day11.collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: 多俊睿
 * @data: 2019年3月26日 下午7:32:39
 * @Description: 栈结构
 * 栈可以保存一组元素，存取元素必须遵循先进后出原则
 * java.util.Deque支持栈操作，提供了对应的方法。
 */
public class StackDemo {

	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<String>();
		
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		stack.push("five");
		System.out.println(stack);
		
		String str = stack.pop();
		System.out.println(str);
		System.out.println(stack);
		
		for (String s : stack) {
			System.out.println(s);
		}
		System.out.println(stack);

	}

}

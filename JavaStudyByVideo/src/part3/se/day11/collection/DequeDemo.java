package part3.se.day11.collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: 多俊睿
 * @data: 2019年3月26日 下午5:36:09
 * @Description: java.util.Deque 双端队列
 * Deque接口继承自Queue， 双端队列是两端都可以做进出队操作的队列
 * 常用实现类： java.util.LinkedList
 */
public class DequeDemo {

	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();
		deque.offer("one");
		deque.offer("two");
		System.out.println(deque);
		
		deque.offerFirst("three");
		System.out.println(deque);
		
		deque.offerLast("four");
		System.out.println(deque);
		
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-");
		String str = deque.poll();
		System.out.println(str);
		System.out.println(deque);
		
		str = deque.peekLast();
		System.out.println(str);
		System.out.println(deque);
		
		str = deque.pollFirst();
		System.out.println(str);
		System.out.println(deque);
	}

}

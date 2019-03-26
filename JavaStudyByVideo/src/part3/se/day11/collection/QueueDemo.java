package part3.se.day11.collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author: 多俊睿
 * @data: 2019年3月26日 下午5:02:31
 * @Description: java.util.Queue
 * 队列
 * 队列可以存放一组元素，但是必须按照先进先出的原则。
 * Queue是一个接口，其继承自Collection，所以队列也具有集合的特性。
 * add, size等方法依然可用。
 * 
 * Queue也提供了一组进出对的方法。
 * 常用实现了为：java.util.LinkedList
 */
public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		//入队操作
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		queue.offer("five");
		System.out.println(queue);
		
		//出队操作 出队后从原有队列删除
		String str = queue.poll();
		System.out.println(str);
		System.out.println(queue);
		
		//引用队首元素  查看首个元素，但是元素还在队列
		str = queue.peek();
		System.out.println(str);
		System.out.println(queue);
		
		//遍历队列可以使用迭代器（新循环） 遍历不会影响队列中的元素
		for(String s : queue) {
			System.out.println(s);
		}
		System.out.println(queue);
	}

}

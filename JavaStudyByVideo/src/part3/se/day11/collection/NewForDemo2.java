package part3.se.day11.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author: 多俊睿
 * @data: 2019年3月21日 下午1:11:11
 * @Description: 使用新循环遍历集合
 */
public class NewForDemo2 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		
		/**
		 * 新循环遍历集合就是迭代器遍历集合，
		 * 所以在遍历过程中不能通过集合的方法增删元素
		 * 集合增删元素建议用迭代器的remove方法
		 */
		
		for (Object o : c) {
			String str = (String)o;
			System.out.println(str);
		}
	}

}

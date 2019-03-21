package part3.se.day11.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 多俊睿
 * @data: 2019年3月21日 下午3:46:17
 * @Description: java.util.List接口
 * List是可以重复集且有序，提供了一组可以通过下标操作元素的方法。
 * 常用实现类：
 * java.util.ArrayList
	内部由数组实现，查询效率更好
 * 
 * java.util.LinkedList
 * 内部由链表实现，增删效率更好，首尾增删元素效率最好
 */
public class ListDemo1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println(list);
		
		/*
		 * E get(int index)
		 * 获取指定位置对应的元素
		 */
		//获取第二个元素
		String str = list.get(1);
		System.out.println(str);
		
		for (int i = 0; i < list.size(); i++) {
			str = list.get(i);
			System.out.println(str);
		}
		
		/**
		 * E set(int index, E e)
		 * 将指定元素设置到指定位置，返回值为原位置对应的元素
		 * set方法的实际意义是替换元素操作
		 */
		String old = list.set(1, "2");
		System.out.println(list);
		System.out.println("old:" +old);
	}

}

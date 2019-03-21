package part3.se.day11.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author: 多俊睿
 * @data: 2019年3月21日 下午7:48:05
 * @Description: 集合转数组
 * Collection提供了方法：toArray
 * 该方法可以将当前集合转换为一个数组
 */
public class CollectionToArraryDemo {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		System.out.println(c);
		
//		Object[] array2 = c.toArray();
//		System.out.println(Arrays.toString(array2)); //一边用下面的这个方法
		
		String[] array = c.toArray( new String[c.size()]);
		System.out.println("len:" +array.length);
		System.out.println(Arrays.toString(array));
		
	}

}

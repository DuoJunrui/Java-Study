package part3.se.day11.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author: 多俊睿
 * @data: 2019年3月21日 上午10:32:55
 * @Description: 集合间的操作
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("java");
		c.add("c");
		c.add(".net");
		System.out.println("List-c:"+c);
		
		Collection c2 = new HashSet();
		c2.add("php");
		c2.add("Android");
		c2.add("java");
		System.out.println("Set-c2:" + c2);
		
		/**
		 * boolean addAll(Collection c)
		 * 将给定集合中的所有元素添加到当前集合中
		 */
		c.addAll(c2);
		System.out.println("List-c:" + c); //List集合允许有重复元素
		
		c2.addAll(c);
		System.out.println("Set-c2:" + c2); //Set集合不能有重复元素
		
		Collection c3 = new ArrayList();
		c3.add("c");
		c3.add("Android");
		c3.add("c++");
		System.out.println("c3:"+c3);
		
		/**
		 * boolean containsAll(Collection c)
		 * 判断当前集合是否包含给定集合中的所有元素
		 */
		boolean containsAll = c.containsAll(c3);
		System.out.println("全包含："+containsAll);
		
		System.out.println("c:"+c);
		System.out.println("c3"+c3);
		c.removeAll(c3);
		System.out.println("c:"+c);
		
		
	}
}

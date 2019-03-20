package part3.se.day10.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author: 多俊睿
 * @data: 2019年3月20日 下午1:50:35
 * @Description: java.util.Collection
 * Collection是所有集合的顶级接口，规定了所有集合都 应当具备的方法。
 * 其下有两个常用的派生接口：
 * java.util.List: 可重复集合，并且有序
 * java.util.Set: 不可重复集合
 * 重复指的是元素是否可以重复，
 * 而重复的标准是元素自身equals比较的结果是否为true
 */
public class CollectionDemo1 {

	public static void main(String[] args) {
		/**
		 * boolean add(E e)
		 * 向当前集合中添加一个元素，成功添加则返回true
		 */
		Collection c = new ArrayList();
		c.add("第一");
		c.add("第二");
		c.add("第三");
		c.add("第四");
		c.add("第五");
		System.out.println(c);
		
		/**
		 * int size()
		 * 返回当前集合元素的个数
		 */
		int size = c.size(); //当前集合里面元素的个数 
		System.out.println("size:" + size);
		
		/**
		 * boolean isEmpty()
		 * 判断当前集合是否为空集（不含有任何元素）
		 */
		boolean isEmpty = c.isEmpty();
		System.out.println("isEmpty:" + isEmpty);
		
		/**
		 * 清空集合
		 */
		c.clear();
		System.out.println(c);
		System.out.println("size:" + c.size());
		System.out.println("isEmpty:" + c.isEmpty());
	}

}

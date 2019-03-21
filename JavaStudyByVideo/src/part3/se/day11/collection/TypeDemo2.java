package part3.se.day11.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author: 多俊睿
 * @data: 2019年3月21日 下午2:59:56
 * @Description: 泛型常见面试题
 */
public class TypeDemo2 {

	public static void main(String[] args) {
		
		Collection<Integer> c1 = new ArrayList<Integer>();
		//编译器检测add的参数是否为Integer
		c1.add(1);
		c1.add(2);
		c1.add(3);
		
		//编译不通过，实参与c1的泛型不匹配
		//c1.add("four");
		for (int i : c1) {
			System.out.println(i);
		}
		System.out.println("c1:"+c1);
		
		/**
		 * 不指定泛型时，默认为原型Object
		 * 所以以c2的角度看待c1的集合时，元素就按照Object看待
		 */
		Collection c2 = c1;
		c2.add("four");
		System.out.println("c2:"+c2);
		
		//再次遍历c1时会出现造型异常
		for (int i : c1) {
			System.out.println(i);
		}
		System.out.println("c1:"+c1);
	}

}

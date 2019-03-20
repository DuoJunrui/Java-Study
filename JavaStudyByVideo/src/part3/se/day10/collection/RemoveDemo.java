package part3.se.day10.collection;
import java.util.ArrayList;
import java.util.Collection;
/**
 * @author: 多俊睿
 * @data: 2019年3月20日 下午2:33:29
 * @Description: 删除集合元素
 */
public class RemoveDemo {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1, 2));
		c.add(new Point(3, 4));
		c.add(new Point(5, 6));
		c.add(new Point(7, 8));
		c.add(new Point(1, 2));
		System.out.println(c);
		
		/**
		 * remove()方法也会用equals对比，如果为true则删除
		 * remove只删除第一个找到的元素
		 */
		Point p = new Point(1, 2);
		c.remove(p);
		System.out.println(c);
	}

}

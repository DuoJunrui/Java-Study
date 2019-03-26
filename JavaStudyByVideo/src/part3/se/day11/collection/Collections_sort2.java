package part3.se.day11.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import part3.se.day10.collection.Point;

/**
 * @author: 多俊睿
 * @data: 2019年3月26日 上午10:27:25
 * @Description: 排序自定义元素的集合
 */
public class Collections_sort2 {

	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(5, 6));
		list.add(new Point(1, 8));
		list.add(new Point(3, 12));
		list.add(new Point(2, 5));
		list.add(new Point(4, 3));
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);

	}

}

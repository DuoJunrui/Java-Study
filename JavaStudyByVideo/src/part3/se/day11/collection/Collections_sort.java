package part3.se.day11.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author: 多俊睿
 * @data: 2019年3月21日 下午8:21:22
 * @Description: 集合的排序
 * 集合的工具类：java.util.Collections
 * 提供了很多静态方法，便于操作集合
 */
public class Collections_sort {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(random.nextInt(100));
		}
		System.out.println("oldList:"+list);
		
		//排序
		Collections.sort(list);
		System.out.println("sortList:"+list);
		
		//乱序
		Collections.shuffle(list);
		System.out.println("shuffleList:"+list);
	}

}

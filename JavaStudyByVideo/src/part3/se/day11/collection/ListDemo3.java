package part3.se.day11.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 多俊睿
 * @data: 2019年3月21日 下午7:12:09
 * @Description: 获取子集
 */
public class ListDemo3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println("list:"+list);
		
		/**
		 * List subList(int s, int e)
		 * 获取指定范围内的子集
		 */
		//获取3-7
		List<Integer> subList = list.subList(3, 8);
		System.out.println("subList:"+subList);
		
		//将子集中每个元素扩大10倍
		for (int i = 0; i < subList.size(); i++) {
			int d = subList.get(i);
			d = d*10;
			subList.set(i, d);
		}
		System.out.println(subList);
		/**
		 * 对子集操作就是对原集合对应的元素操作
		 */
		System.out.println(list);
		
		//删除2-8
		list.subList(2, 9).clear();
		System.out.println(list);
	}

}

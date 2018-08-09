package day6.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex0133 {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<String, Integer>();// 可以key值进行排序
		Random ran = new Random();
		
		map.put("小明", ran.nextInt(100));
		map.put("小张", ran.nextInt(100));
		map.put("小大", ran.nextInt(100));
		map.put("小的",ran.nextInt(100));
		map.put("小方", ran.nextInt(100));
		map.put("水电", ran.nextInt(100));
		map.put("小二", ran.nextInt(100));
		map.put("小三", ran.nextInt(100));
		map.put("小长", ran.nextInt(100));
		map.put("小我",ran.nextInt(100));
		
		
		Set<?> entrySet = map.entrySet();
		List<Entry> list = new ArrayList<Entry>();
		for (Object o : entrySet) {
			Map.Entry ent = (Entry) o;
			list.add(ent);

		}
		Collections.sort(list, new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				if (o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
					Map.Entry e1 = (Entry) o1;
					Map.Entry e2 = (Entry) o2;
					return -((Integer) e1.getValue()).compareTo((Integer) e2.getValue());
				}
				return 0;
			}

		});
		
		System.out.println("按分数高低排序如下：");
		for (int i = 0; i < 10; i++) {
			
			System.out.println(list.get(i));

		}

	}

}
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
		Map<String, Integer> map = new TreeMap<String, Integer>();// ����keyֵ��������
		Random ran = new Random();
		
		map.put("С��", ran.nextInt(100));
		map.put("С��", ran.nextInt(100));
		map.put("С��", ran.nextInt(100));
		map.put("С��",ran.nextInt(100));
		map.put("С��", ran.nextInt(100));
		map.put("ˮ��", ran.nextInt(100));
		map.put("С��", ran.nextInt(100));
		map.put("С��", ran.nextInt(100));
		map.put("С��", ran.nextInt(100));
		map.put("С��",ran.nextInt(100));
		
		
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
		
		System.out.println("�������ߵ��������£�");
		for (int i = 0; i < 10; i++) {
			
			System.out.println(list.get(i));

		}

	}

}
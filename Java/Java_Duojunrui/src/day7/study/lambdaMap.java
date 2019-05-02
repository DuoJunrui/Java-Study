package day7.study;

import java.util.HashMap;
import java.util.Map;

public class lambdaMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 1);
		items.put("B", 2);
		items.put("C", 3);
		items.put("D", 4);
		items.put("E", 5);
		items.put("F", 6);
		
		System.out.println("使用lambda表达式的foreach循环");
		items.forEach(
				(k,v)->{System.out.println("Item：" + k + "  Count ："+v);}
				
				);
		
		
		System.out.println("\n使用for循环");
		for(Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item：" +entry.getKey()+ "  Count：" +entry.getValue());
		}
		

	}

}

package day7.study;

import java.util.ArrayList;
import java.util.List;

public class lambdaList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> counts = new ArrayList<>();
		counts.add("001");
		counts.add("002");
		counts.add("003");
		counts.add("004");
		counts.add("005");
		counts.add("006");
		
		System.out.println("使用lambda表达式的foreach循环");
		counts.forEach(count ->{
			System.out.println(count);
		});

		System.out.println("\n使用for循环");
		for(String count : counts) {
			System.out.println(count);
		}
		
		
	}

}

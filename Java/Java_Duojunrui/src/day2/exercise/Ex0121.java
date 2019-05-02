package day2.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex0121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //从控制台输入一个字符串
        Scanner sc= new Scanner(System.in);

        System.out.println("请输入一个字符串:");

        String s = sc.nextLine();

        //创建一个Map 用于存储数据
        Map<String,Integer>map = new HashMap<String,Integer>();

        //将字符与出现次数联系
        for(int i = 0; i < s.length(); i++){

             String perStr = s.substring(i, i+1);

             if(map.containsKey(perStr)){

                  Integer num = map.get(perStr);

                  map.put(perStr, num + 1);

             }else{

                  map.put(perStr, 1);

             }

        }

        //用map输出
        Set<Map.Entry<String,Integer>> set= map.entrySet();
      
        for(Map.Entry<String,Integer> entry: set){
        
        	System.out.println(entry.getKey()+ "出现了:" + entry.getValue()+"次");

        }
    }
}


package day2.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex0121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //�ӿ���̨����һ���ַ���
        Scanner sc= new Scanner(System.in);

        System.out.println("������һ���ַ���:");

        String s = sc.nextLine();

        //����һ��Map ���ڴ洢����
        Map<String,Integer>map = new HashMap<String,Integer>();

        //���ַ�����ִ�����ϵ
        for(int i = 0; i < s.length(); i++){

             String perStr = s.substring(i, i+1);

             if(map.containsKey(perStr)){

                  Integer num = map.get(perStr);

                  map.put(perStr, num + 1);

             }else{

                  map.put(perStr, 1);

             }

        }

        //��map���
        Set<Map.Entry<String,Integer>> set= map.entrySet();
      
        for(Map.Entry<String,Integer> entry: set){
        
        	System.out.println(entry.getKey()+ "������:" + entry.getValue()+"��");

        }
    }
}


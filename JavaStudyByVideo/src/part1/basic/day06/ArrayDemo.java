package part1.basic.day06;

import java.util.Arrays;
/**
 * 
 * @author: 多俊睿
 * @data: 2019年3月3日 下午12:47:16
 * @Description: 数组的排序
 */
public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] arr = new int[] {25,36,2,99,1};
		
		/**
		 * Java提供的Array排序方法，默认升序排列
		 */
		System.out.println("-----Java自带方法，升序排列完成------");
		Arrays.sort(arr); //默认升序排列
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		//冒泡排序
		System.out.println("-----冒泡排序 （升序）------");
		for (int i = 0; i < arr.length-1; i++) {  //arr.length-1 控制要排几轮  5-1=4  0 1 2 3 (4轮)注意 0 也是1轮
			for (int j = 0; j < arr.length-1-i; j++) {  //arr.length-1-i 控制每轮比的次数
				//进行比较,前一个和后一个比较  （升序排列）
				if (arr[j]>arr[j+1]) {  //里面进行交换
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}//排序完成
		//输出排序后的结果
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("排序结束。");
		

	}

}
